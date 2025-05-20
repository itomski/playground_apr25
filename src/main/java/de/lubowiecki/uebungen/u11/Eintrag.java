package de.lubowiecki.uebungen.u11;

import java.util.Objects;

public class Eintrag implements Comparable<Eintrag> {

    private final String name;
    private int punkte;

    public Eintrag(String name) {
        this.name = name;
    }

    public Eintrag(String name, int punkte) {
        this.name = name;
        this.punkte = punkte;
    }

    public String getName() {
        return name;
    }

    public int getPunkte() {
        return punkte;
    }

    public void setPunkte(int punkte) {
        this.punkte = punkte;
    }

    public void addPunkte(int punkte) {
        this.punkte += punkte;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Eintrag eintrag = (Eintrag) o;
        return Objects.equals(name, eintrag.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return name + ": " + punkte;
    }

    @Override
    public int compareTo(Eintrag other) {
        return other.punkte - punkte;
    }
}
