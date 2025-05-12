package de.lubowiecki;

import java.io.*;
import java.util.Properties;

public class ReadConfigTest {

//    private static final String FILE = "config.properties";
    private static final String FILE = "config.xml";

    public static void main(String[] args) {


        // Schreiben
//        try {
//            Properties props = new Properties();
//            props.setProperty("benutzer", "p.parker");
//            props.setProperty("vorname", "Peter");
//            props.setProperty("nachname", "Parker");
//            props.setProperty("email", "p.parker@shield.org");
//            props.setProperty("passwort", "geheim#123");
//            //props.setProperty("alter", "25");
//            save(props);
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }

        // Lesen
        try {
            Properties props = load();
            System.out.println(props.get("benutzer"));
            System.out.println(props.get("passwort"));
            //System.out.println(props.get("alter"));
            System.out.println(props.getOrDefault("alter", "unbekannt"));
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    private static void save(Properties props) throws IOException {
        // Property schreiben (als properties-File)
//        try(Writer out = new FileWriter(FILE)) {
//            props.store(out, null);
//        }

        // Property schreiben (als XML-File)
        try(OutputStream out = new FileOutputStream(FILE)) {
            props.storeToXML(out, null);
        }
    }

    private static Properties load() throws IOException {
        Properties props = new Properties(); // Leere Configuration

        // Property lesen (als properties-File)
//        try(Reader out = new FileReader(FILE)) {
//            props.load(out);
//        }

        // Property lesen (als XML-File)
        try(InputStream in = new FileInputStream("config.xml")) {
            props.loadFromXML(in); // Daten aus der Datei laden
            return props;
        }
    }
}
