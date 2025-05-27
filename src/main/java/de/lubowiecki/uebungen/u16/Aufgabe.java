package de.lubowiecki.uebungen.u16;

import de.lubowiecki.uebungen.u16.aufgabe1.Saege;
import de.lubowiecki.uebungen.u16.aufgabe1.WoodenBoard;
import de.lubowiecki.uebungen.u16.aufgabe1.WoodenBoardToMaterialAdapter;
import de.lubowiecki.uebungen.u16.aufgabe2.Drohne;
import de.lubowiecki.uebungen.u16.aufgabe2.Gruppe;

public class Aufgabe {

    /*

    Aufgabe 1:
    Schreibe einen Adapter, der es zwei inkompatibilen Klassen eine zusammenarbeit ermöglicht.

    Klasse: Saege
    Methode: zuschneiden(Material material, double cm)

    Interface Material
    Methode: kuerzen(double cm)

    Klasse: WoodenBoard
    Methode: cut(double inch)

    Aktuell werden Objekte, die das Interface Material implementieren an Methode zuschneiden
    der Saege übergeben. Dabei wird die Größe in cm angegeben.

    WoodenBoard soll auch verwendbar sein, leider heißt die Methode des WoodenBoars cut und verwendet inch.
    Das Problem soll durch einen Adapter gelöst werden


    Schreibe ein Composite für die Simulation der Bewegung von Drohnen.
    Die Position der Drohne wird durch x, y, und z Angegeben.
    z ist die höhe.

    Das Composite definiert einen Schwarm von Drohnen-Objekten.
    Füge 5 Drohnen zu und steuere diese über das Composite wie ein einziges.

    (PS: Die Drohne ist lediglich eine Klasse mit 3 int eigenschaften und Gettern dafür.
    Darüberhinaus gibt es dann eine changePosition(int x, int y, int z) - Methode für die Steuerung)

     */


    public static void main(String[] args) {

        Saege saege = new Saege();
        WoodenBoard board = new WoodenBoard();
        saege.zuschneiden(new WoodenBoardToMaterialAdapter(board), 254);

        System.out.println(board.getLengthInInch());

        System.out.println();

        System.out.println("----------------");

        Drohne d1 = new Drohne(10,10,10);
        Drohne d2 = new Drohne(10,10,10);
        Drohne d3 = new Drohne(10,10,10);
        Drohne d4 = new Drohne(10,10,10);
        Gruppe g1 = new Gruppe(d1,d2,d3,d4);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);

        System.out.println();
        g1.changePosition(25,20,10);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
    }
}
