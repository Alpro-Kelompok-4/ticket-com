package org.kelompok4.app.Model;


public class PremiumCoach implements Coach {
    private static int SEAT_QTY = 20;

    @Override
    public int getSeatQty() {
        return SEAT_QTY;
    }
}
