package de.lubowiecki.collections;

import java.util.Set;
import java.util.TreeSet;

public class Einkaufsliste {

    public static void main(String[] args) {

        Set<String> einkaufsliste = new TreeSet<>(); // ist immer sortiert
        einkaufsliste.add("Käse");
        einkaufsliste.add("Zeitung");
        einkaufsliste.add("Butter");
        einkaufsliste.add("Gurke");
        einkaufsliste.add("Milch");
        einkaufsliste.add("Käse");

        for(String s : einkaufsliste) {
            System.out.println(s);
        }
    }
}
