package de.lubowiecki.auffrischung.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UtilKlassenTest {

    public static void main(String[] args) {

        int[] arr = {7,22,8,1,9,0,-18,99};
        // Utility-Klassen haben nur statische Methoden
        // d.h. Werte für die Verarbeitung werden IMMER als Parameter übergeben
        // Haben einen privaten Konstruktor d.h. können NICHT instanziert werden
        Arrays.sort(arr);
        System.out.println(arr);
        String str = Arrays.toString(arr);
        System.out.println(str);
        int[] copy = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(copy));

        System.out.println();

        List<Integer> zahlen = new ArrayList<>();
        zahlen.addAll(List.of(7,22,8,1,9,0,-18,99));
        Collections.sort(zahlen);
        System.out.println(zahlen);
        Collections.shuffle(zahlen);
        System.out.println(zahlen);


    }

}
