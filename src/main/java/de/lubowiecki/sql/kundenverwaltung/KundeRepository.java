package de.lubowiecki.sql.kundenverwaltung;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class KundeRepository extends AbstractRepository<Kunde> {

    private static final String TABLE = "kunden";

    @Override
    public boolean insert(Kunde kunde) throws SQLException {

        final String SQL = "INSERT INTO " + TABLE + " (id, vorname, nachname, geburtsdatum) " +
                                "VALUES(NULL, ?, ?, ?)";

        try(Connection conn = DBUtils.getConnoction();
                // Statement mit Platzhaltern an die DB schicken
                PreparedStatement stmt = conn.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS)) {

            // Platzhalter ersetzen
            stmt.setString(1, kunde.getVorname());
            stmt.setString(2, kunde.getNachname());
            stmt.setDate(3, Date.valueOf(kunde.getGeburtsDatum()));
            // Statement ausführen
            stmt.execute();

            ResultSet rs = stmt.getGeneratedKeys(); // Vergebene ID auslesen
            if(rs.next()) {
                kunde.setId(rs.getInt(1));
                return true;
            }
            return false;
        }
    }

    @Override
    public boolean update(Kunde kunde) throws SQLException {

        final String SQL = "UPDATE " + TABLE + " vorname = ?, nachname = ?, geburtsdatum = ? " +
                "WHERE id = ?";

        try(Connection conn = DBUtils.getConnoction();
            // Statement mit Platzhaltern an die DB schicken
            PreparedStatement stmt = conn.prepareStatement(SQL)) {

            // Platzhalter ersetzen
            stmt.setString(1, kunde.getVorname());
            stmt.setString(2, kunde.getNachname());
            stmt.setDate(3, Date.valueOf(kunde.getGeburtsDatum()));
            stmt.setInt(4, kunde.getId());
            // Statement ausführen
            stmt.execute();

            // Wie viele Datensätze waren von dem Befehl betroffen?
            return stmt.getUpdateCount() > 0;
        }
    }

    @Override
    public List<Kunde> findAll() throws SQLException {
        return findAll("SELECT * FROM " + TABLE);
    }

    @Override
    public Kunde findById(int id) throws SQLException {
        List<Kunde> kunden = findAll("SELECT * FROM " + TABLE + " WHERE id = " + id);

        if(kunden.size() > 0) return kunden.get(0);

        return null;
    }

    // Daten sind Strings = Hier würden PreparedStatements verwendet werden
//    public Kunde findByVornameOrNachname(String data) throws SQLException {
//        throw new UnsupportedOperationException("Noch nicht eingebaut");
//    }

    @Override
    public boolean delete(Kunde kunde) throws SQLException {
        return deleteById(kunde.getId());
    }

    @Override
    public boolean deleteById(int id) throws SQLException {

        // Prepared Statements machen hier keinen Sinn, da die Daten vom Typ int sind
        // und keine SQL-Befehle enthalten können
        final String SQL = "DELETE FROM  " + TABLE + " WHERE id = " + id;

        try(Connection conn = DBUtils.getConnoction();
            // Statement mit Platzhaltern an die DB schicken
            Statement stmt = conn.createStatement()) {
            // Statement ausführen
            return stmt.executeUpdate(SQL) > 0;
        }
    }

    @Override
    public Kunde create(ResultSet data) throws SQLException {
        // Tabellen-Daten werden in Objekte umgewandelt
        Kunde kunde = new Kunde();
        kunde.setId(data.getInt("id"));
        kunde.setVorname(data.getString("vorname"));
        kunde.setNachname(data.getString("nachname"));
        kunde.setGeburtsDatum(data.getDate("geburtsdatum").toLocalDate());
        return kunde;
    }
}
