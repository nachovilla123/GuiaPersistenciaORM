package ar.edu.utn.frba.dds.ejercicio_03;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Getter
@Setter
@Entity
@DiscriminatorValue("combo")
public class Combo extends Producto {


@ManyToMany
@JoinTable(name = "Combo_X_Producto",
    joinColumns = @JoinColumn(name = "combo_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "producto_id", referencedColumnName = "id"))
  private List<Producto> productos;

  public Double precio(){
    return 0.0;
  }

  public void addProducto(Producto ... productos){
    for (Producto producto : productos) {
      this.productos.add(producto);
    }
  }

  public Combo(){
      this.productos = new ArrayList<Producto>();
  }
}
