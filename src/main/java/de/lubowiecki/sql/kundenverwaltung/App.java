package de.lubowiecki.sql.kundenverwaltung;

import java.sql.SQLException;
import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        Repository<Kunde> kundenRepo = new KundeRepository();



        try {
            // INSERT
//            Kunde kunde = new Kunde("Tony", "Stark", LocalDate.of(1978, 5, 5));
//            if(kundenRepo.insert(kunde)) {
//                System.out.println("Gespeichert!");
//            }
//            else {
//                System.out.println("Problem beim Speichern!");
//            }

            // FIND ALL
            for(Kunde k : kundenRepo.findAll()) {
                System.out.println(k);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
