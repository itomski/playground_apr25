package de.lubowiecki.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Basics {

    public static void main(String[] args) {

        //Path pfad = Paths.get("abc", "cde", "efg.txt");
        //System.out.println(pfad);

        Path pfad = Paths.get("content.txt");

        System.out.println(pfad.getRoot());
        System.out.println(pfad.getParent());
        System.out.println(pfad.getFileName());

        try {

            // Die kompletten Daten werden in den Arbeitsspeicher eigelesen
            List<String> zeilen = Files.readAllLines(pfad);
            for(String zeile : zeilen) {
                System.out.println(zeile);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();

        try {
            // Die Daten werden Zeile für Zeile in den Arbeitsspeicher eigelesen
            Files.lines(pfad)
                    .forEach(System.out::println);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
