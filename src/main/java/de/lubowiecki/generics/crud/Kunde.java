package de.lubowiecki.generics.crud;

public class Kunde extends AbstractEntity {

    private String vorname;
    private String nachname;
    private String email;

    public Kunde() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kunde{");
        sb.append("vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
