package de.lubowiecki.auffrischung.oop;

import java.time.LocalDate;

public class Person {

    private String vorname;

    private String nachname;

    private LocalDate geburtsDatum;

    public Person() {
    }

    public Person(String vorname, String nachname, LocalDate geburtsDatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsDatum = geburtsDatum;
    }

    public Person(String vorname, String nachname, String geburtsDatum) {
        this(vorname, nachname, LocalDate.parse(geburtsDatum));
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

    public LocalDate getGeburtsDatum() {
        return geburtsDatum;
    }

    public void setGeburtsDatum(LocalDate geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
    }

    @Override
    public String toString() {
        return new StringBuilder(vorname)
                    .append(", ")
                    .append(nachname)
                    .append(", ")
                    .append(geburtsDatum)
                    .toString();
    }

    // equels, hashCode, compareTo

}
