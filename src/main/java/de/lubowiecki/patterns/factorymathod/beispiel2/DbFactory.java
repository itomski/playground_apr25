package de.lubowiecki.patterns.factorymathod.beispiel2;

public class DbFactory implements SourceFactory {


    @Override
    public Source create(String type) {

        return switch(type.toLowerCase()) {
            case "sqlite" -> new SQLiteSource();
            case "mysql" -> throw new UnsupportedOperationException();
            case "oracle" -> throw new UnsupportedOperationException();
            case "db2" -> throw new UnsupportedOperationException();
            case "h2" -> throw new UnsupportedOperationException();
            default -> new SQLiteSource();
        };
    }
}
