package de.lubowiecki.oop.interfaces;

import java.util.Scanner;

public class Server {

    private final Scanner scanner = new Scanner(System.in);
    private MessageFactory factory = new MessageFactory(scanner);

    public void run() {

        System.out.println("Server wurde gestartet.");

        app: while(true) {

            System.out.print("\nNächste Nachricht? ");

            if(scanner.next().equalsIgnoreCase("nein")) break app;

            scanner.nextLine(); // fix

            Verschickbar msg = create();
            msg.send();
        }

        System.out.println("Server wurde untergefahren.");
    }

    private Verschickbar create() {
        System.out.print("Was willst du haben? ");
        String auswahl = scanner.nextLine().toLowerCase();
        return factory.create(auswahl);
    }
}
