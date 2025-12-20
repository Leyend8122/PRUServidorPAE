package com.example.demo.repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Instituciones;

@Repository
public class reponsableiiRepositorio {
    private final JdbcTemplate jdbcTemplate;

    public reponsableiiRepositorio(JdbcTemplate jdbcTemplate){
            this.jdbcTemplate = jdbcTemplate;
    }

    public List<Instituciones> obtenerInstituciones() {
    String sql = "select aie.pie_id,aie.pie_definicion,ub.ub_nombdep,ub.ub_nombprov,ub.ub_nombdist from pro_institucionEducativa  aie\n" + //
                "left join UBIGEO ub on aie.pie_ubigeo = ub.ub_id;";
    return jdbcTemplate.query(sql, (rs, rowNum) -> {
        Instituciones u = new Instituciones();
        u.setPie_id(rs.getInt("pie_id"));
        u.setPie_definicion(rs.getString("pie_definicion"));
        u.setUb_nombdep(rs.getString("ub_nombdep"));
        u.setUb_nombprov(rs.getString("ub_nombprov"));
        u.setUb_nombdist(rs.getString("ub_nombdist"));
        return u;
    });
}
}
