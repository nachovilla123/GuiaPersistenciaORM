package ar.edu.utn.frba.dds.ejercicio_02.docs;

import ar.edu.utn.frba.dds.ejercicio_02.*;
import org.uqbarproject.jpa.java8.extras.PerThreadEntityManagers;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Instanciado_ej_02 {

  public static void main(String[] args) {

    Arco arco = new Arco();
    Espada espada = new Espada();
    Escudo escudo = new Escudo();

    List<ElementoDefensor> elementosDeBorda = new ArrayList<>();
    elementosDeBorda.add(escudo);
    elementosDeBorda.add(espada);
    elementosDeBorda.add(arco);
    Mago maBorda = new Mago();
       maBorda.setNivelDeMagia(10);
       maBorda.setTieneAlas(true);
       maBorda.setEstamina(500);
       maBorda.setPuntosDeVida(100000);
       maBorda.setElementos(elementosDeBorda);

    List<ElementoDefensor> elementosDeVilla = new ArrayList<>();
    elementosDeVilla.add(escudo);
    elementosDeVilla.add(espada);
    Ladron ladrILLA = new Ladron();
    ladrILLA.setNivelSiniestro(10);
    ladrILLA.setEstamina(5);
    ladrILLA.setTieneNavaja(false);
    ladrILLA.setPuntosDeVida(-5);
    ladrILLA.setElementos(elementosDeVilla);


    Jugador nachoBorda = new Jugador();
    nachoBorda.setApellido("Borda");
    nachoBorda.setFechaAlta(LocalDate.now());
    nachoBorda.setNombre("Nacho");
    nachoBorda.setPersonaje(maBorda);

    Jugador nachoVilla = new Jugador();
    nachoVilla.setApellido("Villa");
    nachoVilla.setFechaAlta(LocalDate.now());
    nachoVilla.setNombre("Nacho");
    nachoVilla.setPersonaje(ladrILLA);





    EntityManager em = PerThreadEntityManagers.getEntityManager();
    EntityTransaction tx = em.getTransaction();
    tx.begin();

    em.persist(nachoVilla);
    em.persist(nachoBorda);


    tx.commit();
  }
}
