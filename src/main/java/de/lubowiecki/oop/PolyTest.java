package de.lubowiecki.oop;

import java.util.ArrayList;
import java.util.List;

public class PolyTest {

    public static void main(String[] args) {

        // Referenztyp: Object
        // Objekttyp: String
        Object o1 = new String("Moin");

        System.out.println(o1); // toString wird ausgeführt

        // Referenztyp: Object
        // Objekttyp: ArrayList
        o1 = new ArrayList<>();

        System.out.println(o1);

        System.out.println();

        // Der Objekttyp entscheidet, welche Methode ausgeführt wird

        // Überschreiben: In der Kindklasse wird eine geerbte Methode ersetzt

        // Überladen: Zusätzlich zu einer geerbten Methoden, werden weitere Varianten
        // der Methode mit anderen Parametern definiert

        Box b1 = new Box();
        b1.add("Taschenlampe");
        b1.add("Senf");
        b1.add("1kg Kaffee");

        Box b2 = new Box();
        b2.add("Butterbrot", "Gurkensalat", "Apfel");
        b2.add(100);

        System.out.println(b1.toString()); // toString wird automatisch ausgeführt
        System.out.println(b1.hashCode());
        System.out.println(b1.equals(b2));

        System.out.println(b2);
    }
}

// Eine Klasse, von keiner anderen Klasse erbt
// erbt automatisch von der Klasse Object
class Box {

    private List<String> content = new ArrayList<>();

    public void add(String str) {
        content.add(str);
    }

    // Überladen: Es wird eine weitere Methode mit dem gleichen Namen aber unterschiedlicher
    // Parameterliste bereitgestellt
    public void add(int zahl) {
        content.add(zahl + "");
    }

    // Überladen: Es wird eine weitere Methode mit dem gleichen Namen aber unterschiedlicher
    // Parameterliste bereitgestellt
    public void add(String... str) { // ... = VarArg
        // VarArg: die Anzahl der Parameter ist variabel
        // Die Parameter werden als ein Array zusammengesetzt
        content.addAll(List.of(str));
    }

    // Überschrieben: Ersetzt die geerbte Methode von Object
    // Geerbte Methode kann auch abstrakt sein
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Box{");
        sb.append("content=").append(content);
        sb.append('}');
        return sb.toString();
    }
}
