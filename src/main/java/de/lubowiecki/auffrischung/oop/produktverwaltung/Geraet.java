package de.lubowiecki.auffrischung.oop.produktverwaltung;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Geraet extends Produkt {

    private LocalDate garantieBis;

    public Geraet() {
    }

    public Geraet(int nr, double preis, String name, String beschreibung, LocalDate garantieBis) {
        super(nr, preis, name, beschreibung);
        this.garantieBis = garantieBis;
    }
}
