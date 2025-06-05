package de.lubowiecki.generics;

import de.lubowiecki.auffrischung.oop.Person;
import de.lubowiecki.auffrischung.oop.produktverwaltung.Buch;
import de.lubowiecki.auffrischung.oop.produktverwaltung.Produkt;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {

        //List<String> list = new ArrayList<String>(); // Vor Java 1.7
        List<String> list = new ArrayList<>(); // Ab Java 1.7
        list.add("..."); // Verlangt den generischen Typ

        StringBox sb = new StringBox("Das ist das Haus von Nikigraus");
        IntBox ib = new IntBox(42);

        System.out.println();

        // Generische Typen sind IMMER komplex
        // d.h. für primitive Datentypen werden ihre WrapperKlassen verwendet
        Box<String> sb2 = new Box<>("Das ist das Haus von Nikigraus");
        Box<Integer> ib2 = new Box<>(42);
        Box<Produkt> pb2 = new Box<>(new Buch());

        // Ohne einen generischen Typ wird Objekct verwendet
        Box box = new Box(123);
    }
}

class StringBox {

    private String content;

    public StringBox(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

class IntBox {

    private int content;

    public IntBox(int content) {
        this.content = content;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }
}

class Box<T> {

    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
