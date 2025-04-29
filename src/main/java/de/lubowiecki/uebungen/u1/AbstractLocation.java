package de.lubowiecki.uebungen.u1;

public abstract class AbstractLocation {

    private String art;

    private double tagespreis;

    public AbstractLocation(String art, double tagespreis) {
        this.art = art;
        this.tagespreis = tagespreis;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public double getTagespreis() {
        return tagespreis;
    }

    public void setTagespreis(double tagespreis) {
        this.tagespreis = tagespreis;
    }
}
