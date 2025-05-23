package de.lubowiecki.patterns.factorymethod.beispiel1;

public class StreichFettFactory implements ProductFactory {

    @Override
    public Product create() {
        return new Butter();
    }
}
