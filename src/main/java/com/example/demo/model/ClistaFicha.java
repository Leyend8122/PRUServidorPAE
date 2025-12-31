package com.example.demo.model;

public class ClistaFicha {
    private Integer ano_;
    private Integer mes_;
    private Integer registra_;
    private String ficha_;


    public Integer getAno_() {
        return this.ano_;
    }

    public void setAno_(Integer ano_) {
        this.ano_ = ano_;
    }

    public Integer getMes_() {
        return this.mes_;
    }

    public void setMes_(Integer mes_) {
        this.mes_ = mes_;
    }

    public Integer getRegistra_() {
        return this.registra_;
    }

    public void setRegistra_(Integer registra_) {
        this.registra_ = registra_;
    }

    public String getFicha_() {
        return this.ficha_;
    }

    public void setFicha_(String ficha_) {
        this.ficha_ = ficha_;
    }


    public ClistaFicha(Integer ano_, Integer mes_, Integer registra_, String ficha_) {
        this.ano_ = ano_;
        this.mes_ = mes_;
        this.registra_ = registra_;
        this.ficha_ = ficha_;
    }


    public ClistaFicha() {
    }


}
