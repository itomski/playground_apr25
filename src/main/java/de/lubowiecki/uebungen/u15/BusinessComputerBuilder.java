package de.lubowiecki.uebungen.u15;

public class BusinessComputerBuilder implements ComputerBuilder {


    @Override
    public Computer build() {
        return new Computer("Dell", "i5, 2 Core", 16, 100);
    }
}
