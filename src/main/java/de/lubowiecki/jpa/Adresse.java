package de.lubowiecki.jpa;

import jakarta.persistence.*;

@Entity
@Table(name = "adressen")
public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50)
    private String strasse;

    @Column(length = 20)
    private String nr;

    @Column(length = 10)
    private String plz;

    @Column(length = 25)
    private String ort;

    @OneToOne(mappedBy = "adresse")
    private Kunde kunde;

    public Adresse() {
    }

    public Adresse(String strasse, String nr, String plz, String ort) {
        this.strasse = strasse;
        this.nr = nr;
        this.plz = plz;
        this.ort = ort;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Adresse{");
        sb.append("id=").append(id);
        sb.append(", strasse='").append(strasse).append('\'');
        sb.append(", nr='").append(nr).append('\'');
        sb.append(", plz='").append(plz).append('\'');
        sb.append(", ort='").append(ort);
        sb.append('}');
        return sb.toString();
    }
}
