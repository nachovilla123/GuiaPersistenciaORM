package ar.edu.utn.frba.dds.ejercicio_01;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Direccion {

  @Column(name = "calle", nullable = true)
  private String calle;

  @Column(name = "altura", nullable = true)
  private Integer altura;

  @Column(name = "localidad_barrio", nullable = false)
  private String localidadBarrio;

  @Column(name = "provincia", nullable = false)
  private String provincia;

  @Column(name = "municipio_comuna", nullable = false)
  private String municipioComuna;

  public String leyendaCompleta(){
    return this.calle + " " + this.altura + " " + this.localidadBarrio + " " + this.provincia + " " + this.municipioComuna;
  }
}
