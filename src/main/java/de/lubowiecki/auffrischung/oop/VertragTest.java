package de.lubowiecki.auffrischung.oop;

import java.time.LocalDate;

// Importiert den statischen Inhalt einer Klasse oder ENUMs
import static de.lubowiecki.auffrischung.oop.Status.*;

public class VertragTest {

    public static void main(String[] args) {

        Vertrag vertrag = new Vertrag();
        vertrag.setStart(LocalDate.now());
        vertrag.setEnde(LocalDate.now().plusMonths(24));
        vertrag.setVertragsPartner1(new Person("Peter", "Parker", "1985-10-22"));
        vertrag.setVertragsPartner2(new Person("Carol", "Danvers", "1982-07-01"));
        vertrag.setStatus(AKTIV);
        System.out.println(vertrag);

    }
}
