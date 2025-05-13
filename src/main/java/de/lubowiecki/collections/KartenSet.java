package de.lubowiecki.collections;

import java.util.HashSet;
import java.util.Set;

// statische imports importieren den statischen Inhalt einer Klasse/Enums etc.
import static de.lubowiecki.collections.KartenWert.*;
import static de.lubowiecki.collections.KartenFarbe.*;

public class KartenSet {

    public static void main(String[] args) {

        Set<Karte> kartenDeck = new HashSet<>();
        //kartenDeck.add(new Karte(KartenFarbe.KARO, KartenWert.Ass));
        // Nach dem statischen import auch so möglich
        kartenDeck.add(new Karte(KARO, Ass));
        kartenDeck.add(new Karte(KARO, Koenig));
        kartenDeck.add(new Karte(PIK, Ass));
        kartenDeck.add(new Karte(KARO, Ass));

        // Karten müssen hashbar sein, damit ein Set richtig funktioniert
        // hashbar = hashCode und equals müssen richtig eingebaut sein

        for(Karte k : kartenDeck) {
            System.out.println(k);
        }
    }
}
