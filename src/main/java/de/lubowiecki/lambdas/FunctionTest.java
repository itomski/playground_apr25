package de.lubowiecki.lambdas;

import java.time.LocalDate;
import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {

        // R apply (T t)
        Function<String, LocalDate> strToLocalDate = s -> LocalDate.parse(s);
        LocalDate ld = strToLocalDate.apply("2020-10-02");
        ld = ld.plusMonths(1);
        System.out.println(ld);

    }
}
