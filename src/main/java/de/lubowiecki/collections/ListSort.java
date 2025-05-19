package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort {

    public static void main(String[] args) {

        List<String> namen = new ArrayList<>();
        namen.add("Toni");
        namen.add("Peter");
        namen.add("Steve");
        namen.add("Bruce");
        namen.add("Carol");

        System.out.println(namen);

        // Collection muss vor binarySearch sortiert werden
        Collections.sort(namen);
        System.out.println(namen);
        int gefunden = Collections.binarySearch(namen, "Steve");
        System.out.println(gefunden);
    }
}
