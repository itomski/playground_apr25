package de.lubowiecki.uebungen.u14;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Logger {

    private static Logger instance;

    private List<String> protokoll = new ArrayList<>();

    private Logger() {
    }

    public static Logger getInstance() {
        if(instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String msg) {
        //System.out.println(LocalDateTime.now() + ": " + msg);
        protokoll.add(LocalDateTime.now() + ": " + msg);
    }

    public void printProtokoll() {
        for(String eintrag : protokoll)
            System.out.println(eintrag);
    }
}
