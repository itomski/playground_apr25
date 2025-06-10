package de.lubowiecki.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicatTest {

    public static void main(String[] args) {

        List<String> namen = new ArrayList<>(List.of("Peter", "Bruce", "Tony", "Jack", "Carol", "Scott", "Natasha"));

        System.out.println(namen);

        // ConcurrentModificationException
//        for(String name : namen) {
//            if(name.length() != 5)
//                namen.remove(name);
//        }


        // i wird einfach weitergezählt
//        for(int i = 0; i < namen.size(); i++) {
//            if(namen.get(i).length() != 5) {
//                namen.remove(i);
//            }
//        }
//        System.out.println(namen);

        // boolean test(T t)
        Predicate<String> istNicht5ZeichenLang = n -> n.length() != 5;
        namen.removeIf(istNicht5ZeichenLang);
        // namen.removeIf(n -> n.length() != 5); // auch möglich

        System.out.println(namen);

    }
}
