package de.lubowiecki.patterns.decorator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class DecoratorTest {

    public static void main(String[] args) throws IOException {


        Fahrbar pkw1 = new Pkw();
        pkw1.fahreDurchDieGegend();

        System.out.println();

        // Erweitern durch Unterklasse
        pkw1 = new SportPkw();
        pkw1.fahreDurchDieGegend();

        // SportPkw ersetzt das Pkw-Objekt durch ein Objekt mit neuen Fähigkeiten

        System.out.println();

        // Erweitern durch Dekorieren
        pkw1 = new Pkw();
        pkw1 = new LastenTransportieren(new SchnellesFahren(pkw1));
        pkw1.fahreDurchDieGegend();

        System.out.println();
        Fahrbar motorrad = new Motorrad();
        motorrad = new SchnellesFahren(motorrad);
        motorrad.fahreDurchDieGegend();

        // Dekorator erweitert ein vorhandenes Objekt um neue Fähigkeiten


        // Beispiel für einen Decorator
        // Der FileWriter wird um ein Puffer erweitert
        Writer out = new FileWriter("test.abc");
        out = new BufferedWriter(out);

    }
}
