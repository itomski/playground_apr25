package de.lubowiecki.oop;

public class ConstruktorTest2 {

    public static void main(String[] args) {




    }
}

class A {

    public A() {
    }

    // Default-Constructor wird nicht mehr bereitgestellt
    public A(boolean aktiv) {
        System.out.println("C: A = " + aktiv);
    }

    public A(int nr) {
        System.out.println("C: A = " + nr);
    }
}

class B extends A {

    // Default-Constructor
    public B() {
        // super(); // Es gibt keinen parameterlosen Konstruktor in A
        super(false); // OK
    }
}
