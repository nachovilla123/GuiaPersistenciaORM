package ar.edu.utn.frba.dds.ejercicio_02;


import javax.persistence.*;

@Entity
@Table(name = "elemento_defensor")
@DiscriminatorColumn(name = "tipo_elemento")
public abstract class ElementoDefensor {

  @Id
  @GeneratedValue
  private Long id;

  public void defender(Personaje personaje) {

  }

}
