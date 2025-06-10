package de.lubowiecki.auffrischung.collections;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ArrayVsCollection {

    public static void main(String[] args) {

        IntConsumer cons = zahl -> System.out.print(zahl + ", ");

        // Bietet nur eine Info über die Länge des Arrays
        int[] arr = new int[10]; // FixedSize
        print(arr, cons);

        System.out.println();

        // Bietet eine Menge unterschiedlicher Methoden
        List<Integer> zahlen = new ArrayList<>(); // Flexible Größe
        zahlen.add(100);
        zahlen.add(300);
        zahlen.add(200);
        print(zahlen, cons);
        // print(zahlen, System.out::println);


        int[][] arr2d = new int[3][4];
        /*
        0: {0,0,0,0},
        1: {0,0,0,0},
        2: {0,0,0,0},
         */

        List<List<Integer>> zeilen = new ArrayList<>();
        zeilen.add(List.of(10, 20, 30, 40));
        zeilen.add(List.of(20, 30, 40, 50));
        zeilen.add(List.of(30, 40, 50, 60));

        /*
        0: {10,20,30,40},
        1: {20,30,40,50},
        2: {30,40,50,60},
         */

        System.out.println();

        // Kalender
        Map<LocalDate, List<Termin>> cal = new TreeMap<>();
        List<Termin> heutigeTermine  = cal.get(LocalDate.now());

        cal.put(LocalDate.now(), new ArrayList<>()); // Liste für den Tag wird angelegt
        List<Termin> termine = cal.get(LocalDate.now()); // Liefert die Liste für den aktuellen Tag
        termine.add(new Termin(LocalTime.now(), "Essen mit Peter", "..."));
        termine.add(new Termin(LocalTime.of(15, 22), "Meeting", "..."));
        termine.add(new Termin(LocalTime.of(10, 15), "Kick-Off-Meeting", "..."));
        termine.add(new Termin(LocalTime.of(18, 0), "Status", "..."));
        Collections.sort(termine);

        for(Map.Entry<LocalDate, List<Termin>> eintrag : cal.entrySet()) {
            System.out.println(eintrag.getKey());
            for(Termin t : eintrag.getValue()) {
                System.out.println(t);
            }
            System.out.println("-----------");
        }
    }

    private static void print(int[] values, IntConsumer cons) {
        for(int i : values)
            //System.out.print(i + ", ");
            cons.accept(i);
    }

    private static void print(List<Integer> values, IntConsumer cons) {
        for(int i : values)
            //System.out.println(i + ", ");
            cons.accept(i);
    }

}
