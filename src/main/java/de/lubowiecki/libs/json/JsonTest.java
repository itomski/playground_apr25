package de.lubowiecki.libs.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JsonTest {

    private static final String JSON_FILE = "messages.json";

    public static void main(String[] args) {

//        for(Field f : Message.class.getDeclaredFields()) {
//            System.out.println(f.getName());
//        }
//
//        for(Method m : Message.class.getDeclaredMethods()) {
//            System.out.println(m.getName());
//        }

        // writeJsonToFile();
        readJsonFromFile();

        System.out.println("ENDE");
    }

    private static void readJsonFromFile() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        CollectionType type = mapper.getTypeFactory()
                .constructCollectionType(List.class, Message.class);

        try {
            List<Message> messages = mapper.readValue(new FileReader(JSON_FILE), type);

            for(Message m : messages) {
                System.out.println(m);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeJsonToFile() {
        List<Message> messages = new ArrayList<>();
        messages.add(new Message(3, "Neue Zölle", "Und schon wieder neue Zölle aus USA", "p.parker", LocalDate.now().minusDays(2)));
        messages.add(new Message(4, "Doch keine neuen Zölle", "Zölle schon wieder ausgesetzt", "b.banner", LocalDate.now().minusDays(1)));
        messages.add(new Message(5, "Stimmung angespannt", "In der Wirtschaft ist die Stimmung weiter angespannt", "p.parker", LocalDate.now()));

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule()); // Modul für Java 8 Time/Date-Typen wird eingebunden

        try {
            mapper.writeValue(new FileWriter(JSON_FILE), messages);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
