package de.lubowiecki.lambdas;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {

        // List.of liefert eine FixedSize Liste
        List<String> namen = List.of("Bruce", "Natasha", "Tony", "Scott", "Carol");

        // void accept(T t)
        Consumer<String> consumer1 = s -> System.out.println("###" + s);
        Consumer<String> consumer2 = s -> System.out.println(s.toUpperCase());
        Consumer<String> consumer3 = System.out::println; // Methodenreferenz
        Consumer<String> consumer4 = consumer1.andThen(consumer2); // Verbindet 2 Consumer zu einem

        // Der Lambdaausdruc ist eine Referenz auf eine vorhandene Methode
        Consumer<String> consumer5 = ConsumerTest::printString;

        namen.forEach(consumer5);
    }

    public static void printString(String s) {
        System.out.println("..." + s + "...");
    }
}
