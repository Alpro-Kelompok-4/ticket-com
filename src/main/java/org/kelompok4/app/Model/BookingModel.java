package org.kelompok4.app.Model;

import java.util.ArrayList;

public class BookingModel {
    private String codeSchedule;
    private String trainCode;
    private String bookingCode;
    private String virtualAccount;
    private ArrayList<String> passenger;
    private ArrayList<String> seatCode;
    private boolean paid;
    private PriceModel totalPayment;

    public BookingModel() {
    }

    public BookingModel(String codeSchedule, String trainCode, String bookingCode, String virtualAccount, ArrayList<String> passenger, ArrayList<String> seatCode, boolean paid, PriceModel totalPayment) {
        this.codeSchedule = codeSchedule;
        this.trainCode = trainCode;
        this.bookingCode = bookingCode;
        this.virtualAccount = virtualAccount;
        this.passenger = passenger;
        this.seatCode = seatCode;
        this.paid = paid;
        this.totalPayment = totalPayment;
    }

    public String getCodeSchedule() {
        return codeSchedule;
    }

    public void setCodeSchedule(String codeSchedule) {
        this.codeSchedule = codeSchedule;
    }

    public String getTrainCode() {
        return trainCode;
    }

    public void setTrainCode(String trainCode) {
        this.trainCode = trainCode;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getVirtualAccount() {
        return virtualAccount;
    }

    public void setVirtualAccount(String virtualAccount) {
        this.virtualAccount = virtualAccount;
    }

    public ArrayList<String> getPassenger() {
        return passenger;
    }

    public void setPassenger(ArrayList<String> passenger) {
        this.passenger = passenger;
    }

    public ArrayList<String> getSeatCode() {
        return seatCode;
    }

    public void setSeatCode(ArrayList<String> seatCode) {
        this.seatCode = seatCode;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public PriceModel getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(PriceModel totalPayment) {
        this.totalPayment = totalPayment;
    }
}
