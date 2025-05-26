package de.lubowiecki.patterns.decorator;

public class LastenTransportieren implements Fahrbar {

    private Fahrbar fahrzeug;

    public LastenTransportieren(Fahrbar fahrzeug) {
        this.fahrzeug = fahrzeug;
    }

    @Override
    public void fahreDurchDieGegend() {
        fahrzeug.fahreDurchDieGegend();
        System.out.println("Mit ganz viel Ladung...");
    }
}
