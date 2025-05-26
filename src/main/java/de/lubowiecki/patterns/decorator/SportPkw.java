package de.lubowiecki.patterns.decorator;

// extends wird bei Klassenvererbung benutzt
// Bedeutet: SportPkw erbt alle Methoden von Pkw und kann diese dann verändern

// IS-A Beziehung. SprotPkw IS-A Pkw
public class SportPkw extends Pkw {

    @Override
    public void fahreDurchDieGegend() {
        super.fahreDurchDieGegend();
        System.out.println("Und das ganz schnell...");
    }
}
