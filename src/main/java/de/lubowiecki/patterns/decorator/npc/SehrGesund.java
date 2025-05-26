package de.lubowiecki.patterns.decorator.npc;

public class SehrGesund implements Stark {

    private Gesund gesund;

    public SehrGesund(Gesund gesund) {
        this.gesund = gesund;
    }

    @Override
    public int getStaerke() {
        return gesund.getLebenspunkte() + 20;
    }
}
