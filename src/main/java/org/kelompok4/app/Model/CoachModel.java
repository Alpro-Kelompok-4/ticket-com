package org.kelompok4.app.Model;

import java.util.ArrayList;

public class CoachModel {
    private int seatQty; // replace with seatQty
    private ArrayList<SeatModel> seat = new ArrayList<SeatModel>();

    public CoachModel(int seatQty, ArrayList<SeatModel> seat) {
        this.seatQty = seatQty;

        this.seat = seat;
    }

    public CoachModel() {
    }

    public int getSeatQty() {
        return seatQty;
    }

    public void setSeatQty(int seatQty) {
        this.seatQty = seatQty;
    }

    

    public ArrayList<SeatModel> getSeat() {
        return seat;
    }

    public void setSeat(ArrayList<SeatModel> seat) {
        this.seat = seat;
    }

    public int filledSeat(){
        int count = 0;
        for (SeatModel s : seat) {
            if (s.getStatus() > 0){
                count++;
            }
        }
        return count;
    }
}
