package de.lubowiecki.oop.interfaces;

import java.time.LocalDateTime;

public class SMS implements Verschickbar {

    private String fromNr;
    private String toNr;
    private String msg;

    public SMS(String fromNr, String toNr, String msg) {
        this.fromNr = fromNr;
        this.toNr = toNr;
        if(msg.length() > 120)
            msg = msg.substring(0, 120); // Verarbeitet nur 120 Zeichen

        this.msg = msg;
    }

    @Override
    public void send() {
        System.out.println("From: " + fromNr);
        System.out.println("To: " + toNr);
        System.out.println("Nachricht: " + msg);
        System.out.println("Verschickt am: " + LocalDateTime.now());
    }
}
