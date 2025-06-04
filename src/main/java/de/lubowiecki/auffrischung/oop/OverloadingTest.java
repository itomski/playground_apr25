package de.lubowiecki.auffrischung.oop;

public class OverloadingTest {

    public static void main(String[] args) {

        machWas();
        machWas(true);
        machWas(1);
        machWas(1, 10.99);
        machWas(10.99, 2);

        // Beim Überladen MUSS sich die Parameterliste unterscheiden
        // Name der Methode bleibt gleich
        // Anzahl der Parameter, Reihenfolge, Datentypen MÜSSEN unterschiedlich sein
        // Zugriff und Exceptions KÖNNEN unterschiedlich sein

    }

    public static void machWas() {
        System.out.println("MACH_WAS1");
    }

    public static void machWas(boolean enabled) {
        System.out.println("MACH_WAS2");
    }

    public static void machWas(int statusCode) {
        System.out.println("MACH_WAS3");
    }

    public static void machWas(int code, double price) {
        System.out.println("MACH_WAS4");
    }

    public static void machWas(double price, int code) {
        System.out.println("MACH_WAS5");
    }
}
