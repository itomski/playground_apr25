package de.lubowiecki.uebungen.u16.aufgabe2;

public class Drohne implements Movable {

    private static int count;

    private int nr;

    private int x;
    private int y;
    private int z;

    public Drohne(int x, int y, int z) {
        this();
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Drohne() {
        this.nr = ++count;
    }

    public void changePosition(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Drone{");
        sb.append("nr=").append(nr);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", z=").append(z);
        sb.append('}');
        return sb.toString();
    }
}
