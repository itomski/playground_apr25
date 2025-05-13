package de.lubowiecki.collections;

import java.util.Comparator;

public class NachFarbeKartenComparator implements Comparator<Karte> {

    @Override
    public int compare(Karte a, Karte b) {
        return a.FARBE.compareTo(b.FARBE);
    }
}

