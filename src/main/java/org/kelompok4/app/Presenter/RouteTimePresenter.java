package org.kelompok4.app.Presenter;

import org.kelompok4.app.Controller.RouteTimeController;
import org.kelompok4.app.Interface.ICanRun;
import org.kelompok4.app.Model.RouteTimeModel;

public class RouteTimePresenter extends ContinuePresenter implements ICanRun {
    RouteTimeController routeTimeController;

    public RouteTimePresenter(RouteTimeController routeTimeController) {
        this.routeTimeController = routeTimeController;
    }

    public RouteTimeController getRouteTimeController() {
        return this.routeTimeController;
    }

    public void setRouteTimeController(RouteTimeController routeTimeController) {
        this.routeTimeController = routeTimeController;
    }

    @Override
    public void run() {
        routeTimeController.getRouteTimeView().MenuRouteTimeView();
        int menu = sc.nextInt();
        sc.nextLine();
        menu(menu);
    }

    public void menu(int menu) {
        switch (menu) {
        case 1: {
            addRouteTime();
            break;
        }
        case 2: {
            showRouteTime();
            break;
        }
        case 3: {
            delRouteTime();
            break;
        }
        }
    }

    public void addRouteTime() {
        routeTimeController.getRouteTimeView().printAddRouteTimeViewPage();
        routeTimeController.getRouteTimeView().printCodeRouteTime();
        String routeCode = sc.nextLine();
        if (!(routeTimeController.getRwRoute(routeCode).getRoute() == null)) {
            if (routeTimeController.checkRouteAvailability(routeCode)) {
                routeTimeController.getRouteTimeView().howToEndInputTimeNote();
                int i = 1;
                routeTimeController.getRouteTimeView().iterateInputTime(i);
                String timeCode = sc.nextLine();
                RouteTimeModel routeTime = new RouteTimeModel();
                while (!timeCode.equals("-99")) {
                    if (routeTimeController.searchTime(timeCode)) {
                        routeTime.setRouteTimeCode(routeTimeController.generateLastRouteTimeCode());
                        routeTime.setRwRoute(routeTimeController.getRwRoute(routeCode));
                        routeTimeController.addTime(routeTimeController.getTime(timeCode), routeTime);
                        routeTimeController.sortTime(routeTime);
                    } else {
                        routeTimeController.getRouteTimeView().FailedAddRouteTime("Kode waktu tidak ditemukan!");
                    }
                    i++;
                    routeTimeController.getRouteTimeView().iterateInputTime(i);
                    timeCode = sc.nextLine();
                }
                routeTimeController.setRouteTime(routeTime);
            } else {
                routeTimeController.getRouteTimeView().FailedAddRouteTime(
                        "Daftar waktu pada kode rute " + routeCode + " telah ada! Hapus terlebih dahulu!");
            }
        } else {
            routeTimeController.getRouteTimeView()
                    .FailedAddRouteTime("Kode rute dan jalurnya tidak ditemukan pada " + routeCode + "!!");
        }
        pressEnterKey();
        run();
    }

    public void showRouteTime() {
        routeTimeController.getRouteTimeView().HeaderViewRouteTime();
        System.out.println(routeTimeController.allRouteTimeView(routeTimeController.getAllRouteTime()));
        pressEnterKey();
        run();
    }

    public void delRouteTime() {
        routeTimeController.getRouteTimeView().printDeleteRouteTimeViewPage();
        routeTimeController.getRouteTimeView().printDeleteRouteTime();
        String routeTimeCode = sc.nextLine();
        if (routeTimeController.deleteRouteTime(routeTimeCode)) {
            routeTimeController.getRouteTimeView().SuccessDeleteRouteTime();
        } else {
            routeTimeController.getRouteTimeView().FailedDeleteRouteTime(
                    "Kode waktu rute tidak ditemukan! Silahkan pilih menu 'Lihat Waktu Pada Rute' untuk mengecek kode waktu rute!");
        }
        pressEnterKey();
        run();
    }
}