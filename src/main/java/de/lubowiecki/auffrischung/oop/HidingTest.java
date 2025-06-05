package de.lubowiecki.auffrischung.oop;

public class HidingTest {

    public static void main(String[] args) {

        // Referenztyp: Thing
        // Objekttyp: Thing
        Thing t1 = new Thing();
        System.out.println(t1.content);
        t1.getInfo();
        System.out.println(t1.getContent());

        System.out.println();

        // Referenztyp: SpecialThing
        // Objekttyp: SpecialThing
        SpecialThing t2 = new SpecialThing();
        System.out.println(t2.content);
        t2.getInfo();
        System.out.println(t2.getContent());

        System.out.println();

        // Referenztyp: Thing
        // Objekttyp: SpecialThing
        Thing t3 = new SpecialThing();
        // Eigenschaften werden auf dem Referenztyp aufgerufen
        System.out.println(t3.content);
        // Klassenmethoden (static) werden auf dem Referenztyp aufgerufen
        t3.getInfo();
        // Instanz-Methoden werden auf dem Objekttyp aufgerufen
        System.out.println(t3.getContent());
    }
}

class Thing {

    protected String content = "Thing";

    public String getContent() {
        return content;
    }

    public static void getInfo() {
        System.out.println("Info über Thing");
    }
}

class SpecialThing extends Thing {

    String content = "SpecialThing";

    // Beim Überschreiben
    // MUSS die Signatur der Methode gleiche bleiben
    // Rückgabetyp muss gleich oder Kovariant sein
    // Zugriff darf nicht einschränkender sein
    // Keine neuen CheckedExceptions
    @Override
    public String getContent() {
        return content;
    }

    // Hiding
    public static void getInfo() {
        System.out.println("Info über SpecialThing");
    }
}
