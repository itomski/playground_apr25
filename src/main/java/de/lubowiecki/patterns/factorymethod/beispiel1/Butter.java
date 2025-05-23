package de.lubowiecki.patterns.factorymethod.beispiel1;

public class Butter implements Product{

    @Override
    public String getDescription() {
        return "Frische Alpen Butter, 80% Fett";
    }

    @Override
    public double getPrice() {
        return 1.99;
    }

    @Override
    public void use() {
        System.out.println("Butter wird zum Backen verwendet");
    }
}
