package de.lubowiecki.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TimeUtils {

    public static final DateTimeFormatter TIME_FMT = DateTimeFormatter.ofPattern("HH:mm");
    public static final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    // Instanzierung der Klasse ist nicht möglich
    // Es kann nur das statische Inventar verwendet werden (über den Klassennamen)
    private TimeUtils() {
    }
}
