package ar.edu.utn.frba.dds.ejercicio_01;


import javax.persistence.Column;
import javax.persistence.Embedded;

public class Persona {

    @Embedded
    private Direccion direccion;

    @Column(name = "CUIT_CUIL")
    private String cuitCuil;

    @Column(name = "nombre")
    private String nombre;

    private MedioDeComunicacion medioDeComunicacion;
}
