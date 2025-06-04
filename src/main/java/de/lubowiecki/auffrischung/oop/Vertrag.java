package de.lubowiecki.auffrischung.oop;

import java.time.LocalDate;

public class Vertrag {

    private LocalDate start;

    private LocalDate ende;

    // HAS-A
    private Person vertragsPartner1;

    private Person vertragsPartner2;

    private Status status;

    public Vertrag() {
    }

    public Vertrag(LocalDate start, LocalDate ende, Person vertragsPartner1, Person vertragsParner2, Status status) {
        this.start = start;
        this.ende = ende;
        this.vertragsPartner1 = vertragsPartner1;
        this.vertragsPartner2 = vertragsParner2;
        this.status = status;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public void setStart(String start) {
        this.start = LocalDate.parse(start);
    }

    public LocalDate getEnde() {
        return ende;
    }

    // Überladen = Verschiedene Versionen einer Methode werden in der gleichen Klasse deklariert

    public void setEnde(LocalDate ende) {
        this.ende = ende;
    }

    public void setEnde(String ende) {
        this.ende = LocalDate.parse(ende);
    }

    public Person getVertragsPartner1() {
        return vertragsPartner1;
    }

    public void setVertragsPartner1(Person vertragsPartner1) {
        this.vertragsPartner1 = vertragsPartner1;
    }

    public Person getVertragsPartner2() {
        return vertragsPartner2;
    }

    public void setVertragsPartner2(Person vertragsPartner2) {
        this.vertragsPartner2 = vertragsPartner2;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vertrag \n");
        sb.append("Start: ").append(start).append("\n");
        sb.append("Ende: ").append(ende).append("\n");
        sb.append("Partner 1: ").append(vertragsPartner1).append("\n");
        sb.append("Partner 2: ").append(vertragsPartner2).append("\n");
        sb.append("Status: ").append(status).append("\n");
        return sb.toString();
    }
}
