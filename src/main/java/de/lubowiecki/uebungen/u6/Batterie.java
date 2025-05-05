package de.lubowiecki.uebungen.u6;

public class Batterie {

    private boolean voll = true;

    public void anschliessen(Verbraucher verbraucher) {
        if(!voll) {
            verbraucher.aus();
        }
        else {
            verbraucher.an();
            voll = false;
        }
    }

    public void aufladen() {
        voll = true;
    }
}
