package ar.edu.utn.frba.dds;

import ar.edu.utn.frba.dds.ejercicio_03.Combo;
import ar.edu.utn.frba.dds.ejercicio_03.Producto;
import ar.edu.utn.frba.dds.ejercicio_03.ProductoSimple;
import org.uqbarproject.jpa.java8.extras.PerThreadEntityManagers;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class InstanciadoParaProbarEnDBMySQL {

  public static void main(String[] args) {


    // corre el metodo main para persistir y ver como queda en tu DB!

    ProductoSimple papas = new ProductoSimple();
    papas.setNombre("Papas");
    papas.setMarca("Lays");

    papas.setPrecio(100.0);
    papas.setStock(10);


    ProductoSimple coca = new ProductoSimple();
    coca.setNombre("Coca");
    coca.setMarca("Coca Cola");
    coca.setStock(20);
    coca.setPrecio(150.0);

    ProductoSimple hamburguesa = new ProductoSimple();
    hamburguesa.setNombre("Hamburguesa");
    hamburguesa.setMarca("Paty");
    hamburguesa.setStock(30);
    hamburguesa.setPrecio(200.0);

    Combo ComboHamburguesaConPapasYBebida = new Combo();
    ComboHamburguesaConPapasYBebida.setNombre("Combo Hamburguesa con Papas y Bebida");
    ComboHamburguesaConPapasYBebida.setMarca("Combo Nachos!");
    ComboHamburguesaConPapasYBebida.addProducto(hamburguesa, papas, coca);





    EntityManager em = PerThreadEntityManagers.getEntityManager();
    EntityTransaction tx = em.getTransaction();
    tx.begin();

    em.persist(coca);
    em.persist(hamburguesa);
    em.persist(papas);
    em.persist(ComboHamburguesaConPapasYBebida);


    tx.commit();
  }
}
