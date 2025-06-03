package de.lubowiecki;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTest {

    public static void main(String[] args) {

        String text = "Das ist das Haus von Nikigraus";
        // Muster festlegen
        Pattern muster = Pattern.compile("haus", Pattern.CASE_INSENSITIVE);
        Matcher matcher = muster.matcher(text); // Text prüfen

        if(matcher.find()) {
            System.out.println("Gefunden");
        }
        else {
            System.out.println("Nicht gefunden");
        }

        System.out.println();

        // Kürzer. Für Validation nutzbar
        // Entspricht der Text einer bestimmten Vorgabe (einem Muster)

        text = "Nikig123";

        if(text.matches("^[A-Za-z0-9]{2,10}$")) {
            System.out.println("Ok");
        }
        else {
            System.out.println("Nicht ok");
        }

        System.out.println();

        System.out.println();

        String email = "Nikig123@abc.d";

        // * = 0 oder mehrmals
        // + = mindestens einmal
        // ? = einmal oder gar nicht

        if(email.matches("^[A-Za-z0-9._]+@[A-Za-z0-9]+\\.[A-Za-z0-9]{2,6}$")) {
            System.out.println("Ok");
        }
        else {
            System.out.println("Nicht ok");
        }
    }
}
