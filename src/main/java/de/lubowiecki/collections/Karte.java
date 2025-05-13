package de.lubowiecki.collections;

import java.util.Objects;

// Klassen, die sortierbar sein sollen MÜSSEN das Inteface
// Comparable implementieren
public class Karte implements Comparable<Karte> {

    public final KartenFarbe FARBE;

    public final KartenWert WERT;

    public Karte(KartenFarbe FARBE, KartenWert WERT) {
        this.FARBE = FARBE;
        this.WERT = WERT;
    }

    @Override
    public String toString() {
        return new StringBuilder().append(FARBE).append("_").append(WERT).toString();
    }

    // Natürliche (Standard) Reihenfolge. Kann nur 1x pro Klasse eingebaut werden
    @Override
    public int compareTo(Karte other) {
        //return FARBE.compareTo(other.FARBE);
        return WERT.compareTo(other.WERT);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Karte karte = (Karte) o;
        return FARBE == karte.FARBE && WERT == karte.WERT;
    }

    @Override
    public int hashCode() {
        return Objects.hash(FARBE, WERT);
    }
}
