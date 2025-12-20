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
                        cabecera.setPf_id(rs.getInt("pf_id"));
                        cabecera.setPie_id(rs.getInt("pie_id"));
                        cabecera.setPf_fecha_ini(rs.getDate("pf_fecha_ini"));
                        cabecera.setPf_fecha_fin(rs.getDate("pf_fecha_fin"));
                        cabecera.setPf_nummanipuladores(rs.getInt("pf_nummanipuladores"));
                        cabecera.setPf_ubiseralimentacion(rs.getInt("pf_ubiseralimentacion"));
                        cabecera.setPf_racionesrecibieron(rs.getInt("pf_racionesrecibieron"));
                        cabecera.setPf_derracionesrecibieron(rs.getInt("pf_derracionesrecibieron"));
                        cabecera.setPf_resultado(rs.getInt("pf_resultado"));
                        cabecera.setPf_nusuarios(rs.getInt("pf_nusuarios"));
                        cabecera.setPf_estado(rs.getInt("pf_estado"));
                        cabecera.setPf_ultimoHito(rs.getInt("pf_ultimoHito"));
                        cabecera.setPfObservacionesGeneral(rs.getString("pf_observacionGeneral"));
                        cabecera.setPr_id(rs.getInt("pr_id"));
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
                        detalle.setPp_id(rs.getInt("pp_id"));
                        detalle.setPdf_cumplimiento(rs.getInt("pdf_cumplimiento"));
                        detalle.setPdf_observacion(rs.getString("pdf_observacion"));
                        detalle.setPdf_posicion(rs.getString("pdf_posicion"));
                        detalle.setPdf_cantidad(rs.getInt("pdf_cantidad"));
                        detalle.setPdf_estado(rs.getInt("pdf_estado"));
                        detalle.setPdf_material(rs.getInt("pdf_material"));
                        detalle.setPdf_material_esp(rs.getInt("pdf_material_esp"));
                        detalle.setPdf_vigencia(rs.getInt("pdf_vigencia"));
                        detalle.setPdf_fecha_caducidad(rs.getString("pdf_fecha_caducidad"));
                        detalle.setPdf_tipo_cocina(rs.getInt("pdf_tipo_cocina"));
                        detalle.setPdf_tipo_cocina_esp(rs.getString("pdf_tipo_cocina_esp"));
                        detalle.setPdf_limpio(rs.getInt("pdf_limpio"));
                        detalle.setPdf_desinfectado(rs.getInt("pdf_desinfectado"));
                        detalle.setPdf_otro_ambpreparacion(rs.getString("pdf_otro_ambpreparacion"));
                        detalle.setImagenes(rs.getString("imagenes"));
                        // agrega más campos según tu procedimiento
                        return detalle;
                    }
                );

    }


}
