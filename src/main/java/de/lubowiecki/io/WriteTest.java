package de.lubowiecki.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteTest {

    public static void main(String[] args) {

        final String FILE = "texte.txt";

        try(Scanner scanner = new Scanner(System.in);
                BufferedWriter out = new BufferedWriter(new FileWriter(FILE, true))) {

            System.out.print("Eingabe: ");
            out.append(scanner.nextLine());
            System.out.println("Gespeichert!");

           // out und scanner werden automatisch geschlossen
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
