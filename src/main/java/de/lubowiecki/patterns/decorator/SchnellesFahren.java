package de.lubowiecki.patterns.decorator;

public class SchnellesFahren implements Fahrbar {

    private Fahrbar fahrzeug;

    public SchnellesFahren(Fahrbar fahrzeug) {
        this.fahrzeug = fahrzeug;
    }

    @Override
    public void fahreDurchDieGegend() {
        fahrzeug.fahreDurchDieGegend();
        System.out.println("Und das ganz schnell...");
    }
}
