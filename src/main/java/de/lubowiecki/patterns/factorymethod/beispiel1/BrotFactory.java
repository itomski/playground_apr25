package de.lubowiecki.patterns.factorymethod.beispiel1;

public class BrotFactory implements ProductFactory {


    @Override
    public Product create() {
        return new Brott("Krustenbrot", 2.99);
    }
}
