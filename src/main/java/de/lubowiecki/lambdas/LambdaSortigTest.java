package de.lubowiecki.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class LambdaSortigTest {

    public static void main(String[] args) {

        List<Fahrzeug> fahrzeuge = new ArrayList<>();
        fahrzeuge.add(new Fahrzeug("HH:AB123", "VW", "Polo", 2000, 125000));
        fahrzeuge.add(new Fahrzeug("B:XY233", "Fiat", "500", 2015, 75000));
        fahrzeuge.add(new Fahrzeug("HB:BX331", "Renault", "Clio", 1992, 250000));
        fahrzeuge.add(new Fahrzeug("M:CZ552", "Posche", "Panamera", 2018, 25000));
        fahrzeuge.add(new Fahrzeug("M:HY179", "VW", "Golf", 2001, 180000));

        // int compare(T o1, T o2);
        Comparator<Fahrzeug> nachNr = (f1, f2) -> f1.getNr() - f2.getNr();
        Comparator<Fahrzeug> nachKennzeichen = (f1, f2) -> f1.getKennzeichen().compareTo(f2.getKennzeichen());
        Comparator<Fahrzeug> nachMarke = (f1, f2) -> f1.getMarke().compareTo(f2.getMarke());
        Comparator<Fahrzeug> nachModell = (f1, f2) -> f1.getModell().compareTo(f2.getModell());
        Comparator<Fahrzeug> nachBaujahr = (f1, f2) -> f1.getBaujahr() - f2.getBaujahr();
        Comparator<Fahrzeug> nachKm = (f1, f2) -> f1.getKm() - f2.getKm();

        int auswahl = 6;

        Comparator<Fahrzeug> comp = switch(auswahl) {
            case 1 -> (f1, f2) -> f1.getKm() - f2.getKm();
            case 2 -> nachKennzeichen;
            case 3 -> nachMarke;
            case 4 -> nachMarke;
            case 5 -> nachBaujahr;
            case 6 -> nachKm;
            default -> nachNr;
        };

        //fahrzeuge.sort(nachMarke.thenComparing(nachModell));
        fahrzeuge.sort(comp);

        // void	accept(T t)
        Consumer<Fahrzeug> change = f -> f.setKm(100_000);
        fahrzeuge.forEach(change);

        //Consumer<Fahrzeug> cons = f -> System.out.println(f.getKm());
        fahrzeuge.forEach(System.out::println); // Methodenreferenz
    }
}
