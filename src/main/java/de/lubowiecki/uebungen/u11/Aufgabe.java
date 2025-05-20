package de.lubowiecki.uebungen.u11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Aufgabe {

    /*
    Aufgabe 1
    Schreibe eine einfache App für eine Büchersammlung
    Dazu gehört eine Datenbank mit dem Namen "archive"
    Darin erzeuge eine Tabelle mit dem Namen "books"
    Die Tabelle hat folgende Spalten
        id, title, publication, author
    publication soll das Erscheinungsjahr sein.

    Lege einige Bücher darin ab und frage diese anschließend ab.
     */

    /*
    Aufgabe 2
    Schreibe eine App zu Verwaltung von Punktständen für Spiele
    Darin soll für einen Namen ein Punktstand festgehalten werden.
    Sollte der gleiche Spieler noch mal eingetragen werden, sollen seine alten
    Punkte überschriben werden

    Wähle dafür eine passende Collection.
    Die App fragt den Usernamen und den Punktestand ab.
    Das mehrmals nacheinander und anschließend zeigt sie alles an
     */

    private static final Set<Eintrag> punketabelle = new TreeSet<>();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Aufgabe 2
        while(true) {
            add(createEintrag());

            printTabelle();

            System.out.print("Weiter? ");

            if(scanner.next().toLowerCase().charAt(0) == 'n') {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("Programm wird beendet!");

    }

    private static void printTabelle() {

        System.out.println("\n### TABELLE ###");
        for(Eintrag e : punketabelle) {
            System.out.println(e);
        }
        System.out.println();
    }

    private static Eintrag createEintrag() {

        System.out.print("\nName: ");
        String name = scanner.nextLine();

        System.out.print("Punkte: ");
        int punkte = scanner.nextInt();

        return new Eintrag(name, punkte);
    }

    private static void add(Eintrag eintrag) {

        boolean find = false;

        for(Eintrag e : punketabelle) {
            if(e.equals(eintrag)) {
                e.setPunkte(eintrag.getPunkte());
                find = true;
                break;
            }
        }

        if(!find) {
            punketabelle.add(eintrag);
        }
    }



}
