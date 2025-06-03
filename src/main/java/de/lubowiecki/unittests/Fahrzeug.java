package de.lubowiecki.unittests;

import java.util.ArrayList;
import java.util.List;

public class Fahrzeug {

    private List<String> insassen = new ArrayList<>();

    private String kennzeichen;

    private int geschwindigkeit;

    public Fahrzeug(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public void gibGas() {
        geschwindigkeit += 10;
    }

    public void gibGas(int kmh) {
        geschwindigkeit += kmh;
    }

    public void bremseAb() {
        geschwindigkeit -= 10;
    }

    public void bremseAb(int kmh) {
        geschwindigkeit -= kmh;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public boolean einsteigen(String insasse) {
        if(insassen.size() < 5) {
            insassen.add(insasse);
            return true;
        }
        return false;
    }

    public boolean aussteigen(String insasse) {
        return insassen.remove(insasse);
    }

    public int getAnzahlInsassen() {
        return insassen.size();
    }
}
