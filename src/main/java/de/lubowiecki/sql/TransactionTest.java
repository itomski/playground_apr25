package de.lubowiecki.sql;

import de.lubowiecki.sql.kundenverwaltung.DBUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionTest {

    public static void main(String[] args) {

        try(Connection conn = DBUtils.getConnoction()) {

            // Automatisches Absenden von Statements abschalten
            conn.setAutoCommit(false);
            try(Statement stmt = conn.createStatement()) {

                stmt.executeUpdate("UPDATE kunden SET vorname = 'Steve' WHERE id = 3");
                stmt.executeUpdate("UPDATE kunden SET vorname = 'Bruce' WHERE id = 4");
                stmt.executeUpdate("UPDATE kunden SET vorname = 'Carol' WHERE id = 7");
                conn.commit(); // Alle Anweisungen gemeinsam abschicken

            }
            catch (SQLException e) {
                conn.rollback(); // Alle Anweisungen rückgängig machen
                throw e; // Exception an das catch der Connection weiterreichen
            }
            finally {
                // Automatisches Absenden von Statements wieder einschalten
                conn.setAutoCommit(true);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
