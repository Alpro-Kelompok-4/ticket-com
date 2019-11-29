package org.kelompok4.app.Presenter;

import java.util.ArrayList;

import org.kelompok4.app.Controller.ReportController;
import org.kelompok4.app.Interface.ICanRun;

public class ReportPresenter extends ContinuePresenter implements ICanRun {
    private ReportController reportController;

    public ReportPresenter() {
        reportController = new ReportController();
    }

    public ReportPresenter(ReportController reportController) {
        this.reportController = reportController;
    }

    @Override
    public void run() {
        reportController.showReportMenuView();
        int choice = sc.nextInt();
        sc.nextLine();
        menu(choice);
    }

    public void menu(int choice) {
        String date = "";
        switch(choice) {
            case 1: // harian
                reportController.showDailyReportView();
                date = sc.nextLine();
                reportController.showDailyReportResult();
                reportController.getDailyReport(date);
                run();
                break;
            case 2: // bulanan
                reportController.showMonthlyReportView();
                date = sc.nextLine();
                reportController.showMonthlyReportResult();
                reportController.getMonthlyReport(date);
                run();
                break;
            case 3: // tahunan
                reportController.showAnnualReportView();
                date = sc.nextLine();
                reportController.showAnnualReportResult();
                reportController.getAnnualReport(date);
                run();
                break;
            case 99:
                break;
            default:
                System.out.println("Pilihan menu yang anda masukkan salah.");
                run();
        }
    }


    
}