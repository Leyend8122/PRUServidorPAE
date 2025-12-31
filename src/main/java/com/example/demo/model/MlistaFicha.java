package com.example.demo.model;

public class MlistaFicha {
    private Integer codigoFicha;
    private String nombreFicha;
    private String nombreResponsable;
    private String nombreInstitucion;
    private String departamento;
    private String provincia;
    private String distrito;
    private Integer resultado;
    private Integer estado;
    private String fechaRegistro;



    public Integer getCodigoFicha() {
        return this.codigoFicha;
    }

    public void setCodigoFicha(Integer codigoFicha) {
        this.codigoFicha = codigoFicha;
    }

    public String getNombreFicha() {
        return this.nombreFicha;
    }

    public void setNombreFicha(String nombreFicha) {
        this.nombreFicha = nombreFicha;
    }

    public String getNombreResponsable() {
        return this.nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public String getNombreInstitucion() {
        return this.nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return this.provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return this.distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public Integer getResultado() {
        return this.resultado;
    }

    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }

    public Integer getEstado() {
        return this.estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public String getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }



    public MlistaFicha(Integer codigoFicha, String nombreFicha, String nombreResponsable, String nombreInstitucion, String departamento, String provincia, String distrito, Integer resultado, Integer estado, String fechaRegistro) {
        this.codigoFicha = codigoFicha;
        this.nombreFicha = nombreFicha;
        this.nombreResponsable = nombreResponsable;
        this.nombreInstitucion = nombreInstitucion;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.resultado = resultado;
        this.estado = estado;
        this.fechaRegistro = fechaRegistro;
    }

   

    public MlistaFicha() {
    }


}
