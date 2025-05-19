package de.lubowiecki.collections;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {

        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2024, 10, 22);
        LocalDate ld3 = LocalDate.of(2025, 10, 22);
        LocalDate ld4 = LocalDate.of(2022, 1, 1);
        LocalDate ld5 = LocalDate.of(2022, 2, 1);

        Set<LocalDate> daten = new TreeSet<>();
        daten.add(ld1);
        daten.add(ld2);
        daten.add(ld3);
        daten.add(ld4);
        daten.add(ld5);

        // TreeSet ist IMMER sortiert
        // Elemente MÜSSEN sortierbar sein (Comparable)
        for(LocalDate ld : daten) {
            System.out.println(ld);
        }
    }
}
