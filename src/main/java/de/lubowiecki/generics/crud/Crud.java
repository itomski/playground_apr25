package de.lubowiecki.generics.crud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

// extends = Es sind nur SubTypen von AbstractEntity erlaubt (Kindklassen)
public interface Crud<T extends AbstractEntity> {

    List<T> findAll() throws SQLException;

    Optional<T> findById(int id) throws SQLException;

    boolean save(T t) throws SQLException;

    boolean delete(T t) throws SQLException;

    boolean deleteById(int id) throws SQLException;

    T create(ResultSet rs) throws SQLException;
}
