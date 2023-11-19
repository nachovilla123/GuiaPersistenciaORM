package ar.edu.utn.frba.dds.ejercicio_03;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "producto")
@DiscriminatorColumn(name = "tipo")
public abstract class Producto {

  @Column(name = "nombre")
  private String nombre;

  @Column(name = "marca")
  private String marca;

  public Producto() {

  }

  public Double precio() {
    return 0.0;
  }

  public Integer stock() {
    return 0;
  }
}
