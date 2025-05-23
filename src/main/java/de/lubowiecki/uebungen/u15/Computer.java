package de.lubowiecki.uebungen.u15;

public class Computer {

    private final String marke;
    private final String cpu;
    private final int ram;
    private final int festplatte;

    public Computer(String marke, String cpu, int ram, int festplatte) {
        this.marke = marke;
        this.cpu = cpu;
        this.ram = ram;
        this.festplatte = festplatte;
    }

    public String getMarke() {
        return marke;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public int getFestplatte() {
        return festplatte;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("marke='").append(marke).append('\'');
        sb.append(", cpu='").append(cpu).append('\'');
        sb.append(", ram=").append(ram).append(" MB");
        sb.append(", festplatte='").append(festplatte).append(" GB").append('\'');
        sb.append('}');
        return sb.toString();
    }
}
