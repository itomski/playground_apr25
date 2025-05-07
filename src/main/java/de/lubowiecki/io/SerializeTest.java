package de.lubowiecki.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SerializeTest {

    public static void main(String[] args) {

        // System.out.println(System.getProperties());
        // System.out.println(System.getProperty("user.home"));

        final String DIR = System.getProperty("user.home") + "/data";

        Path DIR_PATH = Paths.get(DIR);

        try {
            if (Files.notExists(DIR_PATH)) // Falls Ordner noch nicht da...
                Files.createDirectory(DIR_PATH); // ... dann erzeugen
        }
        catch(IOException e) {
            System.out.println("Ordner konnte nicht angelegt werden");
            System.exit(0); // Programm vorzeitig verlassen
        }

        final String FILE = DIR + "/personen.txt";

        System.out.println(FILE);

        try {

//        List<Person> personen = new ArrayList<>();
//        personen.add(new Person("Carol", "Danvers", LocalDate.of(1985, 12, 1)));
//        personen.add(new Person("Steve", "Rogers", LocalDate.of(1917, 1, 5)));
//        personen.add(new Person("Peter", "Parker", LocalDate.of(1998, 5, 15)));
//        personen.add(new Person("Bruce", "Banner", LocalDate.of(1983, 2, 10)));
//        save(personen, FILE);

            List<Person> personen = read(FILE);
            System.out.println(personen);
        }
        catch(Exception e) {
            System.out.println("Probleme beim Zugriff auf die Daten");
        }
    }

    private static void save(List<Person> personen, final String FILE) throws IOException {
        // Verbindung zu Datei aufbauen
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE))) {
            // Daten in die Datei schreiben
            oos.writeObject(personen); // Objekt-Baum serialisiert schreiben
            // hier wird das oos automatisch geschlossen
        }
    }

    private static List<Person> read(final String FILE) throws Exception {
        // Verbindung zu Datei aufbauen
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE))) {
            // Daten aus der Datei lesen
            return (List<Person>) ois.readObject(); // serialisierte Daten werden gelesen und zu Objekten umgewandelt
            // hier wird das ois automatisch geschlossen
        }
    }

}
