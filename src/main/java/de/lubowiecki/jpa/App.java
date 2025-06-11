package de.lubowiecki.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;
import java.util.Queue;

public class App {

    public static void main(String[] args) {

        System.out.println("Start");

        try(EntityManagerFactory factory = Persistence.createEntityManagerFactory("JpaFirstStepsPU");
            EntityManager em = factory.createEntityManager()) {

            // INSERT
//            Fahrzeug fahrzeug = new Fahrzeug();
//            fahrzeug.setKennzeichen("HH:XY223");
//            fahrzeug.setMarke("Renault");
//            fahrzeug.setModell("Zoe");
//            fahrzeug.setBaujahr(2021);
//
//            em.getTransaction().begin();
//            em.persist(fahrzeug);
//            em.getTransaction().commit();

            // FIND ONE BY ID
//            Fahrzeug fahrzeug = em.find(Fahrzeug.class, 2);
//            System.out.println(fahrzeug);

            // FIND ALL
//            Query q = em.createNamedQuery("Fahrzeug.findAll");
//            List<Fahrzeug> fahrzeuge = q.getResultList();
//
//            for(Fahrzeug f : fahrzeuge) {
//                System.out.println(f);
//            }

            // UPDATE
            Fahrzeug fahrzeug = em.find(Fahrzeug.class, 2);
            System.out.println(fahrzeug);

            fahrzeug.setKennzeichen("HB:PU229");

            em.getTransaction().begin();
            em.getTransaction().commit();

        }
        catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println("Ende");
    }
}
