package de.lubowiecki.patterns.factorymathod.beispiel2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CSVSource implements Source {

    @Override
    public void save(Object... obj) throws IOException {

        Path pfad = Paths.get("source.csv");

        try(BufferedWriter out = Files.newBufferedWriter(pfad)) {
            for(Object row : obj) {
                out.write(row.toString());
                out.newLine();
            }
        }
    }
}
