package ar.edu.utn.frba.dds.ejercicio_02;

import lombok.Cleanup;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@ToString
@Entity
@Table(name = "Jugador")
public class Jugador {

  @Id
  @GeneratedValue
  private Long id;

  @Column(name = "nombre")
  private String nombre;

  @Column(name = "Apellido")
  private String apellido;

  @Column(name = "fecha_alta")
  private LocalDate fechaAlta;      //USAMOS EL LocalDateConverter aca, porque tiene autoaply

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "personaje_id", referencedColumnName = "id")
  private Personaje personaje;

  public Jugador() {

  }

  public void cambiarPersonaje(Personaje personaje) {
    this.personaje = personaje;
  }
}
