package de.lubowiecki.auffrischung.oop;

import java.time.LocalDate;
import java.util.Scanner;

public class FormTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(createPerson1());

        System.out.println();

        System.out.println(createPerson2());

        scanner.close();
    }

    private static Person createPerson1() {
        System.out.print("Vorname: ");
        String vname = scanner.nextLine();

        System.out.print("Nachname: ");
        String nname = scanner.nextLine();

        System.out.print("Geburtsdatum: ");
        String gDatumStr = scanner.nextLine();
        LocalDate gDatum = LocalDate.parse(gDatumStr); // parse = String in LocalDate umwandeln

        return new Person(vname, nname, gDatum);
    }

    private static Person createPerson2() {

        Person p = new Person();

        System.out.print("Vorname: ");
        p.setVorname(scanner.nextLine());

        System.out.print("Nachname: ");
        p.setNachname(scanner.nextLine());

        System.out.print("Geburtsdatum: ");
        p.setGeburtsDatum(LocalDate.parse(scanner.nextLine()));

        return p;
    }
}
