package de.lubowiecki.lambdas;

public class Fahrzeug {

    private static int count;

    private int nr;
    private String kennzeichen;
    private String marke;
    private String modell;
    private int baujahr;
    private int km;

    public Fahrzeug(String kennzeichen, String marke, String modell, int baujahr, int km) {
        this.nr = ++count;
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.km = km;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getNr() {
        return nr;
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

    public int getKm() {
        return km;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fahrzeug{");
        sb.append("nr=").append(nr);
        sb.append(", kennzeichen='").append(kennzeichen).append('\'');
        sb.append(", marke='").append(marke).append('\'');
        sb.append(", modell='").append(modell).append('\'');
        sb.append(", baujahr=").append(baujahr);
        sb.append(", km=").append(km);
        sb.append('}');
        return sb.toString();
    }
}
