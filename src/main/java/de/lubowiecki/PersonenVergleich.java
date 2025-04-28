package de.lubowiecki;

public class PersonenVergleich {

    public static void main(String[] args) {

        Person p1 = new Person("Peter", "Parker");
        Person p2 = new Person("Peter", "Stark");

        System.out.println(p1 == p2); // Referenzverglich

        // Wenn eine Klasse equals nicht selbst einbaut, erbt sie diese Methode von der Klasse Object
        System.out.println(p1.equals(p2)); // Inhaltsvergleich

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.hashCode() == p2.hashCode());

    }
}
