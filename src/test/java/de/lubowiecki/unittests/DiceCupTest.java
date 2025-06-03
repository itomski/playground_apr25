package de.lubowiecki.unittests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceCupTest {

    @DisplayName("Zufallswert zwischen 1 und 10")
    @RepeatedTest(value = 100, name = "Test {currentRepetition} von {totalRepetitions}")
    void roll() {
        DiceCup cup = new DiceCup(10);
        int erg = cup.roll();
        assertTrue(erg > 0 && erg <= 10);
    }

    @Disabled
    @Test
    void testRoll() {
    }
}