package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        // Alle Collections arbeiten nur mit komplexen Datentypen (Objekten)

        // List
        // erlaubt Duplikate und null
        // behält die Reihenfolge
        // Hat einen Index
        // Nur bei Listen ist ein Wahlfreier-Zugriff möglich

        List<Integer> zahlen = new ArrayList<>();

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
    }
}
