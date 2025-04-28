package de.lubowiecki;

import java.util.ArrayList;
import java.util.List;

public class Datenstrukturen {

    public static void main(String[] args) {

        int i = 10;
        int[] zahlen = {2,7,99,18,19,-22}; // bei gleichzeitiger Deklaration und Initialisierung
        zahlen = new int[]{7,22,18,9}; // Wenn die Variable bereits deklariert ist
        // zahlen = new int[10]; // Leeres Array mit 10 Positionen

        for(int j : zahlen) {
            System.out.println(j);
        }

        System.out.println();

        // Collections arbeiten nur mit komplexen Datentypen
        // primitive Datentypen werden automatisch in ihre Wrapper eingepackt
        List<Integer> zahlen2 = new ArrayList<>();
        zahlen2.add(5);
        zahlen2.add(22);
        zahlen2.add(-18);
        zahlen2.add(6);

        for(int j : zahlen2) {
            System.out.println(j);
        }
    }
}
