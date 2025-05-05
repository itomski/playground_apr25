package de.lubowiecki.uebungen.u6;

public class Computer implements Verbraucher {
    @Override
    public void an() {
        System.out.println("Computer bootet");
    }

    @Override
    public void aus() {
        System.out.println("Computer wird untergefahren");
    }
}
