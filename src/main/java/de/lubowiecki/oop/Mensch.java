package de.lubowiecki.oop;

public class Mensch extends Lebewesen {

    // Alle nicht-privaten Eigenschaften und Methoden von Lebewesen werden geerbt

    // Accesss-Modi: atomatisch package-private (wenn nichts anderes da steht)
    private String vorname;
    private String nachname;

    public Mensch() {
        //super();
        System.out.println("C: Mensch");
    }

    public Mensch(String vorname, String nachname) {
        this(vorname, nachname, 0); // Aufruf eines anderen Konstruktors dieser Klasse
    }

    public Mensch(String vorname, String nachname, int alter) {
        super(alter); // Konstruktor von Lebewesen mit einem Parameter wird verwendet
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    // Überschreiben = etwas geerbtes ersetzen
    @Override
    public void printInfo() {
        super.printInfo(); // Ruft die printInfo aus der Elternklasse auf
        System.out.println("Vorname: " + vorname);
        System.out.println("Nachname: " + nachname);
    }
}
