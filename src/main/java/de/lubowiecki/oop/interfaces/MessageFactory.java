package de.lubowiecki.oop.interfaces;

import java.util.Scanner;

public class MessageFactory {

    private Scanner scanner;

    public MessageFactory(Scanner scanner) {
        this.scanner = scanner;
    }

    public Verschickbar create(String art) {

        return switch(art) {
            case "msg" -> createMessage();
            case "email" -> createEMail();
            case "sms" -> createSMS();
            default -> null;
        };
    }

    private Message createMessage() {
        System.out.print("Nachricht: ");
        return new Message(scanner.nextLine());
    }

    private SMS createSMS() {
        System.out.print("FromNr: ");
        String fromNr = scanner.nextLine();
        System.out.print("ToNr: ");
        String toNr = scanner.nextLine();
        System.out.print("Nachricht: ");
        String msg = scanner.nextLine();
        return new SMS(fromNr, toNr, msg);
    }

    private EMail createEMail() {
        System.out.print("From: ");
        String from = scanner.nextLine();
        System.out.print("To: ");
        String to = scanner.nextLine();
        System.out.print("Subject: ");
        String subject = scanner.nextLine();
        System.out.print("Body: ");
        String body = scanner.nextLine();
        return new EMail(from, to, subject, body);
    }
}
