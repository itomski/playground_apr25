package de.lubowiecki.uebungen.u15;

public class Aufgabe {

    /*
    Übungen von der Lernplattform (Exceptions, Tag 14, 15)
    Übung 1
    Übung 2
    Übung 3
    Übung 6 (Singleton)

    Aufgabe
    Schreibe einen Builder für die Computer-Klasse.
    Die Computer-Klasse hat folgende Eigenschaften: Marke, CPU, RAM, Festplatte.
    Teste den Builder :-)

    Das Pettern kann noch um ein Interface erweitert werden.
    Das besprechen wir morgen.

     */

    public static void main(String[] args) {

        ComputerBuilder builder = new DeveloperComputerBuilder();
        Computer c1 = builder.build();
        System.out.println(c1);
        Computer c2 = builder.build();
        System.out.println(c2);

    }
}
