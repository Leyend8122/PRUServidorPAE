package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Instituciones;
import com.example.demo.repository.reponsableiiRepositorio;

@RestController
@RequestMapping("/Instituciones")
public class IntitucionesControler {

      private final reponsableiiRepositorio reponsableiiRepositorio;

    public IntitucionesControler(reponsableiiRepositorio reponsableiiRepositorio){
        this.reponsableiiRepositorio = reponsableiiRepositorio;
    }

    @PostMapping( value = "/ConsultaInstituciones",consumes = {"multipart/form-data"})
    public List<Instituciones> obtenerInstituciones (){
        return reponsableiiRepositorio.obtenerInstituciones();
    }

}
