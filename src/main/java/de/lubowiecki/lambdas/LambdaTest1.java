package de.lubowiecki.lambdas;

import java.util.List;

public class LambdaTest1 {

    public static void main(String[] args) {

        MathOperation add = (x, y) -> x + y; // Hier wird das Wort return NICHT verwendet

        MathOperation sub = (a, b) -> {
            return a - b; // Hat die Methode einen Rückgabetyp, MUSS ein return verwendet werden
        };

        System.out.println(add.execute(10, 15));
        System.out.println(add.execute(20, 15));
        System.out.println(add.execute(30, 15));

        System.out.println();

        System.out.println(sub.execute(30, 15));

        Output console1 = (v) -> System.out.println("\n" + v);

        Output console2 = (v) -> {
            System.out.println("\n------------------------------------");
            System.out.println(v);
            System.out.println("------------------------------------");
        };

        console1.print("Das ist das Haus von Nikigraus");

        console2.print("Das ist das Haus von Nikigraus");

        System.out.println();

        List<String> namen = List.of("Peter", "Bruce", "Carol", "Natasha", "Steve");
        //printList(namen, console1);
        //printList(namen, console2);
        printList(namen, s -> System.err.println(s));

    }

    public static void printList(List<String> list, Output out) {

        for(String s : list) {
            out.print(s);
        }
    }
}

// Jedes Lambda basiert auf einem FunctionalInterface
// FunctionalInterface = ein Interface mit einer einizigen abstrakten Methode

@FunctionalInterface
interface MathOperation {

    double execute(double a, double b);

}

@FunctionalInterface // Prüft die Einhaltung der Vorgaben für ein FunctionalInterface. Ist Optional
interface Output {

    void print(String v);


    String toString();

}