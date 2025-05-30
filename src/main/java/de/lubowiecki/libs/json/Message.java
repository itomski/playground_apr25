package de.lubowiecki.libs.json;

import java.time.LocalDate;

public class Message {

    private int nr;
    private String title;
    private String description;
    private String author;
    private LocalDate createdAt;

    public Message() {
    }

    public Message(int nr, String title, String description, String author, LocalDate createdAt) {
        this.nr = nr;
        this.title = title;
        this.description = description;
        this.author = author;
        this.createdAt = createdAt;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Message{");
        sb.append("nr=").append(nr);
        sb.append(", title='").append(title).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", createdAt=").append(createdAt);
        sb.append('}');
        return sb.toString();
    }
}
