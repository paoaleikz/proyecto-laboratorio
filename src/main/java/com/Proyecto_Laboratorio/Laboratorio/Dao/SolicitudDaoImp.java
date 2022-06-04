package com.Proyecto_Laboratorio.Laboratorio.Dao;


import com.Proyecto_Laboratorio.Laboratorio.Modelos.Solicitud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class SolicitudDaoImp {

    @Autowired
    private  SolicitudDao Sdao;

      public List<Solicitud> getsolicitudes(){

          return (List<Solicitud>) Sdao.findAll();
    }


}
