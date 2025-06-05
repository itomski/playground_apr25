package de.lubowiecki.auffrischung.oop;

public class InterfaceDefaultTest {
}

interface A {

    void machWas();

    default void machWasAnderes() {
        System.out.println("A");
    }
}

interface B {

    void machWas();

    default void machWasGanzAnderes() {
        System.out.println("B: machWasGanzAnderes");
    }

    default void machWasAnderes() {
        System.out.println("B: machWasAnderes");
    }
}

// Eine Klasse darf nur von einer anderen Klasse erben (extends)
// Eine Klasse darf mehrere Interfaces implementieren (implements)
class C implements A, B {

    @Override
    public void machWas() {

    }

    // Konflikt, da beide Interfaces diese Methode weitergeben
    // Lösung: Die erbende Klasse stellt eine eigene Metode zur Verfügung und nutzt nicht die aus dem Interface
    @Override
    public void machWasAnderes() {

    }
}