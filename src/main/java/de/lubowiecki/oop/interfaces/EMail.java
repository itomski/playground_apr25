package de.lubowiecki.oop.interfaces;

import java.time.LocalDateTime;

public class EMail implements Verschickbar {

    private final String from;

    private final String to;

    private final String subject;

    private final String body;

    private final LocalDateTime createdAt;

    public EMail(String from, String to, String subject, String body) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.body = body;
        createdAt = LocalDateTime.now();
    }

    public void send() {
        System.out.println("Nachricht von: " + createdAt);
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
        System.out.println("Verschickt am: " + LocalDateTime.now());
    }
}
