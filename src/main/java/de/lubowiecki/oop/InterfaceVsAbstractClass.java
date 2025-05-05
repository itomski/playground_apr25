package de.lubowiecki.oop;

public class InterfaceVsAbstractClass {

    public static void main(String[] args) {

        // Über eine Referenz des Interface sind nur Methode des Interface aufrufbar
        Bewegbar bauer1 = new Bauer(0,0);
        System.out.println(bauer1);
        bauer1.setX(2);
        System.out.println(bauer1);
        bauer1.bewege();
        System.out.println(bauer1);

        System.out.println();

        Bewegbar pferd1 = new Pferd(0,1);
        System.out.println(pferd1);
        pferd1.bewege();
        System.out.println(pferd1);

        // Abstrakte Klassen werden zum Vererben von Inventar benutzt
        // Spielstein s1 = new Spielstein(10,10);

        // Interface beschreibt NUR die öffentliche Schnittstelle für ein Objekt
        // öffentliche Schnittstelle = aufrufbare (public) Methoden (d.h. Was kann aufgerufen werden)

    }
}

// Abstrakte Klassen vererben Eigenschaften und Methode
// Manche Methoden können abstrakt sein d.h. sie müssen in der Kindklasse eigebaut werden
// Von einer abstrakten Klasse können keine Objekte gebaut werden

abstract class Spielstein implements Bewegbar {

    private int x;
    private int y;

    public Spielstein(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Die Bewegung kann hier noch nicht konkret eingebaut werden,
    // da noch nicht klar ist, welcher Spielstein es sein wird

    // Hat eine Klasse eine abstrakte Methode, muss sie selbst auch
    // abstrakt sein
    public abstract void bewege(); // abstrakt = Noch nicht fertig

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Bauer extends Spielstein {

    public Bauer(int x, int y) {
        super(x, y);
    }

    // Die geerbte abstrakte Methode wird hier eingebaut
    @Override
    public void bewege() {
        setX(getX() + 1);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bauer: ");
        sb.append("x: ").append(getX()).append(", ").append("y: ").append(getY());
        return sb.toString();
    }
}

class Pferd extends Spielstein {

    public Pferd(int x, int y) {
        super(x, y);
    }

    // Die geerbte abstrakte Methode wird hier eingebaut
    @Override
    public void bewege() {
        setX(getX() + 2);
        setY(getY() + 1);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pferd: ");
        sb.append("x: ").append(getX()).append(", ").append("y: ").append(getY());
        return sb.toString();
    }
}

interface Bewegbar {

    // in einem Interface sind alle Methoden automatisch public
    void setX(int x);

    void setY(int y);

    void bewege();
}

//class Koenig implements Bewegbar {
//}
