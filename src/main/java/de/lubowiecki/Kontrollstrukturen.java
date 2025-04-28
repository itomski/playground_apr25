package de.lubowiecki;

public class Kontrollstrukturen {

    public static void main(String[] args) {

        int i = 10;
        while(i > 0) {
            System.out.println(i--);
        }

        System.out.println();

        i = 10;

        do {
            System.out.println(i);
        } while(i-- > 0);

        System.out.println();

        for(int j = 0; j < 10; j++) {
            System.out.println(j);
        }

        System.out.println();

        String[] namen = {"Peter", "Carol", "Bruce", "Steve"};
        for(String name : namen) {
            System.out.println(name);
        }

        System.out.println();

        int rand = (int)(Math.random() * 6) + 1;

        switch(rand) {
            case 1:
                System.out.println("A");
                break;

            case 2:
            System.out.println("B");
                break;

            case 3:
            System.out.println("C");
                break;

            default:
                System.out.println("X");
        }

        System.out.println();

        switch(rand) {
            case 1 -> System.out.println("A");
            case 2 -> System.out.println("B");
            case 3 -> System.out.println("C");
            default -> System.out.println("X");
        }

        String s = switch(rand) {
            case 1 -> "A";
            case 2 -> "B";
            case 3 -> "C";
            default -> "X";
        };

        System.out.println(s);

        System.out.println();

        if(i > 0) {
            System.out.println(">");
        }
        else {
            System.out.println("<");
        }

        String erg = null;

        if(i > 0) {
            erg = ">";
        }
        else {
            erg = "<";
        }

        System.out.println(erg);

        // ternary operator
        erg = (i > 0) ? ">" : "<";
        System.out.println(erg);

        System.out.println((i > 0) ? ">" : "<");

    }
}
