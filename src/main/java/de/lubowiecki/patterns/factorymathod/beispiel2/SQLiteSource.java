package de.lubowiecki.patterns.factorymathod.beispiel2;

public class SQLiteSource implements Source {

    @Override
    public void save(Object... obj) throws Exception {

        // Verbindung aufbauen
        // Prüfen, ob Tabelle vorhanden
        // Wenn nicht - Tabelle erzeugen
        // Datenspeichern
    }
}
