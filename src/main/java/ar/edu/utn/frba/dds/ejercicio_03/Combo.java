package ar.edu.utn.frba.dds.ejercicio_03;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Getter
@Setter
@Entity
@DiscriminatorValue("combo")
public class Combo extends Producto {



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
