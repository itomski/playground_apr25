package de.lubowiecki.oop;

public class UeberschreibenTest {

    public static void main(String[] args) {

        // Referenztyp = Mensch
        // m1 = Variablenname
        // Objekttyp = Mensch
        Mensch m1 = new Mensch("Peter", "Parker", 22);

        // Referenztyp = Lebewesen
        // Objekttyp = Mensch
        Lebewesen l1 = new Mensch("Bruce", "Banner", 38);

        // Eigenschaften und Klassenmethoden (static) werden auf dem Referenztyp ausgeführt
        // Instanzmethoden werden auf dem Objekttyp ausgeführt

        m1.printInfo();

        System.out.println();

        l1.printInfo();

    }
}
