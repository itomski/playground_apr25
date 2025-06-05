package de.lubowiecki.generics.crud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class BestellungCrud implements Crud<Bestellung> {
    @Override
    public List<Bestellung> findAll() throws SQLException {
        return List.of();
    }

    @Override
    public Optional<Bestellung> findById(int id) throws SQLException {
        return Optional.empty();
    }

    @Override
    public boolean save(Bestellung bestellung) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(Bestellung bestellung) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteById(int id) throws SQLException {
        return false;
    }

    @Override
    public Bestellung create(ResultSet rs) throws SQLException {
        return null;
    }
}
