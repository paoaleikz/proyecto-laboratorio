package com.Proyecto_Laboratorio.Laboratorio.Dao;

import com.Proyecto_Laboratorio.Laboratorio.Modelos.Expediente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpedienteDaoImp {

    @Autowired
    private  ExpedienteDao  Edao;

    public List<Expediente> getexpedientes (){

        return (List<Expediente>) Edao.findAll();
    }


}
