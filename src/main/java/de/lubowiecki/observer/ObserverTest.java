package de.lubowiecki.observer;

import java.util.Random;

public class ObserverTest {

    public static void main(String[] args) throws InterruptedException {

        Stock s1 = new Stock("Apple", 175.14);
        Stock s2 = new Stock("ASML", 661.30);

        s1.changePrice(0.3);
        s2.changePrice(-0.25);

        Broker b1 = new Broker("Peter Parker", Strategy.RISKY);
        Broker b2 = new Broker("Carol Danvers", Strategy.NORMAL);
        Broker b3 = new Broker("Bruce Banner", Strategy.CAREFUL);

//        s1.addObserver(b1);
//        s1.addObserver(b2);
//
//        s2.addObserver(b1);
//        s2.addObserver(b2);
//        s2.addObserver(b3);

        Random rand = new Random();

        while(true) {
            s1.changePrice(rand.nextDouble(0.5));
            s2.changePrice(rand.nextDouble(0.5));
            Thread.sleep(1000); // 1 Sek. warten
        }
    }
}
