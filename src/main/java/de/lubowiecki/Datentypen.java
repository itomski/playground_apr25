package de.lubowiecki;

public class Datentypen {

    public static void main(String[] args) {

        // primitive
        // byte < short < int < long < float < double
        //         char <
        // boolean

        // primitive Datentypen können nur einen Wert aufnehmen und ihn wiedergeben
        // haben KEINE Eigenschaften und KEINE Methoden

        // int = Standard für Ganzzahlen
        // double = Standard für Zahlen mit Nachmommastelle

        // bei Mathematischen operationen promovieren die Werte immer zum größten Typ
        // aber mind. zu int

        byte b1 = 1;
        byte b2 = 1;
        // byte sum = b1 + b2; // Error: Math. Operation führt zu int

        // komplexe: Werden IMMER durch eine KLASSE definiert
        // String, Person
        // Komplexe Datentypen bestehen oft aus mehreren Eigenschaften und haben oft Methoden

        String s = "Hallo";
    }
}
