package ar.edu.utn.frba.dds.ejercicio_02;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Arco")
public class Arco extends ElementoDefensor{
  @Override
  public void defender(Personaje personaje) {
    //TODO.
  }


}
