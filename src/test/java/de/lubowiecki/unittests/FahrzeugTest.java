package de.lubowiecki.unittests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FahrzeugTest {

    @Test
    @DisplayName("gibGas 10 kmh")
    void gibGas1() {
        Fahrzeug f = new Fahrzeug("HH:AB123");
        f.gibGas();
        assertEquals(10, f.getGeschwindigkeit());
    }

    @Test
    @DisplayName("gibGas 30 kmh")
    void gibGas2() {
        Fahrzeug f = new Fahrzeug("HH:AB123");
        f.gibGas();
        f.gibGas();
        f.gibGas();
        assertEquals(30, f.getGeschwindigkeit());
    }

    @Test
    @DisplayName("gibGas 75 kmh")
    void testGibGas() {
        Fahrzeug f = new Fahrzeug("HH:AB123");
        f.gibGas(75);
        assertEquals(75, f.getGeschwindigkeit());
    }

    @Test
    @DisplayName("bremseAb von 100 auf 90")
    void bremseAb() {
        Fahrzeug f = new Fahrzeug("HH:AB123");
        f.gibGas(100);
        f.bremseAb();
        assertEquals(90, f.getGeschwindigkeit());
    }

    @Disabled
    @Test
    void testBremseAb() {
    }

    @Test
    void einsteigen() {
        Fahrzeug f = new Fahrzeug("HH:AB123");
        f.einsteigen("Peter");
        f.einsteigen("Bruce");
        assertEquals(2, f.getAnzahlInsassen());
    }

    @Test
    void aussteigen() {
        Fahrzeug f = new Fahrzeug("HH:AB123");
        f.einsteigen("Peter");
        f.einsteigen("Bruce");
        f.aussteigen("Bruce");
        assertEquals(1, f.getAnzahlInsassen());
    }
}