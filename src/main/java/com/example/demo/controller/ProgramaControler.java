package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CUsuarioModel;
import com.example.demo.model.UsuarioModel;

import com.example.demo.repository.UsuarioRepositorio;

import tools.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/programa")
public class ProgramaControler {
    
    private final UsuarioRepositorio usuariorepositorio;

    public ProgramaControler(UsuarioRepositorio usuarioRepositorio){
        this.usuariorepositorio = usuarioRepositorio;
    }

    @PostMapping( value = "/validacion_usuario",consumes = {"multipart/form-data"})
    public List<UsuarioModel> validacion_usuario (@RequestParam String Cuerpo){
        ObjectMapper mapper = new ObjectMapper();
        CUsuarioModel usuario = mapper.readValue(Cuerpo, CUsuarioModel.class);
        return usuariorepositorio.validacion_usuario(usuario);
    }




}
