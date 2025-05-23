package de.lubowiecki.uebungen.u15;

public class DeveloperComputerBuilder implements ComputerBuilder {

    @Override
    public Computer build() {
        return new Computer("Mac", "M4", 32, 2000);
    }
}
