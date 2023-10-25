package ar.edu.utn.frba.dds.ejercicio_02;

import java.time.LocalDate;

public class Jugador {
  private String nombre;
  private String apellido;
  private LocalDate fechaAlta;
  private Personaje personaje;

  public Jugador() {

  }

  public void cambiarPersonaje(Personaje personaje) {
    this.personaje = personaje;
  }
}
