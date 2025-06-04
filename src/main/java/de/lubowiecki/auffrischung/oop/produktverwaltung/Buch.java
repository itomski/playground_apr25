package de.lubowiecki.auffrischung.oop.produktverwaltung;

import lombok.Data;

@Data
public class Buch extends Produkt { // Buch IS-A Produkt

    private String isbn;

    public Buch() {
    }

    public Buch(int nr, double preis, String name, String beschreibung, String isbn) {
        super(nr, preis, name, beschreibung);
        this.isbn = isbn;
    }
}
