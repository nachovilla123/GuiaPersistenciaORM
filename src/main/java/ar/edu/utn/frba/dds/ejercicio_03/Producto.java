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

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  protected Long id;

  @Column(name = "nombre")
  protected String nombre;

  @Column(name = "marca")
  protected String marca;

  public Producto() {

  }

  public Double precio() {
    return 0.0;
  }

  public Integer stock() {
    return 0;
  }
}
