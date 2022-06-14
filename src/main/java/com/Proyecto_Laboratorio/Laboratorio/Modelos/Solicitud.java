package com.Proyecto_Laboratorio.Laboratorio.Modelos;


import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.persistence.*;

@Entity
@Table(name="solicitud")
@Getter
@Setter
public class Solicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="NoSolicitud",unique=true, nullable = false)
    private Integer NoSolicitud;
    @Column(name ="Tel",unique=false, nullable = false)
    private Integer Tel;
    @Column(name ="Gmail",unique=false, nullable = false)
    private String Gmail;
    @Column(name ="Descripcion ",unique=false, nullable = false)
    private String Descripcion;
    @Column(name ="IdTiposolicitud",unique=false, nullable = false)
    private Integer IdTiposolicitud;
    @Column(name ="NoExpediente",unique=false, nullable = false)
    private String NoExpediente;
    @Column(name ="IdTiposolicitante",unique=false, nullable = false)
    private Integer IdTiposolicitante;
    @Column(name ="IdTipoSoporte",unique=false, nullable = false)
    private String IdTipoSoporte;
    @Column(name ="Fechacreacion",unique=false, nullable = true)
    private String Fechacreacion;
    @Column(name ="Fechamodificacion",unique=false, nullable = true)
    private String Fechamodificacion;








}
