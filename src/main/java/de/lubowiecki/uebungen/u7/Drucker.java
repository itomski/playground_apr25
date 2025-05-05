package de.lubowiecki.uebungen.u7;

public class Drucker {

    public void printDocument(Printable doc) {
        doc.print();
    }

    public void printDocument(Printable... docs) {
        for(Printable doc : docs) {
            doc.print();
        }
    }
}
