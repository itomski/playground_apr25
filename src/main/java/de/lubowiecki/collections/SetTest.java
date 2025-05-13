package de.lubowiecki.collections;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {

        // Referenztyp: Set (Interface)
        // Objekttyp: HashSet (vollständige, instanzierbare Klasse)
        Set<String> namen = new HashSet<>();
        System.out.println("Hinzugefügt? " + namen.add("Peter"));
        System.out.println("Hinzugefügt? " + namen.add("Carol"));
        System.out.println("Hinzugefügt? " + namen.add("Steve"));

        System.out.println(namen);

        for(String name : namen) {
            System.out.println(name);
        }

        System.out.println(namen.contains("Peter"));

        System.out.println("Hinzugefügt? " + namen.add("Steve"));

        System.out.println(namen);
    }
}
