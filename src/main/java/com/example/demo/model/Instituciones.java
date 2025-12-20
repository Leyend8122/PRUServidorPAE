package com.example.demo.model;

public class Instituciones {
        private Integer pie_id;
        private String pie_definicion;
        private String ub_nombdep;
        private String ub_nombprov;
        private String ub_nombdist;


    public Integer getPie_id() {
        return this.pie_id;
    }

    public void setPie_id(Integer pie_id) {
        this.pie_id = pie_id;
    }

    public String getPie_definicion() {
        return this.pie_definicion;
    }

    public void setPie_definicion(String pie_definicion) {
        this.pie_definicion = pie_definicion;
    }

    public String getUb_nombdep() {
        return this.ub_nombdep;
    }

    public void setUb_nombdep(String ub_nombdep) {
        this.ub_nombdep = ub_nombdep;
    }

    public String getUb_nombprov() {
        return this.ub_nombprov;
    }

    public void setUb_nombprov(String ub_nombprov) {
        this.ub_nombprov = ub_nombprov;
    }

    public String getUb_nombdist() {
        return this.ub_nombdist;
    }

    public void setUb_nombdist(String ub_nombdist) {
        this.ub_nombdist = ub_nombdist;
    }


    public Instituciones() {
    }


    public Instituciones(Integer pie_id, String pie_definicion, String ub_nombdep, String ub_nombprov, String ub_nombdist) {
        this.pie_id = pie_id;
        this.pie_definicion = pie_definicion;
        this.ub_nombdep = ub_nombdep;
        this.ub_nombprov = ub_nombprov;
        this.ub_nombdist = ub_nombdist;
    }



}
