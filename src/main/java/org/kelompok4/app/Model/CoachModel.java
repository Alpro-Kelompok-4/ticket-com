package org.kelompok4.app.Model;

import java.util.ArrayList;

public class CoachModel {
    private int maxSeat; // replace with seatQty
    private ArrayList<SeatModel> seat = new ArrayList<SeatModel>();

    public CoachModel(int maxSeat, ArrayList<SeatModel> seat) {
        this.maxSeat = maxSeat;
        this.seat = seat;
    }

    public CoachModel() {
    }

    public int getMaxSeat() {
        return maxSeat;
    }

    public void setMaxSeat(int maxSeat) {
        this.maxSeat = maxSeat;
    }

    public ArrayList<SeatModel> getSeat() {
        return seat;
    }

    public void setSeat(ArrayList<SeatModel> seat) {
        this.seat = seat;
    }
}
