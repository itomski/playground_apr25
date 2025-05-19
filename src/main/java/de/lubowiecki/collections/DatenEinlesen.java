package de.lubowiecki.collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DatenEinlesen {

    public static void main(String[] args) {

        DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        Path pfad = Paths.get("termine.txt");

        try {
            List<String> zeilen = Files.readAllLines(pfad); // Einlesen von Text Zeilenweise

            Map<LocalDate, String> cal = new TreeMap<>();

            for(String zeile : zeilen) {
                String[] daten = zeile.split(","); // Text-Zeile nach Komma zerlegen
                // Ersten Teil des Textes mit parse in LocalDate umwandeln
                // Zweiten Teil des Textes als Value hinzufügen
                cal.put(LocalDate.parse(daten[0], FMT), daten[1]); // Sortierung erfolgt automatisch
            }

            System.out.println(cal);

            System.out.println();

            for(LocalDate date : cal.keySet()) {
                // date wird im Standardformat (ISO) ausgegeben
                //System.out.println(date + ": " + cal.get(date));
                // date wird mit format nach Wunsch formatiert
                System.out.println(date.format(FMT) + ": " + cal.get(date));
            }
        }
        catch (IOException e) {
            System.out.println("Problem..." + e.getMessage());
        }
    }
}
