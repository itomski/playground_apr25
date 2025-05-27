package de.lubowiecki.uebungen.u16.aufgabe1;

public class WoodenBoard {

    private double lengthInInch = 100;

    public WoodenBoard() {
    }

    public WoodenBoard(double lengthInInch) {
        this.lengthInInch = lengthInInch;
    }

    void cut(double inch) {
        System.out.println("Cut to length: " + inch + " inch");
        lengthInInch = inch;
    }

    public double getLengthInInch() {
        return lengthInInch;
    }
}
