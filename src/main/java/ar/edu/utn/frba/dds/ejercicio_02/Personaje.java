package ar.edu.utn.frba.dds.ejercicio_02;

import com.thoughtworks.xstream.persistence.PersistenceStrategy;
import org.eclipse.jetty.util.Pool;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "TipoDePersonaje")
@Table(name = "Personaje")
public abstract class Personaje {

  @Id
  @GeneratedValue
  private Long id;

  @ManyToMany
  @JoinTable(
      name = "elementosDefensoresDelPersonaje",
      joinColumns = @JoinColumn(name = "id_personaje", referencedColumnName = "id"),
      inverseJoinColumns = @JoinColumn(name = "id_elemento", referencedColumnName = "id")
  )
  private List<ElementoDefensor> elementos;

  @Column(name = "estamina")
  private Integer estamina;

  @Column(name = "puntosDeVida")
  private Integer puntosDeVida;

  public Personaje(){

  }

  public void atacar(Personaje personaje) {
  //todo
  }

}
