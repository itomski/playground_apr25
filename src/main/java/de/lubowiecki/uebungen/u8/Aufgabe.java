package de.lubowiecki.uebungen.u8;

public class Aufgabe {

    /*
    Aufgabe 1:
    Schreibe eine Klasse, die einen Kursteilnehmer beschreibt.
    Bei der Instanzierung der Klasse wird eine Teilnehmernummer vergeben.
    Diese Nummer wird in einer Datei gespeichert, so dass beim nächten Programmaufruf
    und Instanzierung die nachfolgende Nummer vergeben wird.
     */

    public static void main(String[] args) {

//        TeilnehmernummerGenerator gen = TeilnehmernummerGenerator.getInstance();
//        System.out.println(gen.getNextNr());

        Teilnehmer t1 = new Teilnehmer("Peter", "Parker");
        Teilnehmer t2 = new Teilnehmer("Bruce", "Banner");
        Teilnehmer t3 = new Teilnehmer("Carol", "Danvers");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }

    /*
    Aufgabe 2:
    Schreibe ein Programm für eine Einkaufsliste.
    Über die Konsole oder Eigabefeld werden die Einträge abgefragt.
    Beim Verlassen des Programms wird die Liste serialisiert und in eine Datei gespeicht.
    Beim Programmstart sind die vorherigen Einträge wieder vorhanden.
    Das ganze kann als Konsolen-Programm oder über eine GUI (JavaFX) gelöst werden
     */

    /*
    Aufgabe 3:
    Schreibe eine Datei mit 5 Informationen, die mit einem Komma getrennt sind.
    Beim Start des Programms werden diese 5 Informationen eingelesen und in einem Array von Strings
    bereitgestellt.

    5 Informationen: Name der App, Kurzbeschreibung, Adminuser, Adminpassword, Sprache
    Beispiel: Todolist, Eine Liste mit Todods, tlubo, geheim, deutsch
     */

}
