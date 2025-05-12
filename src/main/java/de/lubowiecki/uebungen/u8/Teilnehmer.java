package de.lubowiecki.uebungen.u8;

public class Teilnehmer {

    private final int nr;
    private final String vorname;
    private final String nachname;

    public Teilnehmer(String vorname, String nachname) {
        this.nr = TeilnehmernummerGenerator.getInstance().getNextNr();
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public int getNr() {
        return nr;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Teilnehmer{");
        sb.append("nr=").append(nr);
        sb.append(", vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
