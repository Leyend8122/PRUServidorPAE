package com.example.demo.model;

public class UsuarioModel {
    private int codUsuario;
    private int codTipoProfesional;
    private String defTipProfesional;
    private String defNombreProfesional;


    public int getCodUsuario() {
        return this.codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public int getCodTipoProfesional() {
        return this.codTipoProfesional;
    }

    public void setCodTipoProfesional(int codTipoProfesional) {
        this.codTipoProfesional = codTipoProfesional;
    }

    public String getDefTipProfesional() {
        return this.defTipProfesional;
    }

    public void setDefTipProfesional(String defTipProfesional) {
        this.defTipProfesional = defTipProfesional;
    }

    public String getDefNombreProfesional() {
        return this.defNombreProfesional;
    }

    public void setDefNombreProfesional(String defNombreProfesional) {
        this.defNombreProfesional = defNombreProfesional;
    }


    public UsuarioModel() {
    }


    public UsuarioModel(int codUsuario, int codTipoProfesional, String defTipProfesional, String defNombreProfesional) {
        this.codUsuario = codUsuario;
        this.codTipoProfesional = codTipoProfesional;
        this.defTipProfesional = defTipProfesional;
        this.defNombreProfesional = defNombreProfesional;
    }


}
