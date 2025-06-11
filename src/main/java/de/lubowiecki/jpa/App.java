package de.lubowiecki.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {

    public static void main(String[] args) {

        System.out.println("Start");

        try(EntityManagerFactory factory = Persistence.createEntityManagerFactory("JpaFirstStepsPU");
            EntityManager em = factory.createEntityManager()) {

            System.out.println("Moin!");

        }
        catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println("Ende");
    }
}
