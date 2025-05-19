package de.lubowiecki.collections;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Map;
import java.util.TreeMap;

public class CalApp {

    public static void main(String[] args) {

        DateTimeFormatter FMT = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

        // TreeMap ist nach Schlüsseln sortiert
        Map<LocalDate, String> cal = new TreeMap<>();
        cal.put(LocalDate.now(), "Essen mit Peter");
        cal.put(LocalDate.of(2025, 6, 8), "Meeting mit anderen Investoren");
        cal.put(LocalDate.of(2025, 6, 5), "Meeting mit den Investoren");
        cal.put(LocalDate.of(2025, 5, 20), "Beratung");

        for(LocalDate datum : cal.keySet()) {
            System.out.println(datum.format(FMT) + ": " + cal.get(datum));
        }
    }
}
