package de.lubowiecki;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(vorname, person.vorname) && Objects.equals(nachname, person.nachname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vorname, nachname);
    }
}
