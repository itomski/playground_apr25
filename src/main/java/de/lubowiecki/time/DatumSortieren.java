package de.lubowiecki.time;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DatumSortieren {

    public static void main(String[] args) {

        List<LocalDate> zeitpunkte = new ArrayList<>();
        zeitpunkte.add(LocalDate.now());
        zeitpunkte.add(LocalDate.of(2025, 5, 22));
        zeitpunkte.add(LocalDate.of(2025, 1, 12));
        zeitpunkte.add(LocalDate.of(2000, 1, 17));
        zeitpunkte.add(LocalDate.of(2030, 1, 1));
        zeitpunkte.add(LocalDate.of(2024, 7, 10));

        System.out.println(zeitpunkte);

        // LocalDate, LocalTime, LocalDateTime sind vergleichbar (Comparable)
        Collections.sort(zeitpunkte);

        System.out.println(zeitpunkte);

    }
}
