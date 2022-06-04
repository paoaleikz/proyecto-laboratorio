package com.Proyecto_Laboratorio.Laboratorio.Dao;


import com.Proyecto_Laboratorio.Laboratorio.Modelos.Solicitud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class SolicitudDaoImp {

    @Autowired
    private  SolicitudDao Sdao;

      public List<Solicitud> getsolicitudes(){

          return (List<Solicitud>) Sdao.findAll();
    }
    public int CrearSolicitud(Solicitud solicitud){
        int resp = 0;
        Date date = new Date();
        SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");

        solicitud.setFechacreacion(dt1.format(date));

        Solicitud sol = Sdao.save(solicitud);

        if(!sol.equals(null)){
            resp = 1;
        }
        return resp;
    }




}
