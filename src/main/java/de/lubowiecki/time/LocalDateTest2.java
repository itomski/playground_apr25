package de.lubowiecki.time;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class LocalDateTest2 {

    public static void main(String[] args) {

        LocalDate heute = LocalDate.now();
        LocalDate spaeter = LocalDate.of(2025, 7, 22);

        System.out.println(heute.isBefore(spaeter));
        System.out.println(spaeter.isAfter(heute));

        // Period: Ein Zeitraum in Jahren, Tagen, Monaten etc.
        // Duration: Ein Zeitraum in Stunden, Minuten, Sek, Nanosek etc.

        Period abstand = heute.until(spaeter);
        System.out.println(abstand);
        System.out.println(abstand.getYears());
        System.out.println(abstand.getMonths());
        System.out.println(abstand.getDays());

        // ChronoUnit = Zeit-Einheit
        long abstandAlsZahl = heute.until(spaeter, ChronoUnit.DAYS);
        System.out.println(abstandAlsZahl);

        System.out.println();

        // Instant = Maschinenzeit in Nanos
        Instant start = Instant.now();
        System.out.println(start);

        for (int i = 0; i < 1_000_000; i++) {
            System.out.println(i);
        }

        Instant ende = Instant.now();
        System.out.println(ende);

        Duration vergangeneZeit = Duration.between(start, ende);
        System.out.println(vergangeneZeit);
        System.out.println(vergangeneZeit.toNanos() + "ns");

        System.out.println();

        long start2 = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            System.out.println(i);
        }

        long ende2 = System.currentTimeMillis();

        System.out.println(ende2 - start2 + "ms");
    }
}
