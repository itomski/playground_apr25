package de.lubowiecki.sql;

import java.sql.*;

public class MySQLConnectionTest {

    public static void main(String[] args) {

        final String ROW_TPL = "| %-4d | %-25s | %-4d | %-25s |\n";

        try {
            BookRepository repository = new BookRepository();
            for (Book book : repository.findAll()) {
                System.out.printf(ROW_TPL, book.getId(), book.getTitle(), book.getPublication(), book.getAuthor());
            }
        }
        catch(SQLException e) {
            System.out.println("Verbindung: Fehlerhaft!");
            e.printStackTrace();
        }
    }
}
