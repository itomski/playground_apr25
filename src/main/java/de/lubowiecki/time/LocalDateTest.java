package de.lubowiecki.time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateTest {

    public static void main(String[] args) {

        LocalDate d1 = LocalDate.now();
        System.out.println(d1);

        // LocalDate, LocalTime und LocalDateTime sind Immutable

        System.out.println();

        LocalDate d2 = d1.plusDays(10);
        System.out.println(d1);
        System.out.println(d2);

        System.out.println();
        d2 = d2.plusDays(2000);
        d2 = d2.plusYears(2);
        d2 = d2.minusMonths(3);
        d2 = d2.plus(10, ChronoUnit.WEEKS);
        // d2 = d2.plus(10, ChronoUnit.HOURS);
        System.out.println(d2);

    }
}
