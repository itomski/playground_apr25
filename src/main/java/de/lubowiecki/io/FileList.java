package de.lubowiecki.io;

import java.io.File;

public class FileList {

    public static void main(String[] args) {

        File dir = new File(".");
        printContent(dir);
    }

    private static void printContent(File file) {
        for(String inhalt : file.list()) {
            System.out.println(inhalt);
            File f = new File(inhalt);
            f = f.getAbsoluteFile();
            if(f.isDirectory()) {
                printContent(f);
            }
        }
    }
}
