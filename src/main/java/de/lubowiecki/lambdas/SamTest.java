package de.lubowiecki.lambdas;

public class SamTest {

    public static void main(String[] args) {

        // void machWas()
        Sam1 s1 = () -> System.out.println("Moin...");
        s1.machWas();

        // int machWas(int a, int b);
        Sam2 s2 = (x,y) -> x * y;
        System.out.println(s2.machWas(10, 15));

        // Double machWas(String t);
        Sam3<String, Double> s3 = s -> Double.parseDouble(s);
        System.out.println(s3.machWas("100.5") + 10);

    }
}

interface Sam1 {
    void machWas();
}

interface Sam2 {
    int machWas(int a, int b);
}

interface Sam3<T, R> {
    R machWas(T t);
}