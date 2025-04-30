package de.lubowiecki.uebungen.u3;

public abstract class AbstractRobot {

    private String name;

    public AbstractRobot(String name) {
        this.name = name;
    }

    public abstract void doTheJob();

    public abstract void introduce();

    public abstract void recharge();

}
