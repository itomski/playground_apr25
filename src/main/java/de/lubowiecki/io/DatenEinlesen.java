package de.lubowiecki.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DatenEinlesen {

    private static final String FILE_NAME = "robots.csv";

    public static void main(String[] args) {

        // Lesen
        List<Robot> robots = readFromFile(FILE_NAME);
        System.out.println(robots);

        // Liste erweitern
        robots.add(new Robot("TARS", "Taktik"));

        // Liste der Robot-Objekte speichern
        saveInFile(FILE_NAME, robots);

    }

    private static void saveInFile(String fileName, List<Robot> robots) {

        Path pfad = Paths.get(fileName);

        StringBuilder sb = new StringBuilder("Name,Typ\n");
        for(Robot robot : robots) {
            sb.append(robot.getName()).append(",").append(robot.getTyp()).append("\n");
        }

        try {
            Files.writeString(pfad, sb);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    private static List<Robot> readFromFile(String fileName) {

        Path pfad = Paths.get(fileName);

        List<Robot> robots = new ArrayList<>();

        try {
            List<String> zeilen = Files.readAllLines(pfad);
            for (int i = 0; i < zeilen.size(); i++) {
                if(i == 0) continue; // Wir überspringen die erste Zeile
                String zeile = zeilen.get(i);
                String[] attr = zeile.split(",");
                //System.out.printf("| %-15s | %15s | \n", attr[0], attr[1]);
                robots.add(new Robot(attr[0], attr[1]));
            }

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return robots;
    }

}
