package de.lubowiecki.patterns.prototype;

public class PrototypeTest {

    public static void main(String[] args) {
        IndustrieRobot r1 = new IndustrieRobot("Holz schneiden", "Ok");
        System.out.println(r1);

        // Zustand eines Objektes wird als Basis für ein neues Objekt verwendet (als Prototyp)
        IndustrieRobot r2 = r1.clone();
        r2.setStatus("Defekt");
        System.out.println(r2);
    }
}
