package de.lubowiecki.uebungen.u1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        List<Location> locations = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int i = 0;

        while(i < 3) {
            System.out.print("Auswahl: ");
            Location loc = createLocation(scanner.next().toLowerCase());
            if (loc != null) {
                locations.add(loc);
                i++;
            }
        }

        //Location l1 = new Location("Zelt", 19.99);
        //locations.add(new Zeltplatz());

        //Location l2 = new Location("Wohnwagen", 39.99);
        //locations.add(new Wohnwagen());

        //Location l3 = new Location("Mobilhome", 52.99);
        //locations.add(new Mobilhome());

        //locations.add(new Location("Gosse", 9.99));

        for(Location loc : locations) {
            // instanceof prüft welches Objekt hinter der Referenz hängt
            if(loc instanceof Zeltplatz) System.out.println("Z...");
            System.out.println(loc);
        }
    }

    private static Location createLocation(String auswahl) {

        Location loc = switch(auswahl) {
            case "zelt" -> {
                System.out.println("Neuer Zeltplatz wird erzeugt");
                // return new Zeltplatz(); // Verlässt die Methode und liefert den Wert zurück
                yield new Zeltplatz(); // Verlässt das switch und liefert den Wert zurück
            }
            case "mobilhome" -> {
                System.out.println("Neues Mobilhome wird erzeugt");
                yield new Mobilhome();
            }
            case "wohnwagen" -> {
                System.out.println("Neuer Wohnwagen wird erzeugt");
                yield new Wohnwagen();
            }
            default -> null;
        };

        return loc;
    }

}
