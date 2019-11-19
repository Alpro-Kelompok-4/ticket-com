package org.kelompok4.app;

import java.util.ArrayList;

public class CarriageModel {
    private int maxSeat;
    private ArrayList<SeatModel> seat = new ArrayList<SeatModel>();

    public CarriageModel(int maxSeat, ArrayList<SeatModel> seat) {
        this.maxSeat = maxSeat;
        this.seat = seat;
    }

    public CarriageModel() {
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
