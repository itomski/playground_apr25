package de.lubowiecki.patterns.decorator;

public class Motorrad implements Fahrbar {
    @Override

    public void fahreDurchDieGegend() {
        System.out.println("Fahre mit dem Motorrad durch die Gegend");
    }
}