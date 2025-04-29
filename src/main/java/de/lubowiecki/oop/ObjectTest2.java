package de.lubowiecki.oop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ObjectTest2 {

    public static void main(String[] args) {

        List<Object> elements = new ArrayList<>();
        elements.add(100);
        elements.add("Hallo List");
        elements.add(LocalDate.now());
        elements.add(new Student("AB221799X", "Peter", "Parker", 22));
        elements.add(new Tier());

        for(Object o : elements) {
            System.out.println(o); // toString();
        }
    }
}
