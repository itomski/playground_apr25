package de.lubowiecki.sql;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    public List<Book> findAll() throws SQLException {

        //final String URL = "jdbc:mysql://localhost:3306/library"; // XAMPP
        final String URL = "jdbc:mysql://localhost:8889/library";
        final String USER = "root";
        final String PASSWORD = "root"; // Unter XAMPP ist das Passwort leer

        // Verbindung zu DB aufbauen
        try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement stmt = connection.createStatement()) {

            // Daten aus der Tabelle holen
            ResultSet results = stmt.executeQuery("SELECT * FROM books");

            List<Book> books = new ArrayList<>();

            // Tabellendaten in Book-Objekte verpacken
            while(results.next()) {
                int id = results.getInt("id");
                String title = results.getString("title");
                int publication = results.getInt("publication");
                String author = results.getString("author");
                books.add(new Book(id, title,publication, author));
            }

            return books;
        }
    }

}
