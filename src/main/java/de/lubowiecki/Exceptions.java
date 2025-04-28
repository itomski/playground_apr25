package de.lubowiecki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {

        String[] namen = {"Peter", "Carol", "Steve"};

        Scanner scanner = new Scanner(System.in);
        //Scanner scanner = null;

        try {
            System.out.print("Auswahl: ");
            int auswahl = scanner.nextInt();
            System.out.println(namen[auswahl]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Falscher Index!");
        }
        catch(InputMismatchException e) {
            System.out.println("Falsche Eingabe!");
        }
        catch(Exception e) {
            System.out.println("Sonstiger Fehler!");
        }
        finally { // Wird IMMER ausgeführt
            System.out.println("...");
        }
    }
}
