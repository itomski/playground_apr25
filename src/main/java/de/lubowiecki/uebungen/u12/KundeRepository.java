package de.lubowiecki.uebungen.u12;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class KundeRepository {

    // CRUD: Create Read Update Delete

    private static final String URL = "jdbc:mysql://localhost:8889/kundenverwaltung";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private static final String TABLE = "kunden";

    // TODO: Zugagnsdaten auslagern
    // TODO: insert und update gegen SQLInjection absichern

    public boolean insert(Kunde kunde) throws SQLException {
        // Speichert Kunden-Datensätze in der DB

        final String SQL_TPL = "INSERT INTO " + TABLE + " (id, vorname, nachname, geburtsdatum) " +
                                "VALUES (NULL, '%s', '%s', '%s')";

        try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                Statement stmt = conn.createStatement()) {

            // SQL-Vorlage mit Daten aus dem Objekt füllen
            final String SQL = String.format(SQL_TPL, kunde.getVorname(), kunde.getNachname(), kunde.getGeburtsdatum());
            // Anweisung an die Datenbank schicken
            if(stmt.executeUpdate(SQL, Statement.RETURN_GENERATED_KEYS) > 0) {
                // TODO: vergebene ID abfragen
                ResultSet ids = stmt.getGeneratedKeys();
                ids.next();
                kunde.setId(ids.getInt(1)); // id wird dem Objekt hinzugefügt
                return true;
            }
            return false;
        }
    }

    public List<Kunde> findAll() throws SQLException {
        // Liest alle Kunden-Datensätze aus der DB
        final String SQL = "SELECT * FROM " + TABLE;

        try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement stmt = conn.createStatement()) {

            // Anweisung an die Datenbank schicken
            ResultSet results = stmt.executeQuery(SQL);

            List<Kunde> kunden = new ArrayList<>();

            while(results.next()) {
                // Tabellendaten in ein Kundenobjekt verpacken
                Kunde kunde = createKunde(results);
                // Kundenobjekt der Liste hinzufügen
                kunden.add(kunde);
                // kunden.add(createKunde(results));
            }
            return kunden;
        }
    }

    public Kunde findById(int id) throws SQLException {
        // Liest einen Kunden-Datensatz aus der DB

        final String SQL = "SELECT * FROM " + TABLE + " WHERE id = " + id;

        try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement stmt = conn.createStatement()) {

            // Anweisung an die Datenbank schicken
            ResultSet results = stmt.executeQuery(SQL);
            if(results.next()) {
                // Tabellendaten in ein Kundenobjekt verpacken
                return createKunde(results);
            }
            return null;
        }
    }

    // Wandelt Tabelendaten in Kundenobjekte um
    private static Kunde createKunde(ResultSet results) throws SQLException {
        Kunde kunde = new Kunde();
        kunde.setId(results.getInt("id"));
        kunde.setVorname(results.getString("vorname"));
        kunde.setNachname(results.getString("nachname"));
        kunde.setGeburtsdatum(results.getDate("geburtsdatum").toLocalDate());
        return kunde;
    }

    public boolean update(Kunde kunde) throws SQLException {
        // Update für einen Kunden-Datensatz
        final String SQL_TPL = "UPDATE " + TABLE + " SET " +
                "vorname = '%s', nachname = '%s', geburtsdatum = '%s' WHERE id = %d";

        try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement stmt = conn.createStatement()) {

            // SQL-Vorlage mit Daten aus dem Objekt füllen
            final String SQL = String.format(SQL_TPL, kunde.getVorname(), kunde.getNachname(), kunde.getGeburtsdatum(), kunde.getId());
            // Anweisung an die Datenbank schicken
            return stmt.executeUpdate(SQL) > 0;
        }
    }

    public boolean delete(Kunde kunde) throws SQLException {
        // Löscht einen Kunden-Datensatz in der DB
        return deleteById(kunde.getId());
    }

    public boolean deleteById(int id) throws SQLException {
        // Löscht einen Kunden-Datensatz nach seiner id
        final String SQL = "DELETE FROM " + TABLE + " WHERE id = " + id;

        try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement stmt = conn.createStatement()) {

            // Anweisung an die Datenbank schicken
            return stmt.executeUpdate(SQL) > 0;
        }
    }
}
