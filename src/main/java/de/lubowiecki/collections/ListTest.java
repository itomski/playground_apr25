package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        // Alle Collections arbeiten nur mit komplexen Datentypen (Objekten)

        // List
        // erlaubt Duplikate und null
        // behält die Reihenfolge
        // Hat einen Index
        // Nur bei Listen ist ein Wahlfreier-Zugriff möglich

        // List ist das Interface
        // ArrayList eine vollständige, instanzierbare Klasse
        List<Integer> zahlen = new ArrayList<>(100);

        Integer i = 10; // Autoboxing von primitiv 10 auf komplex 10
        int j = i; // Auto-Unboxing von koplex 10 auf primitiv 10

        zahlen.add(15); // Autoboxing
        zahlen.add(1); // Autoboxing
        zahlen.add(27); // Autoboxing
        zahlen.add(-18); // Autoboxing
        zahlen.add(null);
        zahlen.add(1); // Autoboxing

        System.out.println(zahlen);

        System.out.println(zahlen.get(2));
        zahlen.add(2, 100);

        System.out.println(zahlen);

        // fixed size List
        List<Integer> andereZahlen = List.of(3,7,22,18,5,-9);
        zahlen.addAll(andereZahlen); // Übernimmt alle Elemente der andere Liste
        // zahlen.addAll(List.of(3,7,22,18,5,-9)); // auch möglich

        System.out.println(zahlen);

        if(zahlen.contains(100)) {
            System.out.println("100 ist enthalten!");
        }

        if(zahlen.containsAll(List.of(22,10))) {
            System.out.println("Beide Zahlen enthalten!");
        }

        zahlen.remove(10); // Entfernt das Element an Index 10
        zahlen.remove(Integer.valueOf(10)); // Entfernt die 10 aus der Liste
        zahlen.remove(null); // Entfernt das Element an Index 10

        System.out.println(zahlen);

        zahlen.set(0, 1000); // Ersetzt den Wert an Index 0

        System.out.println(zahlen);

        // Bei Angabe von Start und Stop ist der Startindex immer inkl.
        // und der Endindex immer excl.
        List<Integer> sub = zahlen.subList(5, 10);

        System.out.println(sub);

        // List<Integer>
        // Wechsel von ArrayList auf LinkedList
        zahlen = new LinkedList<>(zahlen);

        // Wechsel von LinkedList zurück auf ArrayList
        zahlen = new ArrayList<>(zahlen);

        // Bei Veränderungen mitten in der Liste ist die LinkedList besser
        // Bei wahlfreien Zugriff ist die ArrayList besser

        // zahlen.sort(); // Mit Comparator

        // Sortiert nach der natürlichen Ordnung
        Collections.sort(zahlen); // Nur für Listen möglich
        System.out.println(zahlen);

        Collections.reverse(zahlen);
        System.out.println(zahlen);

        // Zahlen nach Zufall mischen
        Collections.shuffle(zahlen);
        System.out.println(zahlen);
    }
}
