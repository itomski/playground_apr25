package de.lubowiecki.oop.interfaces;

import java.time.LocalDateTime;

public class Message implements Verschickbar {

    private final String content;

    private final LocalDateTime createdAt;

    private boolean alreadySent = false;

    public Message(String text) {
        content = text;
        createdAt = LocalDateTime.now();
    }

    public void send() {
        System.out.println("Nachricht von: " + createdAt);
        System.out.println("Inhalt: " + content);
        System.out.println("Verschickt am: " + LocalDateTime.now());
        alreadySent = true;
    }
}
