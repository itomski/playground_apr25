package de.lubowiecki.patterns.decorator.npc;

public class Goblin implements Npc {

    private int staerke;
    private int schnelligkeit;
    private int lebenspunkte;

    public Goblin() {
        this.staerke = 10;
        this.schnelligkeit = 5;
        this.lebenspunkte = 35;
    }

    public int getStaerke() {
        return staerke;
    }

    public int getSchnelligkeit() {
        return schnelligkeit;
    }

    public int getLebenspunkte() {
        return lebenspunkte;
    }
}
