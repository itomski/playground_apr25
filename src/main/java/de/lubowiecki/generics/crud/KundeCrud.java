package de.lubowiecki.generics.crud;

import de.lubowiecki.sql.kundenverwaltung.DBUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class KundeCrud implements Crud<Kunde> {

    private final String TABLE = "kunden";

    @Override
    public List<Kunde> findAll() throws SQLException {

        final String SQL = "SELECT * FROM " + TABLE;
        try(Connection con = DBUtils.getConnoction();
            Statement stmt = con.createStatement()) {

            ResultSet results = stmt.executeQuery(SQL);

            List<Kunde> kunden = new ArrayList<>();

            while(results.next()) {
                kunden.add(create(results));
            }

            return kunden;
        }
    }

    @Override
    public Optional<Kunde> findById(int id) throws SQLException {

        final String SQL = "SELECT * FROM " + TABLE + " WHERE id = " + id;

        try(Connection con = DBUtils.getConnoction();
            Statement stmt = con.createStatement()) {

            ResultSet results = stmt.executeQuery(SQL);

            if(results.next()) {
                return Optional.of(create(results));
            }
            return Optional.empty();
        }
    }

    @Override
    public boolean save(Kunde kunde) throws SQLException {
        if(kunde.getId() > 0) {
            // TODO: update
            return false;
        }
        else {
            final String SQL = "INSERT INTO " + TABLE + " (id, vorname, nachname) VALUES(NULL, ?, ?)";

            try(Connection con = DBUtils.getConnoction();
                PreparedStatement stmt = con.prepareStatement(SQL)) {

                stmt.setString(1, kunde.getVorname());
                stmt.setString(2, kunde.getNachname());
                return stmt.executeUpdate() > 0;
            }

        }
    }

    @Override
    public boolean delete(Kunde kunde) throws SQLException {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean deleteById(int id) throws SQLException {
        // TODO: Noch nicht implementiert
        return false;
    }

    @Override
    public Kunde create(ResultSet rs) throws SQLException {
        Kunde k = new Kunde();
        k.setId(rs.getInt("id"));
        k.setVorname(rs.getString("vorname"));
        k.setNachname(rs.getString("nachname"));
        //k.setEmail(results.getString("email"));
        return k;
    }
}
