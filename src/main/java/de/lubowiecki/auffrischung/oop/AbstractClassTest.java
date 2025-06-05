package de.lubowiecki.auffrischung.oop;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class AbstractClassTest {
}

interface Repository {

    // im Interface sind alle Eigenschaften public static final
    // im Interface sind alle Methoden public

    // Gibt vor, welche Methoden eingebaut werden müssen

    List<Person> findAll() throws SQLException;

    Optional<Person> findById(int id) throws SQLException;

    boolean save(Person person) throws SQLException;

    boolean delete(Person person) throws SQLException;

    boolean deleteById(int id) throws SQLException;

}

abstract class AbstractRepository implements Repository {

    // Programmiert alle Methoden aus, die für alle gleiche sind

    @Override
    public boolean save(Person person) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteById(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(Person person) throws SQLException {
        return false;
    }
}

class PersonRepository extends AbstractRepository {

    // Programmiert alle Methoden, die das Interface vorgibt aber die
    // abstarkte Klasse nicht bereitstellt

    @Override
    public List<Person> findAll() throws SQLException {
        return List.of();
    }

    @Override
    public Optional<Person> findById(int id) throws SQLException {
        return Optional.empty();
    }
}

