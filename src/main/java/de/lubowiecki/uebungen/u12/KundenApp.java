package de.lubowiecki.uebungen.u12;

import java.time.LocalDate;

public class KundenApp {

    public static void main(String[] args) {

        // Kundenobjekt wird zusammengestellt
        Kunde kunde = new Kunde();
        kunde.setVorname("Bruce");
        kunde.setNachname("Banner");
        kunde.setGeburtsdatum(LocalDate.of(1978, 1, 15));

        // Repository für die Kundentabelle bereitgestellt
        KundeRepository repo = new KundeRepository();

        try {
            // Kundenobjekt wird gespeichert
//            if (repo.insert(kunde)) {
//                System.out.println("Gespeichert!");
//            } else {
//                System.out.println("Nicht gespeichert!");
//            }

            // Kundenobjekt wird abgefragt
            kunde = repo.findById(3);
            System.out.println(kunde);

            System.out.println();

            // Kundenobjekte werden abgefragt
            for (Kunde k : repo.findAll()) {
                System.out.println(k);
            }

            // Kundenobjekt wird gelöscht
//            if (repo.deleteById(1)) {
//                System.out.println("Gelöscht");
//            }

//            if (repo.delete(kunde)) {
//                System.out.println("Gelöscht");
//            }

            // Kundenobjekt wird geändert
            kunde.setNachname("Rogers");
            kunde.setGeburtsdatum(LocalDate.now());
            if (repo.update(kunde)) {
                System.out.println("Geändert!");
            } else {
                System.out.println("Nicht geändert!");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
