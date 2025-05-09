package de.lubowiecki.io;

import java.io.File;
import java.util.Date;

public class BasicIO {

    public static void main(String[] args) {

        File dir = new File("data/");

        // File: Klasse/Datentyp
        // file: Variablenname
        File file = new File(dir, "namen.txt");

        try {

            if (dir.exists()) {
                System.out.println(file);
                System.out.println("ABSOLUT: " + dir.getAbsolutePath());
                System.out.println("NAME: " + dir.getName());
                System.out.println("lesbar: " + dir.canRead());
                System.out.println("beschreibbar: " + dir.canWrite());
                System.out.println("ausführbar: " + dir.canExecute());
            } else {
                System.out.println("Das Verzeichnis ist nicht da!");
                dir.mkdir(); // Erzeugt das Verzeichnis
                //dir.mkdirs(); // Erzeugt alle Verzeichnisse
            }


            System.out.println();

            if (file.exists()) {
                System.out.println("NAME: " + file.getName());
                System.out.println("Größe: " + file.length() + " Bytes");

                System.out.println("DATEI: " + file.isFile());
                System.out.println("VERZEICHNIS: " + file.isDirectory());

                // Informationen über das Filesystem
                System.out.println(file.getFreeSpace());
                System.out.println(file.getTotalSpace());
                System.out.println(file.getUsableSpace());

                System.out.println("BEARBEITET: " + new Date(file.lastModified()));

                // file.delete(); // Löschen

            }
            else {
                System.out.println("Datei ist nicht da!");
                file.createNewFile(); // Erzeugt eine neue Datei
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
