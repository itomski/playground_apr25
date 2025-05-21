package de.lubowiecki.uebungen.u12;

import java.sql.SQLException;
import java.time.LocalDate;

public class KundenApp2 {

    public static void main(String[] args) {

        KundeRepository repo = new KundeRepository();

        Kunde k = new Kunde();
        k.setVorname("Scott");
        k.setNachname("lang");
        k.setGeburtsdatum(LocalDate.now().minusYears(30));

        System.out.println(k);
        try {
            repo.insert(k);
            System.out.println(k);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
