package de.lubowiecki.collections;

import java.util.Comparator;

public class NachWertKartenComparator implements Comparator<Karte> {


    @Override
    public int compare(Karte a, Karte b) {
        return a.WERT.compareTo(b.WERT);
    }
}
