package de.lubowiecki.patterns.singleton;

public class SingletonTest {

    /*
    Sichert zu, dass zu jedem Zeitpunt es nur ein einziges Objekt der Klasse gibt
    */

    public static void main(String[] args) {

        EagerSingleton es1 = EagerSingleton.getInstance();
        EagerSingleton es2 = EagerSingleton.getInstance();
        EagerSingleton es3 = EagerSingleton.getInstance();

        es1.up();
        System.out.println(es1.getCount());

        es2.up();
        System.out.println(es1.getCount());

        es1.up();
        System.out.println(es3.getCount());
        System.out.println(EagerSingleton.getInstance().getCount());




    }

}
