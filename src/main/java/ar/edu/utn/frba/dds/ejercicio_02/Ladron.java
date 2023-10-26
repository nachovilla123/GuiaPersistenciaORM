package ar.edu.utn.frba.dds.ejercicio_02;

import lombok.Getter;
import lombok.Setter;
import retrofit2.http.GET;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
@DiscriminatorValue("Ladron")
public class Ladron extends Personaje{

  @Column(name = "nivel_siniestro")
  private Integer nivelSiniestro;

  @Column(name = "tiene_navaja")
  private Boolean tieneNavaja;

  public void atacar(Personaje personaje) {

  }
}
