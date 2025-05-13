package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

    public static void main(String[] args) {

        List<Karte> kartenDeck = new ArrayList<>();
        kartenDeck.add(new Karte(KartenFarbe.HERZ, KartenWert.Ass));
        kartenDeck.add(new Karte(KartenFarbe.PIK, KartenWert.Koenig));
        kartenDeck.add(new Karte(KartenFarbe.KREUZ, KartenWert.Dame));
        kartenDeck.add(new Karte(KartenFarbe.KREUZ, KartenWert.Ass));

        Collections.sort(kartenDeck); // Natürliche Reihenfolge (compareTo-Methode)
        System.out.println(kartenDeck);

        // Comparator als Vergleichsobjekt kann für verschiedene Sortierungen
        // gebaut werden
        // Der Comparator erklärt Java, wie Objekte eines bestimmten
        // Typs sortiert werden
        Comparator<Karte> nachFarbe = new NachFarbeKartenComparator();
        Comparator<Karte> nachWert = new NachWertKartenComparator();
        Comparator<Karte> nachFarbeUndWert = nachFarbe.thenComparing(nachWert);

        Collections.sort(kartenDeck, nachFarbe); // Nach Farbe
        System.out.println(kartenDeck);

        Collections.sort(kartenDeck, nachWert); // Nach Wert
        System.out.println(kartenDeck);

        kartenDeck.sort(nachWert); // Nach Wert. Auch möglich
        System.out.println(kartenDeck);

        kartenDeck.sort(nachFarbeUndWert); // Nach Farbe und Wert
        System.out.println(kartenDeck);

    }
}
