package de.lubowiecki;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTest {

    public static void main(String[] args) {

        // Log4j

        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        logger.log(Level.INFO, "..."); // gleich wie logger.info("...");
        logger.setLevel(Level.OFF);

        logger.info("Irgendwelche Infos");
//        logger.fine("Fein");
//        logger.finer("Feiner");
//        logger.finest("Noch Feiner");

        logger.config("Konfigs");

        logger.warning("Warnungen");
        logger.severe("Schwere Probleme");
    }
}
