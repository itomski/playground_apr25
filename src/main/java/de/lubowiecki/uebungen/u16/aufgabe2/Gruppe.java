package de.lubowiecki.uebungen.u16.aufgabe2;

import java.util.ArrayList;
import java.util.List;

public class Gruppe implements Movable {

    private List<Movable> elements = new ArrayList<>();

    public Gruppe(Movable... elements) {
        this.elements.addAll(List.of(elements));
    }

    public Gruppe() {
    }

    public void addElements(Movable... elements) {
        this.elements.addAll(List.of(elements));
    }

    @Override
    public void changePosition(int x, int y, int z) {
        for(Movable e : elements) {
            e.changePosition(x, y, z);
        }
    }
}
