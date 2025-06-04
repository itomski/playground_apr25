package de.lubowiecki.auffrischung.oop.produktverwaltung;

import lombok.*;
import lombok.extern.jackson.Jacksonized;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
//@Data
public abstract class Produkt { // abstract = Es kann nicht instanziert werden

    // Abstrakte Klassen können auch Konstruktoren haben
    // Diese werden bei Vererbung in den Konstruktoren der Kindklassen verwendet

    // Alle privaten Eigenschaften sind in der Kindklasse NICHT direkt sichtbar
    // es müssen Getter und Setter verwendet werden
    private int nr;
    private double preis;
    private String name;

    // Alle public und protected Eigenschaften sind in der Kindklasse sichtbar
    protected String beschreibung;

}
