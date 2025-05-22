package de.lubowiecki.uebungen.u13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Aufgabe {

    /*

    Aufgabe 1

    Falls nicht vorhanden, importiert bitte die Tabelle der Kundenverwaltung (SQL-Script)
    Danach...
    Schreibe 3 SQL Anweisungen zum Einfügen von Datensätzen (Kunden)
    Schreibe 3 SQL Anweisungen zum Abfragen von Datensätzen (z.B. nach Id, Vorname, Nachname)
    Schreibe 3 SQL Anweisungen zum Updaten von Datensätzen
    Schreibe 2 SQL Anweisungen zum Löschen von Datensätzen (z.B. nach Id, Nachname)
    Alle Anweisungen sollen über phpMyAdmin ausgeführt werden


    Aufgabe 2
    Schreibe eine Klasse mit 6 Methoden.
    Jede der Methoden soll eine Exception (frei wählbar) produzieren.
    3 Methoden behandeln die Exceptions direkt und 3 Methoden geben die Exceptions weiter
    an den Aufrufer. Teste diese Methoden.
    Was sind die Vor- bzw. Nachteile der jeweiligen Handhabung der Exceptions?


    Aufgabe 3
    Schreibe ein Programm für eine Task-Liste, die ihre Daten in der Datenbank (SQLite oed MySQL) speichert.
    Tasks bestehen aus Titel, Beschreibung, Datum und Status (erledigt oder noch offen).
    Du kannst dich für eine GUI (JavaFX) oder ein Konsolenprogramm entscheiden.
    Es sollen erstmal nur die Tasks erfasst und angezeigt werden.
     */

    public static void main(String[] args) {

        // Bei RuntimeExceptions entscheidet der Entwickler selbst,
        // wo er die Behandlung vornehmen möchte

        machWas1();

        try {
            machWas2();
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array zu klein");
        }

        // Bei CheckedExceptions wird der Entwickler zu Behandlung gezwungen
        // und er kann diese durch throws an den Aufrufer delegieren

        try {
            machWas3();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Path pfad = Paths.get("test.txt");
        try {
            Files.createFile(pfad); // Kann eine CheckedException werfen. Behandlung notwendig
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void machWas1() {
        String text = null;
        try {
            System.out.println(text.toLowerCase()); // RuntimeException: KANN behandelt werden
        }
        catch(NullPointerException e) {
            System.out.println("Text ist null");
        }
    }

    public static void machWas2() {
        int[] arr = new int[5];
        System.out.println(arr[6]); // RuntimeException: KANN behandelt werden
    }

    // throws Exception = Behandlung wird an den Aufrufer der Methode delegiert
    public static void machWas3() throws Exception {
        Random rand = new Random();
        int zahl = rand.nextInt(10);
        if(zahl == 0) {
            throw new Exception("Ungültige Zahl!"); // Checked Exception: MUSS behandelt werden
        }
        System.out.println("Zahl: " + zahl);
    }


    public static void machWas4() {
        // Unchecked
        // Wird die Exception hier nicht behandelt, wird sie weiter an den Aufrufer gegeben (automatisch)
        throw new RuntimeException("Unchecked");
    }

    public static void machWas5() throws IOException {
        // Checked
        // Wird die Exception hier nicht behandelt, wird sie nicht automatisch weiterreregen
        // Soll sie weitergegeben werden ist ein throws an der Methoden-Signatur notwendig
        throw new IOException("Checked");
    }
}
