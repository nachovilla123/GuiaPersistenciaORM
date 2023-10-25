package ar.edu.utn.frba.dds;

import org.uqbarproject.jpa.java8.extras.PerThreadEntityManagers;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.io.IOException;

public class Instanciado{

    public static void main(String[] args) throws IOException {

        //* ---------------------------------------  INSTANCIAS  ---------------------------------------*/


        //* ---------------------------------------  PERSISTENCIA  ---------------------------------------*/

        EntityManager em = PerThreadEntityManagers.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        //em.persist(instancia);
        tx.commit();
    }

}