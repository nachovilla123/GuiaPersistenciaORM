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
@DiscriminatorValue("Mago")
public class Mago  extends Personaje{

  @Column(name = "nivel_de_magia")
  private Integer nivelDeMagia;

  @Column(name = "posee_alas")
  private Boolean tieneAlas;

  public void atacar(Personaje personaje) {

  }


}
