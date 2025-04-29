package de.lubowiecki.oop;

public class Lebewesen {


    // Wird nicht vererbt (da private)
    private int alter;

    public Lebewesen() {
        System.out.println("C: Lebewesen");
    }

    public Lebewesen(int alter) {
        this.alter = alter;
    }

    // Wird vererbt (da public)
    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void printInfo() {
        System.out.println("Alter: " + alter);
    }
}
