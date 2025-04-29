package de.lubowiecki.oop;

// Erbt automatisch von Object
public class ObjectTest {

    public static void main(String[] args) {

        // m1 = Variable
        // Mensch = Datentyp (Referenztyp / komplexer Datentyp)
        Mensch m1 = new Mensch();

        System.out.println(m1.getAlter());
        System.out.println(m1.getVorname());
        System.out.println(m1.getNachname());

        // Ein Objekt ist vom Typ der Klasse und all seiner Elternklassen

        Lebewesen l1 = new Mensch();
        Mensch m2 = (Mensch) l1; // Nicht jedes Lebewesen ist ein Mensch, daher ein Cast nötig

        Lebewesen[] wesen = new Lebewesen[5];
        wesen[0] = new Mensch();
        wesen[1] = new Tier();
        wesen[2] = new Tier();
        wesen[3] = new Tier();
        wesen[4] = new Student();

        for(Lebewesen l : wesen) {
            System.out.println(l.getAlter());
        }

        System.out.println();


        Object[] elemente = new Object[5];
        elemente[0] = "Hallo"; // String ist ein Object
        elemente[1] = 100; // int wird zu Integer geboxt und Integer ist ein Object
        elemente[2] = new Mensch(); // Mensch ist ein Object
        elemente[3] = new Tier(); // Tier ist ein Object
        elemente[4] = new Student(); // Student ist ein Object



    }
}
