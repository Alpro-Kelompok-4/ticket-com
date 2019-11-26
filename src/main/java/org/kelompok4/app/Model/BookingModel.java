package org.kelompok4.app.Model;

import java.util.ArrayList;

enum Status {
    UNPAID,
    PAID,
    EXPIRED
}

public class BookingModel {
    private String bookingCode;
    private String scheduleCode;
    private String trainCode;
    private String virtualAccount;
    private ArrayList<String> passenger;
    private ArrayList<String> seatCode;
    private Status paid; // jadi private enum UNPAID, PAID, EXPIRED, CANCELLED
    private PriceModel totalPayment;

    public BookingModel() {
    }

    public BookingModel(String scheduleCode, String trainCode, String bookingCode, String virtualAccount, ArrayList<String> passenger, ArrayList<String> seatCode, Status paid, PriceModel totalPayment) {
        this.scheduleCode = scheduleCode;
        this.trainCode = trainCode;
        this.bookingCode = bookingCode;
        this.virtualAccount = virtualAccount;
        this.passenger = passenger;
        this.seatCode = seatCode;
        this.paid = paid;
        this.totalPayment = totalPayment;
    }

    public String getScheduleCode() {
        return scheduleCode;
    }

    public void setScheduleCode(String code) {
        this.scheduleCode = code;
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

    public Status getPaid() {
        return paid;
    }

    public void setPaid(Status paid) {
        this.paid = paid;
    }

    public PriceModel getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(PriceModel totalPayment) {
        this.totalPayment = totalPayment;
    }
}
