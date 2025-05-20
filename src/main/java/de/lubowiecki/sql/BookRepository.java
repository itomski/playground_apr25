package de.lubowiecki.sql;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    public List<Book> findAll() throws SQLException {

        // Verbindung zu DB aufbauen
        try(Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement()) {

            // Daten aus der Tabelle holen
            final String SQL = "SELECT * FROM books INNER JOIN authors ON books.author_id = authors.id";
            ResultSet results = stmt.executeQuery(SQL);

            List<Book> books = new ArrayList<>();

            // Tabellendaten in Book-Objekte verpacken
            while(results.next()) {
                int id = results.getInt("id");
                String title = results.getString("title");
                int publication = results.getInt("publication");
                String author = results.getString("name");
                books.add(new Book(id, title,publication, author));
            }

            return books;
        }
    }

}
