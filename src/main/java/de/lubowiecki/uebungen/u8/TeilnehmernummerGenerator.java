package de.lubowiecki.uebungen.u8;

import java.io.*;

public class TeilnehmernummerGenerator {

    private static final File NR_DIR = new File(System.getProperty("user.home") + "/teilnehmer");
    private static final File NR_FILE = new File(NR_DIR, "nr.ser");

    private static final TeilnehmernummerGenerator instance = new TeilnehmernummerGenerator();
    
    private TeilnehmernummerGenerator() {
        if(!NR_DIR.exists()) {
            NR_DIR.mkdir(); // Ordner bauen, wenn nicht vorhanden
        }
    }

    public static TeilnehmernummerGenerator getInstance() {
        return instance;
    }

    public int getNextNr() {
        int next = 0;
        try {
            next = readNr(); // Letzte vergebene Nr aus der Datei auslesen
            writeNr(++next); // erhöhen und wieder in die Datei schreiben
        }
        catch(IOException e) {
            System.out.println("Problem");
        }
        return next;
    }

    private int readNr() throws IOException {
        if(NR_FILE.exists()) {
            try (DataInputStream in = new DataInputStream(new FileInputStream(NR_FILE))) {
                return in.readInt();
            }
        }
        return 0;
    }

    private void writeNr(int i) throws IOException {
        try(DataOutputStream out = new DataOutputStream(new FileOutputStream(NR_FILE))) {
            out.writeInt(i);
        }
    }
}
