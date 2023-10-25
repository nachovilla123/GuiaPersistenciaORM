package ar.edu.utn.frba.dds.ejercicio_03;

public class Packaging extends Decorado{
  private Double precio;

  public Double precio() {
    return this.producto.precio() + this.precio;
  }

  public Packaging() {

  }
}
