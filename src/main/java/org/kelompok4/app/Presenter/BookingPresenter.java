package org.kelompok4.app.Presenter;

import java.util.ArrayList;

import org.kelompok4.app.Controller.BookingController;
import org.kelompok4.app.Interface.ICanRun;

public class BookingPresenter extends ContinuePresenter implements ICanRun {
    private BookingController bookingController;

    public BookingPresenter() {}

    public BookingPresenter(BookingController bookingController) {
        this.bookingController = bookingController;
    }

    @Override
    public void run() {
        bookingController.bookingMenuView();
        inputBooking();
        pressEnterKey();
        paymentBooking();
        pressEnterKey();
    }

    public void inputBooking() {
        // Masukkan kode jadwal
        String code;
        do {
            bookingController.bookingScheduleView();
            code = sc.nextLine();
            if (!bookingController.checkSchedule(code)) {
                bookingController.showCheckFailed();
            }
        } while (!bookingController.checkSchedule(code));
        bookingController.setScheduleCode(code);
        bookingController.setUnpaid();
        bookingController.getBookingDetail();
        bookingController.setTrainCode();

        // Masukkan jml penumpang
        bookingController.totalCustomerView();
        int totCustomer = sc.nextInt();
        while (!bookingController.checkAvailableSeat(totCustomer)) {
            bookingController.printCheckAvailableSeatResult();
            bookingController.totalCustomerView();
            totCustomer = sc.nextInt();
        }
        sc.nextLine();
        bookingController.showBorder();

        // Masukkan nama penumpang
        ArrayList<String> pList = new ArrayList<>();
        for (int i = 1; i <= totCustomer; i++) {
            bookingController.customerInputView(i);
            pList.add(sc.nextLine());
        }
        bookingController.setPassenger(pList);

        // Tampilkan gerbong
        bookingController.showCoachSeat();
        bookingController.showBorder();

        // Pilih Kursi
        ArrayList<String> sList = new ArrayList<>();
        String s;
        bookingController.showSeatInput();
        for (int i = 1; i <= totCustomer; i++) {
            bookingController.seatInputView(i);
            s = sc.next();
            while (!bookingController.checkSeat(s)) {
                bookingController.printCheckSeatResultFull();
                bookingController.seatInputView(i);
                s = sc.next();
            }
            sList.add(s);
        }
        bookingController.setSeatCode(sList);

        // Tampilkan booking
        bookingController.showBorder();
        bookingController.sumOfPayment();
        bookingController.generateVirtualAccount();
        bookingController.showBooking();

    }

    public void paymentBooking() {
        String account;
        double price;
        bookingController.showPayment();
        do {
            bookingController.showPaymentAccount();
            account = sc.next();
            bookingController.showPaymentPrice();
            price = sc.nextDouble();
            sc.nextLine();
            bookingController.showPaymentCheck();
            sc.nextLine();
        } while(!bookingController.checkPayment(account, price));
        bookingController.generateBookingCode();
        bookingController.setPaid();
        bookingController.showFinalBooking();
        bookingController.create();
        bookingController.bookSeat();
    }

}