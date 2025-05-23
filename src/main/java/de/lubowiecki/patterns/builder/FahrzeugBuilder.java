package de.lubowiecki.patterns.builder;

public class FahrzeugBuilder {

    private String marke = "Unbekannt";
    private String modell = "Unbekannt";
    private int baujahr = 2000;
    private Farbe farbe = Farbe.SCHWARZ;

    public String getMarke() {
        return marke;
    }

    public FahrzeugBuilder setMarke(String marke) {
        this.marke = marke;
        return this;
    }

    public String getModell() {
        return modell;
    }

    public FahrzeugBuilder setModell(String modell) {
        this.modell = modell;
        return this;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public FahrzeugBuilder setBaujahr(int baujahr) {
        this.baujahr = baujahr;
        return this;
    }

    public Farbe getFarbe() {
        return farbe;
    }

    public FahrzeugBuilder setFarbe(Farbe farbe) {
        this.farbe = farbe;
        return this;
    }

    public Fahrzeug build(String kennzeichen) {
        return new Fahrzeug(kennzeichen, marke, modell, baujahr, farbe);
    }
}
