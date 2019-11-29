package org.kelompok4.app.Model;

import java.util.ArrayList;

public class BookingModel {
    private String bookingCode;
    private String CustomerEmail;
    private String scheduleCode;
    private String trainCode;
    // potensi solid
    private String virtualAccount;
    private ArrayList<String> passenger;
    private ArrayList<String> seatCode;
    private BookingStatus paid; // jadi private enum UNPAID, PAID, EXPIRED, CANCELLED
    private PriceModel totalPayment;

    public BookingModel() {
    }

    public BookingModel(String scheduleCode, String email, String trainCode, String bookingCode, String virtualAccount, ArrayList<String> passenger, ArrayList<String> seatCode, BookingStatus paid, PriceModel totalPayment) {
        this.scheduleCode = scheduleCode;
        this.CustomerEmail = email;
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

    public BookingStatus getPaid() {
        return paid;
    }

    public void setPaid(BookingStatus paid) {
        this.paid = paid;
    }

    public PriceModel getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(PriceModel totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }
}
