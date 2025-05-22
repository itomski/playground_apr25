package de.lubowiecki.locale;

import java.util.HashMap;
import java.util.Map;

public class LanguageFactory {

    public static Map<String, String> getLang(String lang) {

        return switch(lang.toLowerCase()) {
            case "de" -> de();
            case "en" -> en();
            default -> de();
        };
    }

    private static Map<String, String> de() {
        Map<String, String> lang = new HashMap<>();
        lang.put("greeting", "Moin Moin");
        lang.put("question.name", "Wie ist dein Name? ");
        lang.put("exception.name", "Falsche Eingabe!");
        lang.put("output.name", "Dein Name ist ");
        return lang;
    }

    private static Map<String, String> en() {
        Map<String, String> lang = new HashMap<>();
        lang.put("greeting", "Hello");
        lang.put("question.name", "What's your name? ");
        lang.put("exception.name", "Wrong input!");
        lang.put("output.name", "Your name ist ");
        return lang;
    }
}
