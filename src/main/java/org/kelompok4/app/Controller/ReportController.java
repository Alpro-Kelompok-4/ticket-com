package org.kelompok4.app.Controller;

import java.time.LocalDate;
import java.util.ArrayList;

import com.github.freva.asciitable.AsciiTable;

import org.kelompok4.app.Model.BookingModel;
import org.kelompok4.app.Model.TrainScheduleModel;
import org.kelompok4.app.Repo.BookingRepo;
import org.kelompok4.app.Repo.TrainScheduleRepo;
import org.kelompok4.app.View.ReportView;

public class ReportController {
    private BookingRepo repo = new BookingRepo();
    private ArrayList<BookingModel> models = new ArrayList<>();
    private BookingModel model;
    private ReportView view;
    private TrainScheduleModel schedule = new TrainScheduleModel();
    private TrainScheduleRepo scheduleRepo = new TrainScheduleRepo();

    public ReportController() {
        model = new BookingModel();
        view = new ReportView();
    }

    public ReportController(BookingModel model, ReportView view) {
        this.model = model;
        this.view = view;
    }

    public void showReportMenuView() {
        view.MenuReport();
    }

    public void getDailyReport(String date) {
        models.clear();
        for (BookingModel book : repo.getAll()) {
            schedule = scheduleRepo.get(book.getScheduleCode());
            if (date.equals(schedule.getDate())) {
                models.add(book);
            }
        }
        double total = 0.0;
        String[] header = {"Tanggal","KAI","Jumlah Pendapatan"};
        String[][] data = new String[models.size()][3];
        for (int i = 0; i < models.size(); i++) {
            data[i][0] = date;
            data[i][1] = models.get(i).getTrainCode();
            data[i][2] = String.valueOf(models.get(i).getTotalPayment().getPrice());
            total += models.get(i).getTotalPayment().getPrice();
        }
        System.out.println(AsciiTable.getTable(header, data));
        view.printTotalDailyReport(total);
    }

    public void getMonthlyReport(String date) {
        models.clear();
        for (BookingModel book : repo.getAll()) {
            schedule = scheduleRepo.get(book.getScheduleCode());
            if (date.equals(schedule.getDate().substring(0,7))) {
                models.add(book);
            }
        }
        double total = 0.0;
        String[] header = {"Tanggal","Jumlah Pendapatan"};
        String[][] data = new String[models.size()][2];
        for (int i = 0; i < models.size(); i++) {
            data[i][0] = date;
            data[i][1] = String.valueOf(models.get(i).getTotalPayment().getPrice());
            total += models.get(i).getTotalPayment().getPrice();
        }
        System.out.println(AsciiTable.getTable(header, data));
        view.printTotalMonthlyReport(total);
    }

    public void getAnnualReport(String date) {
        models.clear();
        for (BookingModel book : repo.getAll()) {
            schedule = scheduleRepo.get(book.getScheduleCode());
            if (date.equals(schedule.getDate().substring(0,4))) {
                models.add(book);
            }
        }
        double total = 0.0;
        String[] header = {"Bulan","Jumlah Pendapatan"};
        String[][] data = new String[models.size()][2];
        for (int i = 0; i < models.size(); i++) {
            data[i][0] = date;
            data[i][1] = String.valueOf(models.get(i).getTotalPayment().getPrice());
            total += models.get(i).getTotalPayment().getPrice();
        }
        System.out.println(AsciiTable.getTable(header, data));
        view.printTotalAnualReport(total);
    }

    public void showDailyReportView() {
        view.printDailyReportPage();
        view.printDateReport();
    }

    public void showDailyReportResult() {
        view.printHeaderDailyReport();
    }

    public void showMonthlyReportView() {
        view.printMonthlyReportPage();
        view.printDateReport();
    }

    public void showMonthlyReportResult() {
        view.printHeaderMonthlyReport();
    }

    public void showAnnualReportView() {
        view.printAnualReportPage();
        view.printDateReport();
    }

    public void showAnnualReportResult() {
        view.printHeaderAnualReport();
    }

    // public boolean checkInput(String input) {
    //     LocalDate date = LocalDate.parse(input);
    // }

}
