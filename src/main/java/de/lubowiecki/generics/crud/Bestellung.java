package de.lubowiecki.generics.crud;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Bestellung extends AbstractEntity {

    private LocalDateTime bestelltAm;
    private List<String> positionen = new ArrayList<>();
    private double preis;

    public Bestellung() {
    }

    public LocalDateTime getBestelltAm() {
        return bestelltAm;
    }

    public void setBestelltAm(LocalDateTime bestelltAm) {
        this.bestelltAm = bestelltAm;
    }

    public List<String> getPositionen() {
        return positionen;
    }

    public void addPositionen(String... position) {
        this.positionen.addAll(List.of(position));
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}
