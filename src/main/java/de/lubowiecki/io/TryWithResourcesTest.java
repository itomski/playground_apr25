package de.lubowiecki.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResourcesTest {

    public static void main(String[] args) {

        // Bis Java 7

        FileOutputStream out = null;

        try {
            out = new FileOutputStream("data.txt");
            out.write(100);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            if(out != null)
                try {
                    out.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
        }

        // Try-With-Resources ab 7

        try(FileOutputStream out2 = new FileOutputStream("data.txt")) {
            out.write(100);
            // out2 wird beim Verlassen des try automatisch geschlossen
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // Try-With-Resources braucht nicht zwangsläufig
        // ein catch oder finally

        try(Scanner scanner = new Scanner(System.in)) {

        }
    }
}
