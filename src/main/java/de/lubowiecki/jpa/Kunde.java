package de.lubowiecki.jpa;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "kunden")
public class Kunde {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 25)
    private String vorname;

    @Column(length = 25)
    private String nachname;

    private LocalDate geburtsDatum;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adress_id", referencedColumnName = "id")
    private Adresse adresse;

    @OneToMany(mappedBy = "kunde", cascade = CascadeType.PERSIST)
    private Set<Fahrzeug> fahrzeuge;

    public Kunde() {
    }

    public Kunde(String vorname, String nachname, LocalDate geburtsDatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsDatum = geburtsDatum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDate getGeburtsDatum() {
        return geburtsDatum;
    }

    public void setGeburtsDatum(LocalDate geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Set<Fahrzeug> getFahrzeuge() {
        return fahrzeuge;
    }

    public void setFahrzeuge(Set<Fahrzeug> fahrzeuge) {
        this.fahrzeuge = fahrzeuge;
    }

    public void addFahrzeug(Fahrzeug fahrzeug) {
        if(this.fahrzeuge == null)
            fahrzeuge = new HashSet<>();

        fahrzeuge.add(fahrzeug);
        fahrzeug.setKunde(this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kunde{");
        sb.append("id=").append(id);
        sb.append(", vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append(", geburtsDatum=").append(geburtsDatum);
        sb.append('}');
        return sb.toString();
    }
}
