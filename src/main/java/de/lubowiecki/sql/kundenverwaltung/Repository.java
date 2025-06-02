package de.lubowiecki.sql.kundenverwaltung;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface Repository<T> {

    boolean insert(T t) throws SQLException;

    boolean update(T t) throws SQLException;

    List<T> findAll() throws SQLException;

    T findById(int id) throws SQLException;

    boolean delete(T t) throws SQLException;

    boolean deleteById(int id) throws SQLException;

    T create(ResultSet data) throws SQLException;
}
