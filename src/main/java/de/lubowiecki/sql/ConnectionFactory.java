package de.lubowiecki.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    //private static final String URL = "jdbc:mysql://localhost:3306/library"; // XAMPP
    private static final String URL = "jdbc:mysql://localhost:8889/library";
    private static final String USER = "root";
    private static final String PASSWORD = "root"; // Unter XAMPP ist das Passwort leer

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
