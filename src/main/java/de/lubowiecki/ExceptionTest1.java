package de.lubowiecki;

public class ExceptionTest1 {

    public static void main(String[] args) {

        System.out.println("--- START: main() ---");
        try {
            machWas1();
        }
        catch(NullPointerException e) {
            System.out.println("BEHANDLUNG in main()");
            // e.printStackTrace();
        }
        System.out.println("--- ENDE: main() ---");

    }

    private static void machWas1() {
        System.out.println("--- START: machWas1() ---");
        machWas2();
        System.out.println("--- ENDE: machWas1() ---");
    }

    private static void machWas2() {
        System.out.println("--- START: machWas2() ---");
        machWas3();
        System.out.println("--- ENDE: machWas2() ---");
    }

    private static void machWas3() {
        System.out.println("--- START: machWas3() ---");
        try {
            machWas4();
        }
        catch(NullPointerException e) {
            System.out.println("BEHANDLUNG in machWas3()");
        }
        System.out.println("--- ENDE: machWas3() ---");
    }

    private static void machWas4() {
        System.out.println("--- START: machWas4() ---");
        // String s = null;
        // s.toLowerCase(); // NullPointerException

        int[] arr = new int[2];
        System.out.println(arr[2]);

        System.out.println("--- ENDE: machWas4() ---");
    }
}
