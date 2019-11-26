package org.kelompok4.app.Model;

public class SeatModel {
    private int status;
    private int number;
    public SeatModel(){
        
    }
    public SeatModel(int status, int number) {
        this.status = status;
        this.number = number;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
}
