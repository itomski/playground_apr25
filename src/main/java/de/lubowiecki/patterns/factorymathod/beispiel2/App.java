package de.lubowiecki.patterns.factorymathod.beispiel2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class App {

    public static void main(String[] args) {

        // now-Methode ist eine einfache Factory
        LocalDate dt = LocalDate.now();
        final DateTimeFormatter FMT = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

//        SourceFactory factory = new FileFactory();
//        Source source = factory.create("csv");

        Source source = new DbFactory().create("sqlite");

        try {
            source.save("Das ist", "das Haus", "von Nikigraus");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
