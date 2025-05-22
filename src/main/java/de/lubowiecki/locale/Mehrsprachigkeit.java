package de.lubowiecki.locale;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mehrsprachigkeit {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Map<String, String> lang = LanguageFactory.getLang("DE"); // Auswahl der Sprache

        System.out.println(lang.get("greeting"));

        System.out.print(lang.get("question.name"));

        try {
            String name = getName();
            System.out.println(lang.get("output.name") + name);
        }
        catch (Exception e) {
            System.out.println(lang.get("exception.name"));
        }

        try {
            machWas();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getName() throws Exception {
        String name = scanner.nextLine();
        if(name.length() < 2) {
            throw new Exception();
        }
        return name;
    }

    private static void machWas() throws IOException {
        machWasAnderes();
    }

    private static void machWasAnderes() throws IOException {
        machWasGanzAnderes();
    }

    private static void machWasGanzAnderes() throws IOException {
        String str = null;
        //System.out.println(str.length());
        throw new IOException("...");
    }

}
