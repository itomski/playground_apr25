package de.lubowiecki;

public class Basics {

    public static void main(String[] args) {

        Person p1 = new Person("Peter", "Parker"); // Instanz
        //p1.vorname = "Peter"; // Error: ist privat
        p1.setVorname("Carol");
        System.out.println(p1.getVorname());

        Person p2 = new Person(); // Instanz
        p2.setVorname("Bruce");
        System.out.println(p2.getVorname());

        // Aufruf der Klassenmethode erfolgt direkt auf der Klasse
        Basics.printHi();

        // Instanzmethoden brauchen IMMER erstmal ein Objekt
        Basics b = new Basics();
        b.printHallo();

    }

    // Instanzmethode (ohne Static)
    // Können nur auf Objekten (Instanzen einer Klasse) ausgeführt werden
    private void printHallo() {
        System.out.println("Hallo");
    }

    // Klassenmethode (static)
    // Können direkt auf dem Bauplan (Klasse) ausgeführt werden
    private static void printHi() {
        System.out.println("Hi");
        System.err.println("Hi");
    }

    // Methoden sind Funktionen, die zu einer Klasse gehören
}

// Freie funktionen gibt es in Java NICHT!!!!
//function machWas() {
//    //...
//}
