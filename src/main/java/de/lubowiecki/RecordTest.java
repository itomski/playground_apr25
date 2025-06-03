package de.lubowiecki;

public class RecordTest {

    public static void main(String[] args) {

        // Records sind seit Java 14 verfügbar

        // Records sind immutable

        //RgbFarbe farbe = new RgbFarbe(255,5,75);
        RgbFarbe farbe = new RgbFarbe();
        System.out.println(farbe);

        // Der Konstruktor, toString und Getter werden automatisch bereitgestellt
        System.out.println(farbe.blue()); // Aufruf des Getters
        System.out.println(farbe.asHex()); // Aufruf einer Methode
    }
}
