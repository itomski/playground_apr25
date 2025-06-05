package de.lubowiecki.generics.crud;

import java.sql.SQLException;
import java.util.Optional;
import java.util.Scanner;

public class GenericCrudTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        KundeCrud crud = new KundeCrud();

        try {
            crud.findById(25).ifPresent(k -> System.out.println(k));
        }
        catch (SQLException e) {
            e.printStackTrace();
        }


        System.out.println();

        while(true) {
            Kunde k = createKunde();

            try {
                if(crud.save(k)) {
                    System.out.println("Gespeichert!");
                }
            }
            catch (SQLException e) {
                e.printStackTrace();
            }

            System.out.print("Noch ein Kunde? ");
            if(scanner.nextLine().equalsIgnoreCase("nein")) break;
        }

        try {
            for (Kunde k : crud.findAll()) {
                System.out.println(k);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        scanner.close();
    }

    private static Kunde createKunde() {
        Kunde k = new Kunde();
        System.out.print("Vorname: ");
        k.setVorname(scanner.nextLine());
        System.out.print("Nachname: ");
        k.setNachname(scanner.nextLine());
        System.out.print("Email: ");
        k.setEmail(scanner.nextLine());
        return k;
    }
}
