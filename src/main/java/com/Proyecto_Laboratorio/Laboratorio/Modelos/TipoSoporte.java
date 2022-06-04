package com.Proyecto_Laboratorio.Laboratorio.Modelos;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Tipo_soporte")
@Getter
@Setter


public class TipoSoporte {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name ="Id_TipoSoporte   ",unique=true, nullable = false)
    private String Id_TipoSoporte   ;
    @Column(name ="Descripcion ",unique=false, nullable = false)
    private String Descripcion ;
    @Column(name ="Codigo_Interno  ",unique=false, nullable = false)
    private String Codigo_Interno  ;
    @Column(name ="Abreviatura ",unique=false, nullable = false)
    private String Abreviatura ;


}
