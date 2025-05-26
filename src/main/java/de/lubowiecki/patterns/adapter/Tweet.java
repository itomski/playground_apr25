package de.lubowiecki.patterns.adapter;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Tweet {

    private String author;
    private String group;
    private String title;
    private String body;
    private String[] tags;

    public Tweet(String author, String group, String title, String body, String... tags) {
        this.author = author;
        this.group = group;
        this.title = title;
        this.body = body;
        this.tags = tags;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String... tags) {
        this.tags = tags;
    }

    public void post() {
        StringBuilder sb = new StringBuilder("\n------ POST TWEET -------");
        sb.append("\nSTART: ")
                .append("\n\tAUTHOR: \t").append(author)
                .append("\n\tGROUP: \t").append(group)
                .append("\n\tTITLE: \t").append(title)
                .append("\n\tBODY: \t").append(body)
                .append("\n\tTAGS: \t").append(Arrays.toString(tags))
                .append("\nEND...\n");

        System.out.println(sb);
    }

}
