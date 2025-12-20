package com.example.demo.repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.example.demo.model.CabeceraFicha;
import com.example.demo.model.DetalleFicha;

@Repository
public class FichaRepositorio {

     private final JdbcTemplate jdbcTemplate;

    public FichaRepositorio(JdbcTemplate jdbcTemplate){
            this.jdbcTemplate = jdbcTemplate;
    }
    
    public int Aperturar_Ficha(int codigoUsuaerio){
             return jdbcTemplate.queryForObject(
        "CALL Inicializacion_ficha(?)",
        new Object[]{codigoUsuaerio},
        Integer.class
        );
    }

    public List<CabeceraFicha> Consulta_Cabecera(Integer codigoFicha){
            return jdbcTemplate.query(
                    "CALL consulta_FichaEsp(?, ?)",
                    new Object[]{codigoFicha,"CABE"},
                    (rs, rowNum) -> {
                        CabeceraFicha cabecera = new CabeceraFicha();
                        cabecera.setPf_definicion(rs.getString("pf_definicion"));
                        cabecera.setPf_id(rs.getObject("pf_id",Integer.class));
                        cabecera.setPie_id(rs.getObject("pie_id",Integer.class));
                        cabecera.setPf_fecha_ini(rs.getDate("pf_fecha_ini"));
                        cabecera.setPf_fecha_fin(rs.getDate("pf_fecha_fin"));
                        cabecera.setPf_nummanipuladores(rs.getObject("pf_nummanipuladores",Integer.class));
                        cabecera.setPf_ubiseralimentacion(rs.getString("pf_ubiseralimentacion"));
                        cabecera.setPf_racionesrecibieron(rs.getObject("pf_racionesrecibieron",Integer.class));
                        cabecera.setPf_derracionesrecibieron(rs.getString("pf_derracionesrecibieron"));
                        cabecera.setPf_resultado(rs.getObject("pf_resultado",Integer.class));
                        cabecera.setPf_nusuarios(rs.getObject("pf_nusuarios",Integer.class));
                        cabecera.setPf_estado(rs.getObject("pf_estado",Integer.class));
                        cabecera.setPf_ultimoHito(rs.getObject("pf_ultimoHito",Integer.class));
                        cabecera.setPfObservacionesGeneral(rs.getString("pf_observacionGeneral"));
                        cabecera.setPr_id(rs.getObject("pr_id",Integer.class));
                        // agrega más campos según tu procedimiento
                        return cabecera;
                    }
                );

    }

    public List<DetalleFicha> Consulta_Detalle(Integer codigoFicha){
            return jdbcTemplate.query(
                    "CALL consulta_FichaEsp(?, ?)",
                    new Object[]{codigoFicha,"DET"},
                    (rs, rowNum) -> {
                        DetalleFicha detalle = new DetalleFicha();
                        detalle.setPp_id(rs.getObject("pp_id",Integer.class));
                        detalle.setPdf_cumplimiento(rs.getObject("pdf_cumplimiento",Integer.class));
                        detalle.setPdf_observacion(rs.getString("pdf_observacion"));
                        detalle.setPdf_posicion(rs.getString("pdf_posicion"));
                        detalle.setPdf_cantidad(rs.getObject("pdf_cantidad",Integer.class));
                        detalle.setPdf_estado(rs.getObject("pdf_estado",Integer.class));
                        detalle.setPdf_material(rs.getObject("pdf_material",Integer.class));
                        detalle.setPdf_material_esp(rs.getString("pdf_material_esp"));
                        detalle.setPdf_vigencia(rs.getObject("pdf_vigencia",Integer.class));
                        detalle.setPdf_fecha_caducidad(rs.getString("pdf_fecha_caducidad"));
                        detalle.setPdf_tipo_cocina(rs.getObject("pdf_tipo_cocina",Integer.class));
                        detalle.setPdf_tipo_cocina_esp(rs.getString("pdf_tipo_cocina_esp"));
                        detalle.setPdf_limpio(rs.getObject("pdf_limpio",Integer.class));
                        detalle.setPdf_desinfectado(rs.getObject("pdf_desinfectado",Integer.class));
                        detalle.setPdf_otro_ambpreparacion(rs.getString("pdf_otro_ambpreparacion"));
                        detalle.setImagenes(rs.getString("imagenes"));
                        // agrega más campos según tu procedimiento
                        return detalle;
                    }
                );

    }


}
