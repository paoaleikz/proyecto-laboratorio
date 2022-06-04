package com.Proyecto_Laboratorio.Laboratorio.Dao;


import com.Proyecto_Laboratorio.Laboratorio.Modelos.TipoSoporte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TipoSoporteDaoImp {

    @Autowired
    private TipoSoporteDao  TSoportedao;

    public List<TipoSoporte> getTipoSoportes (){

        return (List<TipoSoporte>) TSoportedao.findAll();
    }

}
