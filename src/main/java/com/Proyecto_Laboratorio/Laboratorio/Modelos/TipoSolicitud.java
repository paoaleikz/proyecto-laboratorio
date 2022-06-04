package com.Proyecto_Laboratorio.Laboratorio.Modelos;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Tipo_solicitud")
@Getter
@Setter

public class TipoSolicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name ="Id_Tiposolicitud ",unique=true, nullable = false)
    private Integer Id_Tiposolicitud ;
    @Column(name ="Descripcion ",unique=false, nullable = false)
    private String Descripcion ;
    @Column(name ="Abreviatura ",unique=false, nullable = false)
    private String Abreviatura ;


}
