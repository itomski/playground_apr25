package de.lubowiecki.patterns.decorator.npc;

public class SehrStark implements Stark {

    private Stark stark;

    public SehrStark(Stark stark) {
        this.stark = stark;
    }

    @Override
    public int getStaerke() {
        return stark.getStaerke() + 20;
    }
}
