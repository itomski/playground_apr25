package de.lubowiecki.sql.kundenverwaltung;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {

    // Port beim XAMP steht auf 3306
    private static final String URL = "jdbc:mysql://localhost:8889/kundenverwaltung";
    private static final String USER = "root";
    private static final String PASSWORD = "root"; // Bei XAMPP ist es leer

    public static Connection getConnoction() throws SQLException {

        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
