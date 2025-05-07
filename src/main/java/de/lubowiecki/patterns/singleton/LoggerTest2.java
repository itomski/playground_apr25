package de.lubowiecki.patterns.singleton;

public class LoggerTest2 {

    public void machWas() {

        Logger.getInstance().log("machWas", "...");
        machWasAnderes();

        machWasGanzAnderes();
    }

    public void machWasGanzAnderes() {
        Logger.getInstance().log("machWasGanzAnderes", "...");
    }

    public void machWasAnderes() {
        Logger.getInstance().log("machWasAnderes", null);
    }
}
