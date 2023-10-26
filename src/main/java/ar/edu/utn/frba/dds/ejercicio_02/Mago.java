package ar.edu.utn.frba.dds.ejercicio_02;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Mago")
public class Mago  extends Personaje{

  @Column(name = "nivel_de_magia")
  private Integer nivelDeMagia;

  @Column(name = "posee_alas")
  private Boolean tieneAlas;

  public void atacar(Personaje personaje) {

  }


}
