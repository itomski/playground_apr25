package de.lubowiecki.patterns.decorator.npc;

public class SehrSchwach implements Stark {

    private Stark stark;

    public SehrSchwach(Stark stark) {
        this.stark = stark;
    }

    @Override
    public int getStaerke() {
        return stark.getStaerke() - 5;
    }
}
