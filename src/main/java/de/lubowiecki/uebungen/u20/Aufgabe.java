package de.lubowiecki.uebungen.u20;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Aufgabe {

    /*
    Schreibe ein FunctionalInterface zur Transformation von String in int

    Schreibe ein FunctionalInterface zur Transformation von int in String

    Teste beides durch definition von Lambdas
     */

    public static void main(String[] args) {

        Transformator<String, Integer> stringToInt = s -> Integer.parseInt(s);

        System.out.println(stringToInt.transform("123") + 5);

        Transformator<Integer, String> intToString = i -> i + "";

        System.out.println(intToString.transform(123) + 5);

        Transformator<String, LocalDate> stringToLocalDate = s -> LocalDate.parse(s);

        LocalDate ld = stringToLocalDate.transform("2020-10-15");
        System.out.println(ld.plusDays(2));

        Transformator<String, LocalDate> deStringToLocalDate = s -> {
            DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            return LocalDate.parse(s, FMT);
        };

        ld = deStringToLocalDate.transform("15.10.2025");
        System.out.println(ld.plusDays(2));

        Transformator<String, List<String>> strToStrList = s -> {
            String[] arr = s.split(",");
            return new ArrayList<>(List.of(arr));
        };

        for(String n : strToStrList.transform("Peter,Bruce,Carol,Tony,Steve")) {
            System.out.println(n);
        }
    }
}

@FunctionalInterface
interface Transformator<T, R> {

    R transform(T t);

}

class StringToLocalDateTransformator implements Transformator<String, LocalDate> {

    @Override
    public LocalDate transform(String s) {
        return LocalDate.parse(s);
    }
}