package de.lubowiecki;

import de.lubowiecki.collections.Karte;
import de.lubowiecki.collections.KartenFarbe;
import de.lubowiecki.collections.KartenWert;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashTest {

    public static void main(String[] args) {

        Double d1 = 100.5;
        int hash1 = Objects.hash(d1);
        System.out.println(hash1);

        Double d2 = 100.5;
        int hash2 = Objects.hash(d2);
        System.out.println(hash2);

        if(hash1 == hash2)
            System.out.println(d1.equals(d2));

        Karte k1 = new Karte(KartenFarbe.KARO, KartenWert.Ass);
        Karte k2 = new Karte(KartenFarbe.KARO, KartenWert.Koenig);
        Karte k3 = new Karte(KartenFarbe.PIK, KartenWert.Ass);
        Karte k4 = new Karte(KartenFarbe.PIK, KartenWert.Ass);

        System.out.println();

        Set<Karte> menge1 = new HashSet<>();
        menge1.add(k1);
        menge1.add(k2);
        menge1.add(k3);
        menge1.add(k4);

        System.out.println();

        for(Karte k : menge1) {
            System.out.println(k);
        }

    }
}
