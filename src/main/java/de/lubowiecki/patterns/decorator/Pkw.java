package de.lubowiecki.patterns.decorator;

// implements wird bei Interfaces benutzt
// Bedeutet: Die Klasse PKW verpflichtet sich alle Methoden aus dem Interface einzubauen (implementieren)
public class Pkw implements Fahrbar {
    @Override

    public void fahreDurchDieGegend() {
        System.out.println("Fahre mit dem Pkw durch die Gegend");
    }
}
