package com.Proyecto_Laboratorio.Laboratorio.Dao;


import com.Proyecto_Laboratorio.Laboratorio.Modelos.TipoSolicitante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TipoSolicitanteDaoImp {

    @Autowired
    private  TipoSolicitanteDao  TSolicitantedao;

    public List<TipoSolicitante> getSolicitantes (){

        return (List<TipoSolicitante>) TSolicitantedao.findAll();
    }

}
