package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kartenspiel {

    public static void main(String[] args) {

        List<Karte> kartenDeck = new ArrayList<>();
        kartenDeck.add(new Karte(KartenFarbe.HERZ, KartenWert.Ass));
        kartenDeck.add(new Karte(KartenFarbe.HERZ, KartenWert.Koenig));
        kartenDeck.add(new Karte(KartenFarbe.HERZ, KartenWert.Dame));
        kartenDeck.add(new Karte(KartenFarbe.HERZ, KartenWert.Bube));
        kartenDeck.add(new Karte(KartenFarbe.HERZ, KartenWert.Zehn));
        kartenDeck.add(new Karte(KartenFarbe.HERZ, KartenWert.Neun));
        kartenDeck.add(new Karte(KartenFarbe.HERZ, KartenWert.Acht));
        kartenDeck.add(new Karte(KartenFarbe.HERZ, KartenWert.Sieben));

        Collections.shuffle(kartenDeck);

        for(Karte karte : kartenDeck) {
            System.out.println(karte);
        }

        Collections.sort(kartenDeck);

        System.out.println();

        Karte a = new Karte(KartenFarbe.KARO, KartenWert.Drei);
        Karte b = new Karte(KartenFarbe.PIK, KartenWert.Sieben);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.compareTo(b));

    }
}
