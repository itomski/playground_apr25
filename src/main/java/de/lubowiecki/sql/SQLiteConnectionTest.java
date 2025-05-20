package de.lubowiecki.sql;

import java.sql.*;

public class SQLiteConnectionTest {

    private static final String URL = "jdbc:sqlite:" + System.getProperty("user.home") + "/kunden.db";

    public static void main(String[] args) {

        createTable(); // Erzeugt die Tabelle, wenn noch nicht vorhanden

//        if(createRecord("Carol", "Danvers")) {
//            System.out.println("Gespeichert");
//        }

        getRecords();
    }

    // Liest Daten aus der Tabelle und zeigt diese an
    public static void getRecords() {

        try(Connection connection = DriverManager.getConnection(URL);
            Statement stmt = connection.createStatement()) {

            String sql = "SELECT * FROM kunden";

            ResultSet results = stmt.executeQuery(sql);

            while(results.next()) {
                System.out.println(
                    results.getInt("id") + ", " +
                    results.getString("vorname") + ", " +
                    results.getString("nachname")
                );
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Speichert Daten in der Tabelle
    public static boolean createRecord(String vorname, String nachname) {

        try(Connection connection = DriverManager.getConnection(URL);
            Statement stmt = connection.createStatement()) {

            String sql = "INSERT INTO kunden (id, vorname, nachname) VALUES(NULL, '%s', '%s')";
            sql = String.format(sql, vorname, nachname); // Platzhalter werden durch Daten ersetzt

            return stmt.executeUpdate(sql) > 0;
        }
        catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Erzeugt die Tabelle
    private static void createTable() {

        try(Connection connection = DriverManager.getConnection(URL);
            Statement stmt = connection.createStatement()) {

            /*
            id  | vorname   | nachname  | strasse   | nr    | plz   | ort
            1    Peter       Parker      Musterweg   22      23456    Musterstedt
             */

            final String SQL_TABLE = "CREATE TABLE IF NOT EXISTS kunden (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "vorname TEXT NOT NULL," +
                    "nachname TEXT NOT NULL," +
                    "strasse TEXT," +
                    "nr TEXT," +
                    "plz TEXT," +
                    "ort TEXT)";

            stmt.execute(SQL_TABLE); // Befehl ausführen
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
