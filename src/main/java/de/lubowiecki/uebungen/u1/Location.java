package de.lubowiecki.uebungen.u1;

public class Location extends AbstractLocation {

    private static int count;

    private final int nr;

    public Location(String art, double tagespreis) {
        super(art, tagespreis);
        this.nr = ++count;
    }

    public int getNr() {
        return nr;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(nr)
                .append(", ")
                .append(getArt())
                .append(", ")
                .append(getTagespreis())
                .toString();
    }
}
