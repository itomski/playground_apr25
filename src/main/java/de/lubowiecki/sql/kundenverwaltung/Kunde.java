package de.lubowiecki.sql.kundenverwaltung;

import java.time.LocalDate;

public class Kunde {

    private int id;
    private String vorname;
    private String nachname;
    private LocalDate geburtsDatum;

    public Kunde() {
    }

    public Kunde(int id, String vorname, String nachname, LocalDate geburtsDatum) {
        this(vorname, nachname, geburtsDatum);
        this.id = id;
    }

    public Kunde(String vorname, String nachname, LocalDate geburtsDatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsDatum = geburtsDatum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        final StringBuilder sb = new StringBuilder("Kunde{");
        sb.append("id=").append(id);
        sb.append(", vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append(", geburtsDatum=").append(geburtsDatum);
        sb.append('}');
        return sb.toString();
    }
}
