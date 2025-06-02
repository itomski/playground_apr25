package de.lubowiecki.sql.kundenverwaltung;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractRepository<T> implements Repository<T> {

    public List<T> findAll(String SQL) throws SQLException {

        try(Connection conn = DBUtils.getConnoction();
            // Statement mit Platzhaltern an die DB schicken
            Statement stmt = conn.createStatement()) {
            // Statement ausführen
            ResultSet result =  stmt.executeQuery(SQL);

            // Ergebnisse verarbeiten
            List<T> sammlung = new ArrayList<>();

            while(result.next()) {
                sammlung.add(create(result));
            }

            return sammlung;
        }
    }
}
