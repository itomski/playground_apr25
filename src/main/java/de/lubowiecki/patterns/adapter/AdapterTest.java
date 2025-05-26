package de.lubowiecki.patterns.adapter;

public class AdapterTest {

    public static void main(String[] args) {

        Server server = new Server();
        EMail m1 = new EMail("p.parker@shield.org", "b.banner@shield.org", "Cap. America", "Ich finden sein Anzug sitzt zu eng...");
        server.send(m1);

        System.out.println();

        Tweet t1 = new Tweet("Carol Danvers", "Super Heros", "Dir Sorgen eines Superhelden", "...", "hero", "marvel");
        //server.send(t1); // Error: Tweet ist mit dem Server nicht kompatibel
        server.send(new TweetToMessageAdapter(t1)); // Ok! Verwendet den Adapter

    }
}
