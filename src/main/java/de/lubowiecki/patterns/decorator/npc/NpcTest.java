package de.lubowiecki.patterns.decorator.npc;

public class NpcTest {

    public static void main(String[] args) {

        Npc goblin = new Goblin();
        System.out.println(goblin.getLebenspunkte());
        System.out.println(goblin.getStaerke());

        System.out.println();
        Stark goblinExt = new SehrStark(goblin);
        System.out.println(goblinExt.getStaerke());

        goblinExt = new SehrSchwach(new SehrStark(goblin));
        System.out.println(goblinExt.getStaerke());
        System.out.println(goblin.getStaerke());

    }
}
