package com.example.demo.model;

public class CUsuarioModel {
    private String usuario;
    private String contrasena;


    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return this.contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }


    public CUsuarioModel() {
    }


    public CUsuarioModel(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

}
