package de.lubowiecki;

public class Person {

    private String vorname;

    private String nachname;

    // Parameterloser Konstruktor: Erzeugt ein leeres Objekt
    public Person() {
    }

    // Erzeugt ein Objekt mit vorgegebenen Werten
    public Person(String vorname, String nachname) {
        // vorname = Parameter (lokale Variable)
        // this.vorname = Instanzvariable
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        // Eventuelle Validierung
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
}
