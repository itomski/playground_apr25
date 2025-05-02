package de.lubowiecki.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class LocalTimeTest {

    public static void main(String[] args) {

        LocalTime lt = LocalTime.now();

        System.out.println(lt.getHour());
        System.out.println(lt.getMinute());
        System.out.println(lt.getSecond());
        System.out.println(lt.get(ChronoField.MICRO_OF_SECOND));

        //Locale.setDefault(Locale.UK); // Landeinstellung von DE auf UK geändert
        final DateTimeFormatter TIME_FMT = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);

        System.out.println(lt);
        System.out.println(lt.format(TIME_FMT));
        System.out.println(TIME_FMT.format(lt));

        final DateTimeFormatter TIME_FMT_OWN = DateTimeFormatter.ofPattern("H:mm");
        System.out.println(lt.format(TIME_FMT_OWN));

        System.out.println();

        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(ld.format(DATE_FMT));

        final DateTimeFormatter DATE_FMT_OWN = DateTimeFormatter.ofPattern("d. MMM yy");
        System.out.println(ld.format(DATE_FMT_OWN));

        // Eigene vordefinierte Formatierung benutzen
        System.out.println(ld.format(TimeUtils.DATE_FMT));

        // TimeUtils tu = new TimeUtils(); // Error: Hat einen privaten Konstruktor

    }
}
