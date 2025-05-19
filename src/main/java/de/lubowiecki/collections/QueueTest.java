package de.lubowiecki.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueTest {

    public static void main(String[] args) {

        System.out.println("---- QUEUE ----");

        Queue<String> fifo = new LinkedList<>();
        fifo.offer("Peter");
        fifo.offer("Carol");
        fifo.offer("Bruce");

        System.out.println(fifo);
        System.out.println(fifo.poll() + " wird bedient...");

        System.out.println(fifo);
        System.out.println(fifo.poll() + " wird bedient...");

        fifo.offer("Steve");

        System.out.println(fifo);
        System.out.println(fifo.poll() + " wird bedient...");

        System.out.println(fifo);
        System.out.println(fifo.poll() + " wird bedient...");

        System.out.println(fifo);

        System.out.println();

        fifo.offer("Peter");
        fifo.offer("Carol");
        fifo.offer("Bruce");
        System.out.println(fifo);

        // alle Elemente verarbeiten
        // Elemente entnehmen bis die Sammlung leer ist
        while(!fifo.isEmpty()) {
            System.out.println(fifo.poll());
        }

        System.out.println(fifo);


        System.out.println("---- STACK ----");


        Stack<String> lifo = new Stack<>();
        lifo.push("Peter");
        lifo.push("Carol");
        lifo.push("Bruce");

        System.out.println(lifo);

        // Elemente entnehmen bis die Sammlung leer ist
        while(!lifo.isEmpty()) {
            System.out.println(lifo.pop() + "... behandelt");
        }

        System.out.println(lifo);
    }
}
