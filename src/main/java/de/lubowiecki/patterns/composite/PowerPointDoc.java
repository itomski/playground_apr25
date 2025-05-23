package de.lubowiecki.patterns.composite;

public class PowerPointDoc implements Printable {

    @Override
    public void print() {
        System.out.println("Präsentation wird gedruckt...");
    }

}
