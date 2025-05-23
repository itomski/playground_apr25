package de.lubowiecki.patterns.composite;

public class WordDoc implements Printable {

    @Override
    public void print() {
        System.out.println("WordDoc wird gedruckt...");
    }
}
