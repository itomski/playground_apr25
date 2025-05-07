package de.lubowiecki.patterns.singleton;

public class LoggerTest {

    public static void main(String[] args) {

        Logger.getInstance().setDebugMode(false);

        Logger.getInstance().log("main", "Start der Anwendung");
        machWas();

        LoggerTest2 lt2 = new LoggerTest2();
        lt2.machWas();
    }

    private static void machWas() {

        Logger.getInstance().log("machWas", "...");
        machWasAnderes();

        machWasGanzAnderes();
    }

    private static void machWasGanzAnderes() {
        Logger.getInstance().log("machWasGanzAnderes", "...");
    }

    private static void machWasAnderes() {
        Logger.getInstance().log("machWasAnderes", null);
    }
}
