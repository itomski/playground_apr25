package de.lubowiecki.oop;

public class Student extends Mensch {

    private String matrikelNr;

    public Student() {
        System.out.println("C: Student");
    }

    public Student(String matrikelNr, String vorname, String nachname, int alter) {
        super(vorname, nachname, alter); // Aufruf des Konstruktors von Mensch
        this.matrikelNr = matrikelNr;
    }

    public String getMatrikelNr() {
        return matrikelNr;
    }

    public void setMatrikelNr(String matrikelNr) {
        this.matrikelNr = matrikelNr;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getVorname()).append(", ")
                .append(getNachname()).append(", ")
                .append(getAlter()).append(", ")
                .append(matrikelNr);
        return sb.toString();
    }
}
