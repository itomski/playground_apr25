package de.lubowiecki.uebungen.u16.aufgabe1;

public class WoodenBoardToMaterialAdapter implements Material {

    // Der Adapter implementiert das Zielinterface -> Material
    // und hat als Parameter/Eigenschaft das zu adoptierende Objekt -> WoodenBoard
    // d.h. Adapter von WoodenBoard auf Material

    private WoodenBoard board;

    public WoodenBoardToMaterialAdapter(WoodenBoard board) {
        this.board = board;
    }

    @Override
    public void kuerzen(double cm) {
        board.cut(cm / 2.54);
    }
}
