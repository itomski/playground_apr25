package de.lubowiecki.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

public class TimeTest {

    public static void main(String[] args) {

        Date heute = new Date();
        System.out.println(heute);

        Date gestern = new Date(2025, 5, 1);
        System.out.println(gestern);

        System.out.println();

        LocalDate ld = LocalDate.now(); // Nur das Datum
        System.out.println(ld);

        LocalTime lt = LocalTime.now(); // Nur die Zeit
        System.out.println(lt);

        System.out.println();

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(ldt.toLocalDate());
        System.out.println(ldt.toLocalTime());

        System.out.println();
        ldt = LocalDateTime.of(ld, lt);
        System.out.println(ldt);

        System.out.println();

        LocalDate ld2 = LocalDate.of(2020, Month.AUGUST, 25);
        System.out.println(ld2);

        ld2 = LocalDate.of(2021, 10, 29);
        System.out.println(ld2);

    }
}
