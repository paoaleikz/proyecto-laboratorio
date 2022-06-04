package com.Proyecto_Laboratorio.Laboratorio.Modelos;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Expediente")

@Getter
@Setter
public class Expediente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name ="no_expediente",unique=true, nullable = false)
    private String no_expediente;
    @Column(name ="nombre",unique=false, nullable = false)
    private String nombre;
    @Column(name ="nit",unique=false, nullable = false)
    private String nit;




}
