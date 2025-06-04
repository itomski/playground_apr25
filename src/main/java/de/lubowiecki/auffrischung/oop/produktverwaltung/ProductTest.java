package de.lubowiecki.auffrischung.oop.produktverwaltung;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductTest {

    public static void main(String[] args) {

        // Referenztyp: Produkt
        // Objekttyp: Produkt
        Produkt p = new Produkt();
        System.out.println(p.getNr());
        System.out.println(p);

        Buch b = new Buch();
        System.out.println(b);

        // Referenztyp: Produkt
        // Objekttyp: Buch
        p = new Buch(); // Buch IS-A Produkt


        List<Produkt> produkte = new ArrayList<>();
        produkte.add(new Buch(1, 10.99, "Backen ohne Fett", "Ein ganz blödes Buch", "1234-5678-90"));
        produkte.add(new Buch(2, 2.99, "Kochen ohne Wasser", "Noch ein blöderes Buch", "1289-5678-93"));
        produkte.add(new Geraet(3, 25.99, "Akkuschrauber", "Super Ding", LocalDate.now().plusMonths(24)));
        // Wenn keine Objekte von Produkt direkt gebaut werden sollen, wird die Klasse als abstrakte Klasse deklariert
        // produkte.add(new Produkt(7, 1.29, "Milch", "3,5% Fett"));

        System.out.println();

        for(Produkt pr : produkte) {
            System.out.print(pr.getNr());
            System.out.print(" ");
            System.out.print(pr.getName());
            System.out.print(" ");
            System.out.print(pr.getPreis());
            System.out.print(" ");
            System.out.print(pr.getBeschreibung());
            System.out.print(" ");

            // Wenn Buch eine Kindklasse von Produkt ist kann ein Cast der Referenz erfolgen
            if(pr instanceof Buch)
                System.out.print(((Buch)pr).getIsbn()); // Die pr-Referenz wird von Produkt auf Buch gecastet

            if(pr instanceof Geraet)
                System.out.print(((Geraet)pr).getGarantieBis()); // Die pr-Referenz wird von Produkt auf Geraet gecastet

            System.out.println();
        }

    }

}
