package de.lubowiecki.io;

import java.io.*;
import java.time.Duration;
import java.time.Instant;

public class ReadTest {

    public static void main(String[] args) {

        File dir = new File("data/");
        File file = new File(dir, "namen.txt");

        Instant start = Instant.now();

        if(file.exists()) {

            try {
                BufferedReader in = new BufferedReader(new FileReader(file));

                String line = null;
                while((line = in.readLine()) != null) {
                    System.out.println(line);
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("Datei nicht vorhanden!");
        }

        Instant ende = Instant.now();

        System.out.println();

        System.out.println(Duration.between(start, ende).toNanos() + "ns");

    }
}
