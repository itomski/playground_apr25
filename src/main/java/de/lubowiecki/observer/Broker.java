package de.lubowiecki.observer;

import java.util.Observable;
import java.util.Observer;

public class Broker implements Observer {

    private String name;

    private Strategy strategy;

    public Broker(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void update(Observable o, Object arg) {

        // Reaktion des Brokers auf die Veränderung
        // Observable = Aktie, die beobachtet wird

        Stock stock = (Stock) o;

        switch(strategy) {
            case RISKY -> System.out.println(name + ": Kauft " + stock.getName());
            case NORMAL -> System.out.println(name + ": Hält " + stock.getName());
            case CAREFUL -> System.out.println(name + ": Verkauft " + stock.getName());
        }
    }
}
