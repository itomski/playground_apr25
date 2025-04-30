package de.lubowiecki.oop;

import java.util.ArrayList;
import java.util.List;

public class RelationshipTest {

    public static void main(String[] args) {

        // 1:1
        // 1:n
        // n:m

        Person p1 = new Person("Steve", "Rogers");

        Lkw f1 = new Lkw("HH:AB123", "Mercedes", "Actros");
        f1.setFahrer(p1);

        Zuladung z1 = new Zuladung("Kaffee");
        Zuladung z2 = new Zuladung("Tee");
        Zuladung z3 = new Zuladung("Papier");

        f1.addZuladung(z1);
        f1.addZuladung(z2);
        f1.addZuladung(z3);

        //Fahrzeug f1 = new Fahrzeug("HH:AB123", "Mercedes", "Actros", p1);

        System.out.println(p1);

        System.out.println();

        System.out.println(f1);

    }
}

class Person {

    private String vorname;
    private String nachname;

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    @Override
    public String toString() {
        //return new StringBuilder().append(vorname).append(" ").append(nachname).toString();
        return String.format("%s %s", vorname, nachname);
    }
}

class Fahrzeug {

    private String kennzeichen;
    private String marke;
    private String typ;

    private Person fahrer;

    public Fahrzeug(String kennzeichen, String marke, String typ) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.typ = typ;
    }

    public Fahrzeug(String kennzeichen, String marke, String typ, Person fahrer) {
        this(kennzeichen, marke, typ);
        this.fahrer = fahrer;
    }

    public void setFahrer(Person fahrer) {
        this.fahrer = fahrer;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(kennzeichen).append(", ");
        sb.append(marke).append(", ");
        sb.append(typ).append(", ");
        sb.append("fahrer=").append(fahrer);
        return sb.toString();
    }
}

class Lkw extends Fahrzeug {

    private int maxZuladung = 8;

    private List<Zuladung> zuladung = new ArrayList<>();

    public Lkw(String kennzeichen, String marke, String typ) {
        super(kennzeichen, marke, typ);
    }

    public Lkw(String kennzeichen, String marke, String typ, Person fahrer) {
        super(kennzeichen, marke, typ, fahrer);
    }

    public List<Zuladung> getZuladung() {
        return zuladung;
    }

    public void addZuladung(Zuladung zuladung) {
        if(this.zuladung.size() < maxZuladung)
            this.zuladung.add(zuladung);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", zuladung=").append(zuladung);
        return sb.toString();
    }
}

class Zuladung {

    private String name;

    public Zuladung(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}