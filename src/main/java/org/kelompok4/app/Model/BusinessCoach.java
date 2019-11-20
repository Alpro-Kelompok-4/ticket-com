package org.kelompok4.app.Model;


public class BusinessCoach implements Coach {

    private static int SEAT_QTY = 10;
    @Override
    public int getSeatQty() {
        return SEAT_QTY;
    }
}
