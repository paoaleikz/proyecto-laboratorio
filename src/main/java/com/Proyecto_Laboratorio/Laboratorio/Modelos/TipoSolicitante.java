package com.Proyecto_Laboratorio.Laboratorio.Modelos;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Tipo_solicitante")
@Getter
@Setter
public class TipoSolicitante {



    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name ="Id_Tiposolicitante  ",unique=true, nullable = false)
    private Integer Id_Tiposolicitante  ;
    @Column(name ="Descripcion ",unique=false, nullable = false)
    private String Descripcion ;
    @Column(name ="Abreviatura ",unique=false, nullable = false)
    private String Abreviatura ;

}
