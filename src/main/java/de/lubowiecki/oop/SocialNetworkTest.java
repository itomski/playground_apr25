package de.lubowiecki.oop;

import java.util.ArrayList;
import java.util.List;

public class SocialNetworkTest {

    public static void main(String[] args) {

        // IS-A: Wird durch Vererbung bereitgestellt
        // HAS-A: Wird durch Eigenschaften bereitgestellt

        Mitglied m1 = new Mitglied("Peter", "Parker");
        Mitglied m2 = new Mitglied("Carol", "Danvers");
        Mitglied m3 = new Mitglied("Bruce", "Banner");

        m1.addFreunde(m2, m3);

        m2.addFreunde(m3);

        System.out.println(m1);
    }
}

class Mitglied {

    private String vorname;
    private String nachname;

    private List<Mitglied> freunde = new ArrayList<>();

    public Mitglied(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public void addFreunde(Mitglied freund) {
        this.freunde.add(freund);
    }

    public void addFreunde(Mitglied... freunde) {
        // freunde ist ein Array von Mitglied-Objekten
        // List.of wandelt ein Array in eine List um
        this.freunde.addAll(List.of(freunde));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mitglied{");
        sb.append("vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append(", freunde=").append(freunde);
        sb.append('}');
        return sb.toString();
    }
}
