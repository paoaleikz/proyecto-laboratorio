package com.Proyecto_Laboratorio.Laboratorio.Modelos;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="solicitud")
@Getter
@Setter
public class CrearSolicitud {

    @Column(name ="No_Solicitud")
    private long No_Solicitud;
    @Column(name ="Tel")
    private String tel;
    @Column(name ="Gmail")
    private String Gmail;
    @Column(name ="Descripcion")
    private String Descripcion;
    @Column(name ="Id_tipoSolicitud")
    private long Id;
    @Column(name ="No_Expediente")
    private long No_Expediente;
    @Column(name ="Id_TipoSolicitante")
    private long Id_TipoSolicitante;
    @Column(name ="Id_TipoSoporte")
    private long Id_TipoSoporte;


}
