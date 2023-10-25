package ar.edu.utn.frba.dds.ejercicio_01;

public class Direccion {
  private String calle;
  private Integer numero;
  private String localidadBarrio;
  private String provincia;
  private String pais;


  public String leyendaCompleta(){
    return this.calle + " " + this.numero + " " + this.localidadBarrio + " " + this.provincia + " " + this.pais;
  }
}
