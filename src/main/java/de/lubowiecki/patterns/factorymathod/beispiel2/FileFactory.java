package de.lubowiecki.patterns.factorymathod.beispiel2;

public class FileFactory implements SourceFactory {


    @Override
    public Source create(String type) {

        return switch(type.toLowerCase()) {
            case "csv" -> new CSVSource();
            case "plain" -> throw new UnsupportedOperationException();
            case "serial" -> throw new UnsupportedOperationException();
            case "xml" -> throw new UnsupportedOperationException();
            default -> new CSVSource();
        };
    }
}
