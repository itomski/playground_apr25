package de.lubowiecki.libs.excel;

public class Person {

    private int nr;
    private String vorname;
    private String nachname;

    public Person() {
    }

    public Person(int nr, String vorname, String nachname) {
        this.nr = nr;
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("nr=").append(nr);
        sb.append(", vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
