package de.lubowiecki.patterns.adapter;

import java.time.LocalDateTime;

public class Server {

    public Server() {
        System.out.println(LocalDateTime.now() + ": Server wurde gestartet.");
    }

    public void send(Message msg) {
        System.out.println(LocalDateTime.now() + ": Nachricht wird verarbeitet.");
        msg.submit();
    }
}
