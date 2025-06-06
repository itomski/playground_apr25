package de.lubowiecki.lambdas;

import java.util.Comparator;

public class AnonymenKlassenTest {

    public static void main(String[] args) {

        // Ananyme Klasse = Wegwerfklasse :-)
        // Eine Klasse ohne Namen die vom Interface, anderer Klasse oder abstrakten Klasse erbt
        // und die methoden richtig überschreibt/implementiert, wird instanziert.
        // Danach ist diese Klassendefinition nicht mehr verfügbar

        Comparator<Fahrzeug> comp = new Comparator<Fahrzeug>() {
            @Override
            public int compare(Fahrzeug o1, Fahrzeug o2) {
                return o1.getKm() - o2.getKm();
            }
        };

        System.out.println();

        Box b1 = new Box();
        b1.setValue("Test...");
        System.out.println(b1.getValue());

        Box b2 = new Box() {
            @Override
            public String getValue() {
                return super.getValue().toUpperCase();
            }
        };

        b2.setValue("Zweiter Test...");
        System.out.println(b2.getValue());
    }
}

class Box {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
