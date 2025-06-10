package de.lubowiecki.auffrischung.collections;

import java.time.LocalTime;

public class Termin implements Comparable<Termin> {

    private LocalTime start;

    private String title;

    private String description;

    public Termin(LocalTime start, String title, String description) {
        this.start = start;
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Termin{");
        sb.append("start=").append(start);
        sb.append(", title='").append(title).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Termin other) {
        return start.compareTo(other.start);
    }
}
