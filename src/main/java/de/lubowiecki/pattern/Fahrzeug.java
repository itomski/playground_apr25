package de.lubowiecki.pattern;

public class Fahrzeug {

    private final String kennzeichen;
    private final String marke;
    private final String modell;
    private final int baujahr;
    private final Farbe farbe;

    public Fahrzeug(String kennzeichen, String marke, String modell, int baujahr, Farbe farbe) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.farbe = farbe;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public String getMarke() {
        return marke;
    }

    public String getModell() {
        return modell;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public Farbe getFarbe() {
        return farbe;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fahrzeug{");
        sb.append("kennzeichen='").append(kennzeichen).append('\'');
        sb.append(", marke='").append(marke).append('\'');
        sb.append(", modell='").append(modell).append('\'');
        sb.append(", baujahr=").append(baujahr);
        sb.append(", farbe=").append(farbe);
        sb.append('}');
        return sb.toString();
    }
}
