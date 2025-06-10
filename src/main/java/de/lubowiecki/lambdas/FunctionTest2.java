package de.lubowiecki.lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionTest2 {

    public static void main(String[] args) {

        // Double apply (Integer t)
        Function<Integer, Double> func1 = i -> i + 0.0;
        Function<Integer, Integer> func2 = i -> i + 10;
        UnaryOperator<Integer> func3 = i -> i + 10;

        // R apply (T t, U u)
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(10, 15));
        System.out.println(add.apply(11, 22));

        BinaryOperator<Integer> add2 = (a, b) -> a + b;

        BiFunction<Integer, Integer, Integer> sub = (a, b) -> a - b;
        System.out.println(sub.apply(17, 1));

        BiFunction<String, Integer, Character> find = (s, i) -> s.charAt(i);
        System.out.println(find.apply("Das ist das Haus von Nikigraus", 19));
    }
}
