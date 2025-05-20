package de.lubowiecki.sql;

public class Book {

    private int id;
    private String title;
    private int publication;
    private String author;

    public Book() {
    }

    public Book(int id, String title, int publication, String author) {
        this.id = id;
        this.title = title;
        this.publication = publication;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublication() {
        return publication;
    }

    public void setPublication(int publication) {
        this.publication = publication;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
