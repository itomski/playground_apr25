package de.lubowiecki.patterns.singleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Logger {

    // Der Singleton enthält eine statische Variable mit einer Instanz von sich selbst
    private static final Logger instance = new Logger();

    private static final DateTimeFormatter DATETIME_FMT = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

    private boolean debugMode = false;

    private Logger() {
    }

    public static Logger getInstance() {
        return instance;
    }

    public void log(String source, String msg) {
        if(debugMode)
            System.err.println(LocalDateTime.now().format(DATETIME_FMT) + ": " + source + " -> " + msg);
    }

    public void setDebugMode(boolean debugMode) {
        this.debugMode = debugMode;
    }
}
