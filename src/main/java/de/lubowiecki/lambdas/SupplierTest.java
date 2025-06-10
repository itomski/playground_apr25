package de.lubowiecki.lambdas;

import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class SupplierTest {

    public static void main(String[] args) {

        // R get()
        // Integer get()
        Supplier<Integer> roll = () -> (int)(Math.random() * 6) + 1;

        System.out.println(roll.get());
        System.out.println(roll.get());
        System.out.println(roll.get());
        System.out.println(roll.get());
        System.out.println(roll.get());

        System.out.println();

        // int getAsInt()
        IntSupplier rollNext = () -> (int)(Math.random() * 6) + 1;
        System.out.println(rollNext.getAsInt());
        System.out.println(rollNext.getAsInt());
        System.out.println(rollNext.getAsInt());
        System.out.println(rollNext.getAsInt());

        System.out.println();

        // Streams verarbeiten große Datenmengen

        IntStream.generate(rollNext)
                .filter(i -> i != 5)
                .forEach(i -> System.out.println(i));


    }
}
