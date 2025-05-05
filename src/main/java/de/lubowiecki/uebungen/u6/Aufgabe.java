package de.lubowiecki.uebungen.u6;

public class Aufgabe {

    // Implementiere mehrere (mind. 3) Vertraucher (d.h. Klassen, die das Interface erfüllen)
    // z.B. Lampe, Computer, Ventilator


    public static void main(String[] args) {

        // Das Interface sichert zu, dass bestimmte Methoden verfügbar sind
        // Es sichert aber NICHT zu, wie diese ausprogrammiert sind

        Verbraucher v1 = new Computer();
        v1.an();
        v1.aus();

        System.out.println();

        v1 = new Lampe();
        v1.an();
        v1.aus();

        System.out.println();

        Batterie b1 = new Batterie();
        b1.anschliessen(v1);

        b1.anschliessen(new Lampe());
        b1.aufladen();
        b1.anschliessen(new Lampe());

    }


}
