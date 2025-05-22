package de.lubowiecki.uebungen.u14;

public class Aufgabe {

    // Programmiere eine Klasse nach diesem UML-Klassendiagramm

    public static void main(String[] args) {

        Logger.getInstance().log("Dies und das");

        Logger logger1 = Logger.getInstance();
        logger1.log("Das ist das Haus von Nikigraus!");

        machWas();

        System.out.println("----------");

        //logger1.printProtokoll();
        Logger.getInstance().printProtokoll();

    }

    public static void machWas() {
        Logger logger = Logger.getInstance();
        logger.log("...");
    }
}
