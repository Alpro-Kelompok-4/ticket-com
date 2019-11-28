package org.kelompok4.app.Controller;

import org.kelompok4.app.Interface.ICanRead;
import org.kelompok4.app.View.ReportView;

public class ReportController implements ICanRead {
    private BookingController bookingController;
    //private TrainScheduleModel trainScheduleModel;
    private ReportView reportView;


    public ReportController(BookingController bookingController, ReportView reportView) {
        this.bookingController = bookingController;
        this.reportView = reportView;
    }

    public ReportController() {
        this.bookingController = new BookingController();
        this.reportView = new ReportView();
    }

    @Override
    public void read() {

    }


    /**
     * Bentuk belum SOLID
     */
    public void showDailyReport() {
        //data pemasukan harian
        reportView.printHeaderDailyReport();
        //total masukan harian
        reportView.printDailyReportPage();
        /**
         * Masukin json kumpulan booking yang sudah paid
         * dalam rentang satu hari
         */
        bookingController.getTotalPayment();
    }

    public void showMonthlyReport() {
        //laporan bulanan pemasukan
        reportView.printMonthlyReportPage();
        //data pemasukan bulanan
        reportView.printHeaderMonthlyReport();
        //total masukan bulanan
        reportView.printTotalMonthlyReport();
        /**
         * Masukin json kumpulan booking yang sudah paid
         * dalam rentang satu bulan
         */
        bookingController.getTotalPayment();

    }

    public void showAnnualReport() {
        //laporan tahunan pemasukan
        reportView.printAnnualReportPage();
        //data pemasukan tahunan
        reportView.printHeaderAnualReport();
        //total pemasukan tahunan
        reportView.printTotalAnualReport();
        /**
         * Masukin json kumpulan booking yang sudah paid
         * dalam rentang satu tahun
         */
        bookingController.getTotalPayment();


    }
}
