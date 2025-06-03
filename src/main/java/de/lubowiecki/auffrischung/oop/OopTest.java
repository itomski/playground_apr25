package de.lubowiecki.auffrischung.oop;

public class OopTest {

    public static void main(String... args) {

        // Klassenvariablen behalten ihren Wert bis zum Ende des Programms
        System.out.println(Zeug.andereZahl);
        Zeug.andereZahl += 15; // können den Wert verändern
        System.out.println(Zeug.andereZahl);

        System.out.println();

        // Instanzvariablen sind nur über Objekte verfügbar
        //System.out.println(Zeug.zahl); // Error: Über die Klasse nicht verwendbar
        Zeug z1 = new Zeug();
        Zeug z2 = new Zeug();
        System.out.println(z1.zahl); // Wird über das Objekt verwendet
        z1.zahl += 20; // Verändert nur das entsprechende Objekt
        System.out.println(z1.zahl);
        System.out.println(z2.zahl);

        System.out.println();
        // Zugriff über das Objekt ist erlaubt. Der Wert wird trotzdem aus der Klasse gelesen
        System.out.println(z1.andereZahl);
        System.out.println(z2.andereZahl);

        System.out.println();
        z2.andereZahl += 10;
        System.out.println(z1.andereZahl);
        System.out.println(z2.andereZahl);
        System.out.println(Zeug.andereZahl);




    }
}
