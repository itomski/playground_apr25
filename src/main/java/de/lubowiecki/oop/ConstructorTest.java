package de.lubowiecki.oop;

public class ConstructorTest {

    public static void main(String[] args) {

        Lebewesen l1 = new Lebewesen();

        System.out.println();

        Mensch m1 = new Mensch();

        System.out.println();

        //Student s1 = new Student();
        Student s1 = new Student("AB22178X", "Peter", "Parker", 19);

    }
}
