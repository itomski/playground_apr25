package de.lubowiecki.uebungen.u6;

public class Lampe implements Verbraucher{
    @Override
    public void an() {
        System.out.println("Lampe geht an");
    }

    @Override
    public void aus() {
        System.out.println("Lampe geht aus");
    }
}
