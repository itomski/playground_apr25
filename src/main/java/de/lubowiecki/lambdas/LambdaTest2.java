package de.lubowiecki.lambdas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LambdaTest2 {

    private static int zahl = 10;

    public static void main(String[] args) {

        List<String> namen = new ArrayList<>();
        namen.add("Tony");
        namen.add("Scott");
        namen.addAll(List.of("Peter", "Bruce", "Carol", "Natasha", "Steve"));

        for(String name : namen) {
            System.out.println(name);
        }

        System.out.println();

        for(int i = 0; i < namen.size(); i++) {
            System.out.println(namen.get(i++));
        }

        System.out.println();

        Iterator<String> itr = namen.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println();

        namen.forEach(name -> System.out.println(name));
        namen.forEach(System.out::println);

        String s = ":::::";

        namen.forEach(name -> System.out.println("\t#" + name.toUpperCase() + s + zahl));

        // s = "....."; // Lokale Variablen, die in einem Lambda verwendet werden, dürfen sich nicht mehr ändern
        zahl = 20; // Instanzvariablen dürfen sich ändern

        System.out.println();

    }
}
