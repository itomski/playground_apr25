package de.lubowiecki.jpa;

import jakarta.persistence.*;

@Entity
@Table(name = "fahrzeuge")
@NamedQuery(name = "Fahrzeug.findAll", query = "SELECT f FROM Fahrzeug f") // JPQL
public class Fahrzeug {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 16)
    private String kennzeichen;

    @Column(length = 25)
    private String marke;

    @Column(length = 50)
    private String modell;

    private int baujahr;

    public Fahrzeug() {
    }

    public Fahrzeug(String kennzeichen, String marke, String modell, int baujahr) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fahrzeug{");
        sb.append("id=").append(id);
        sb.append(", kennzeichen='").append(kennzeichen).append('\'');
        sb.append(", marke='").append(marke).append('\'');
        sb.append(", modell='").append(modell).append('\'');
        sb.append(", baujahr=").append(baujahr);
        sb.append('}');
        return sb.toString();
    }
}
