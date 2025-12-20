package com.example.demo.controller;


import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CabeceraFicha;
import com.example.demo.model.DetalleFicha;
import com.example.demo.repository.FichaRepositorio;


@RestController
@RequestMapping("/fichas")
public class FichasControler {
    
    private final FichaRepositorio fichasRepositorio;

    public FichasControler(FichaRepositorio fichasRepositorio){
        this.fichasRepositorio = fichasRepositorio;
    }

     @PostMapping( value = "/Aperturas",consumes = {"multipart/form-data"})
    public int Apertura_Ficha (@RequestParam int codigoUsuario){
        return fichasRepositorio.Aperturar_Ficha(codigoUsuario);
    }

    @PostMapping( value = "/ConsultaCabecera",consumes = {"multipart/form-data"})
    public List<CabeceraFicha> Consulta_Cabecera (@RequestParam int codigoFicha){
        return fichasRepositorio.Consulta_Cabecera(codigoFicha);
    }

    @PostMapping( value = "/ConsultaDetalle",consumes = {"multipart/form-data"})
    public List<DetalleFicha> Consulta_Detalle (@RequestParam int codigoFicha){
        return fichasRepositorio.Consulta_Detalle(codigoFicha);
    }




}
