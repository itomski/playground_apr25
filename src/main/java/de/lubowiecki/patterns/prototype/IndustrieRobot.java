package de.lubowiecki.patterns.prototype;

public class IndustrieRobot implements Robot {

    private static int count;

    private int nr;

    private String aufgabe;

    private String status;

    public IndustrieRobot(String aufgabe, String status) {
        this.nr = ++count;
        this.aufgabe = aufgabe;
        this.status = status;
    }

    public int getNr() {
        return nr;
    }

    public String getAufgabe() {
        return aufgabe;
    }

    public void setAufgabe(String aufgabe) {
        this.aufgabe = aufgabe;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("IndustrieRobot{");
        sb.append("nr=").append(nr);
        sb.append(", aufgabe='").append(aufgabe).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IndustrieRobot clone() {
        return new IndustrieRobot(getAufgabe(), getStatus());
    }
}
