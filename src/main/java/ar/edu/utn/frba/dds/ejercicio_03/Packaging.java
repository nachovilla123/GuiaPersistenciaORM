package ar.edu.utn.frba.dds.ejercicio_03;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Getter
@Setter
@DiscriminatorValue("Packaging")
@Entity
public class Packaging extends Decorado{

  @Column(name = "precio")
  private Double precio;

  public Double precio() {
    return this.producto.precio() + this.precio;
  }

  public Packaging() {

  }
}
