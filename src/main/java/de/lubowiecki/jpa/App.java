package de.lubowiecki.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.time.LocalDate;
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
            // Query q = em.createNamedQuery("Fahrzeug.findAll");
//            Query q = em.createQuery("FROM Fahrzeug");
//            List<Fahrzeug> fahrzeuge = q.getResultList();
//
//            for(Fahrzeug f : fahrzeuge) {
//                System.out.println(f);
//            }

            // UPDATE
//            Fahrzeug fahrzeug = em.find(Fahrzeug.class, 2);
//            System.out.println(fahrzeug);
//
//            fahrzeug.setKennzeichen("HB:PU229");
//
//            em.getTransaction().begin();
//            em.getTransaction().commit();

            // OneToOne
//            Kunde kunde = new Kunde("Peter", "Parker", LocalDate.of(1982, 10, 2));
//            Adresse adresse = new Adresse("Musterweg", "22a", "23456", "Musterstedt");
//
//            kunde.setAdresse(adresse); // Kunden mit einer Adresse verbinden
//
//            em.getTransaction().begin();
//            em.persist(kunde);
//            em.getTransaction().commit();

            // FIND
//            Kunde kunde = em.find(Kunde.class, 1);
//            System.out.println(kunde);
//            System.out.println(kunde.getAdresse());

            // Fajrzeuge dem Kunden zuordnen und speichern
//            Kunde kunde = em.find(Kunde.class, 1);
//            kunde.addFahrzeug(new Fahrzeug("HH:XY897", "Ford", "Mustang", 1976));
//            kunde.addFahrzeug(new Fahrzeug("HH:FA221", "Smart", "ForTwo", 2022));
//
//            em.getTransaction().begin();
//            em.getTransaction().commit();

            Kunde kunde = em.find(Kunde.class, 1);
            System.out.println(kunde);
            System.out.println(kunde.getFahrzeuge());

        }
        catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println("Ende");
    }
}
