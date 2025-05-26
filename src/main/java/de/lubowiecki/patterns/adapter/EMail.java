package de.lubowiecki.patterns.adapter;

import java.time.LocalDateTime;

public class EMail implements Message {

    private String from;
    private String to;
    private String subject;
    private String body;

    public EMail(String from, String to, String subject, String body) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.body = body;
    }

    @Override
    public void submit() {
        StringBuilder sb = new StringBuilder("\n------ SEND MAIL -------");
            sb.append("\nSTART: ").append(LocalDateTime.now())
                .append("\n\tFROM: \t").append(from)
                .append("\n\tTO: \t").append(to)
                .append("\n\tSUB: \t").append(subject)
                .append("\n\tBODY: \t").append(body)
                .append("\nEND...\n");

        System.out.println(sb);
    }
}
