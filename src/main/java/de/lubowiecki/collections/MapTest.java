package de.lubowiecki.collections;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        Map<String, Integer> einwohner = new HashMap<>();
        einwohner.put("Hamburg", 1_900_000);
        einwohner.put("München", 1_500_000);
        einwohner.put("Kiel", 250_000);
        einwohner.put("Leipzig", 630_000);

        System.out.println(einwohner.get("Hamburg"));
        System.out.println(einwohner.get("Halle")); // null, wenn nicht vorhanden
        System.out.println(einwohner.getOrDefault("Halle", -1));
        System.out.println(einwohner.getOrDefault("Leipzig", -1));

        System.out.println();

        for(String key : einwohner.keySet()) {
            System.out.println(key + ": " + einwohner.get(key));
        }

        System.out.println();

        for(Integer val : einwohner.values()) {
            System.out.println(val);
        }
    }
}
