package ar.edu.utn.frba.dds.ejercicio_02;

import javax.persistence.DiscriminatorValue;

@DiscriminatorValue("Escudo")
public class Escudo extends ElementoDefensor{
  @Override
  public void defender(Personaje personaje) {
    //TODO.
  }
}