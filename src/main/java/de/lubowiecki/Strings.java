package de.lubowiecki;

public class Strings {

    public static void main(String[] args) {

        // String Objekte sind NICHT veränderbar
        String name = "Peter";
        name = name.toLowerCase(); // Ein neues String Objekt wird erzeugt
        System.out.println(name);

        name += "..."; // name = name + "..."

        // StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("das ist ");
        sb.append("das Haus ");
        sb.append("von Nikigraus");
        System.out.println(sb); // toString wird benutzt
        String str = sb.toString();

        String output = "";
        for (int i = 0; i < 1_000; i++) {
            output += i;
        }
        System.out.println(output);

        int i = 10;
        int j = 20;

        System.out.println(i == j); // Wertevergleich

        System.out.println();

        String s1 = "Hallo"; // Landet im String Literal Pool
        String s2 = "Hallo"; // Verwendet den String Literal Pool
        String s3 = new String("Hallo"); // Landet NICHT im Pool

        System.out.println(s1 == s2); // Bei komplexen Datentypen: Referenzvergleich
        System.out.println(s1.equals(s2)); // Bei komplexen Datentypen: Wertevergleich

        System.out.println();

        System.out.println(s1 == s3); // Bei komplexen Datentypen: Referenzvergleich
        System.out.println(s1.equals(s3)); // Bei komplexen Datentypen: Wertevergleich


    }
}
