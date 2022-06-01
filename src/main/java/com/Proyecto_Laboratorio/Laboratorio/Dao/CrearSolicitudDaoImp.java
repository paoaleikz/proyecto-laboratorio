package com.Proyecto_Laboratorio.Laboratorio.Dao;


import com.Proyecto_Laboratorio.Laboratorio.Modelos.CrearSolicitud;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Service
public class CrearSolicitudDaoImp  implements CrearSolicitudDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<CrearSolicitud> getsolicitud(){
        String query ="FROM CrearSolicitud";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public List<CrearSolicitud> getCrearSolicitud() {
        return null;
    }

}
