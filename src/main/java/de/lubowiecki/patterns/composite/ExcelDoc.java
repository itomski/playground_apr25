package de.lubowiecki.patterns.composite;

public class ExcelDoc implements Printable {

    @Override
    public void print() {
        System.out.println("Excel-Tabelle wird gedruckt...");
    }

}
