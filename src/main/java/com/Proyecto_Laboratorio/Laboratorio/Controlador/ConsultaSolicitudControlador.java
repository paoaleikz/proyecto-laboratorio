package com.Proyecto_Laboratorio.Laboratorio.Controlador;


import com.Proyecto_Laboratorio.Laboratorio.Dao.CrearSolicitudDao;
import com.Proyecto_Laboratorio.Laboratorio.Modelos.CrearSolicitud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ConsultaSolicitudControlador {

    @Autowired
    private CrearSolicitudDao crearsolicitudDao;

    @RequestMapping(value = "solicitud")
    public List<CrearSolicitud> getCrearSolicitud() { return CrearSolicitudDao.getsolicitud();
    }

}
