package de.lubowiecki.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionTest {

    public static void main(String[] args) {

        //final String URL = "jdbc:mysql://localhost:3306/library"; // XAMPP
        final String URL = "jdbc:mysql://localhost:8889/library";
        final String USER = "root";
        final String PASSWORD = "root";

        try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Verbindung: OK");
        }
        catch(SQLException e) {
            System.out.println("Verbindung: Fehlerhaft!");
            e.printStackTrace();
        }
    }
}
