package de.lubowiecki.patterns.builder;

public class BuilderTest {

    public static void main(String[] args) {

        Fahrzeug f1 = new Fahrzeug("HH:AB123", "Renault", "Zoe", 2022, Farbe.GELB);
        System.out.println(f1);
        Fahrzeug f2 = new Fahrzeug("HH:XY221", "Renault", "Zoe", 2022, Farbe.BLAU);
        System.out.println(f2);
        Fahrzeug f3 = new Fahrzeug("HH:XYZ23", "Renault", "Zoe", 2022, Farbe.BLAU);
        System.out.println(f3);
        Fahrzeug f4 = new Fahrzeug("HH:HA991", "Renault", "Zoe", 2022, Farbe.BLAU);
        System.out.println(f4);
        Fahrzeug f5 = new Fahrzeug("HH:KP330", "Renault", "Zoe", 2022, Farbe.BLAU);
        System.out.println(f5);

        System.out.println();

        FahrzeugBuilder builder = new FahrzeugBuilder();
        builder.setBaujahr(1999).setMarke("Ford").setModell("Ka");

        Fahrzeug f6 = builder.build("AB:XY123");
        System.out.println(f6);
        Fahrzeug f7 = builder.build("AB:XY124");
        System.out.println(f7);
        Fahrzeug f8 = builder.build("AB:XY125");
        System.out.println(f8);
    }
}
