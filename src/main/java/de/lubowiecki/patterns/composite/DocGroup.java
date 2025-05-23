package de.lubowiecki.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class DocGroup implements Printable {

    private List<Printable> docs = new ArrayList<>();

    public DocGroup(Printable... docs) {
        this.docs.addAll(List.of(docs));
    }

    // Fügt mehrere Objekte nachträglich hinzu
    public void add(Printable... docs) {
        this.docs.addAll(List.of(docs));
    }

    // Fügt ein Objekt nachträglich hinzu
    public void add(Printable doc) {
        this.docs.add(doc);
    }


    @Override
    public void print() {
        System.out.println("Gruppe wird gedruckt:");
        // Delegiert die Print-Anweisung an alle Dokumente in der Gruppe
        for(Printable doc : docs) {
            doc.print();
        }
    }
}
