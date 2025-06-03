package de.lubowiecki;

public record RgbFarbe(int red, int green, int blue) {

    public RgbFarbe(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public RgbFarbe() {
        this(255, 255, 255); // Aufruf eines anderen Konstruktors
    }

    public String asHex() {
        return String.format("%02X%02X%02X", red, green, blue);
    }
}
