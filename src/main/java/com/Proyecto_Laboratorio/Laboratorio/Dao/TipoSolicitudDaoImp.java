package com.Proyecto_Laboratorio.Laboratorio.Dao;


import com.Proyecto_Laboratorio.Laboratorio.Modelos.TipoSolicitud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TipoSolicitudDaoImp {

    @Autowired
    private  TipoSolicitudDao  TSolicituddao;

    public List<TipoSolicitud> gettipoSolicitantes (){

        return (List<TipoSolicitud>) TSolicituddao.findAll();
    }
}
