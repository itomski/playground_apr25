package de.lubowiecki.auffrischung.oop;

public class Zeug {

    // Instanzvariable
    public int zahl;

    // Klassenvariable
    public static int andereZahl;

    // Instanzmethode
    public void machWas() {
        // Haben Zugriff auf Instanzvariablen und Klassenvariaben
        // Haben Zugriff auf Instanzmethoden und Klassenmethoden
        System.out.println("Wert1: " + zahl);
        System.out.println("Wert2: " + andereZahl);
    }

    // Klassenmethode
    public static void machWasAnderes() {
        // Haben NUR Zugriff auf Klassenvariaben
        // Haben NUR Zugriff auf Klassenmethoden
        // System.out.println("Wert1: " + zahl); // zahl ist Instanzvariable - hier nicht verfügbar
        System.out.println("Wert2: " + andereZahl);
    }
}
