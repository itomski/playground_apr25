package de.lubowiecki.io;

public class Robot {

    private String name;

    private String typ;

    public Robot(String name, String typ) {
        this.name = name;
        this.typ = typ;
    }

    public String getName() {
        return name;
    }

    public String getTyp() {
        return typ;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Robot{");
        sb.append("name='").append(name).append('\'');
        sb.append(", typ='").append(typ).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
