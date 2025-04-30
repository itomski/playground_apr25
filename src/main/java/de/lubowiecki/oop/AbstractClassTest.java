package de.lubowiecki.oop;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AbstractClassTest {

    public static void main(String[] args) {

        // Von abstreakten Klassen können keine Objekte erzeugt werden
        // AbstractTicket at1 = new AbstractTicket(); // Kompilererror

        //AbstractTicket at1 = new BasicTicket();
        AbstractTicket at1 = new PremiumTicket();
        PremiumTicket pt1 = new PremiumTicket();

        at1.print();

    }
}

// Abstrakte Klassen sind NICHT vollständig, daher können sie nicht direkt instanziert werden
abstract class AbstractTicket {

    private LocalDateTime gueltigAm;
    private String veranstaltung;

    // Erzwingt von den Kindklassen die Implementierung der Methode
    // Definiert, dass es diese Methode geben MUSS aber nicht, wie sie ausprogrammiert werden soll.
    public abstract void print();

    public LocalDateTime getGueltigAm() {
        return gueltigAm;
    }

    public void setGueltigAm(LocalDateTime gueltigAm) {
        this.gueltigAm = gueltigAm;
    }

    public String getVeranstaltung() {
        return veranstaltung;
    }

    public void setVeranstaltung(String veranstaltung) {
        this.veranstaltung = veranstaltung;
    }
}

class PremiumTicket extends AbstractTicket {

    private List<String> zusatzleistungen = new ArrayList<>();

    public void print() {
        final String TPL = "### PREMIUM ###\n" +
                            "Datum: %s \n" +
                            "Veranstaltung: %s \n" +
                            "Zusatzleistungen: %s\n\n";

        System.out.printf(TPL, getGueltigAm(), getVeranstaltung(), zusatzleistungen);
    }
}

class BasicTicket extends AbstractTicket {

    public void print() {
        final String TPL = "### BASIC ###\n" +
                "Datum: %s \n" +
                "Veranstaltung: %s \n\n";

        System.out.printf(TPL, getGueltigAm(), getVeranstaltung());
    }

}
