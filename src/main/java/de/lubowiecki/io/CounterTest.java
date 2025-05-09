package de.lubowiecki.io;

import java.io.*;

public class CounterTest {

    private static final File counter = new File("counter.txt");


    public static void main(String[] args) {

        try {
            new CounterTest().count();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void count() throws IOException {

        int i = read();
        System.out.println(i++);
        write(i);
    }

    private int read() throws IOException {

        if(counter.exists()) {
            DataInputStream in = new DataInputStream(new FileInputStream(counter));
            return in.readInt();
        }
        return 0;
    }

    private void write(int i) throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream(counter));
        out.writeInt(i);
    }
}
