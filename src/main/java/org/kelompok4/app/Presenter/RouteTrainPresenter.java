package org.kelompok4.app.Presenter;

import org.kelompok4.app.Controller.RouteTrainController;
import org.kelompok4.app.Interface.ICanRun;
import org.kelompok4.app.Model.RouteTrainModel;

public class RouteTrainPresenter extends ContinuePresenter implements ICanRun {
    RouteTrainController routeTrainController;

    public RouteTrainPresenter(RouteTrainController routeTrainController) {
        this.routeTrainController = routeTrainController;
    }

    public RouteTrainController getRouteTrainController() {
        return this.routeTrainController;
    }

    public void setRouteTrainController(RouteTrainController routeTrainController) {
        this.routeTrainController = routeTrainController;
    }

    @Override
    public void run() {
        routeTrainController.getRouteTrainView().MenuRouteTrainView();
        int menu = sc.nextInt();
        sc.nextLine();
        menu(menu);
    }

    public void menu(int menu) {
        switch (menu) {
        case 1: {
            addRouteTrain();
            break;
        }
        case 2: {
            showRouteTrain();
            break;
        }
        case 3: {
            delRouteTrain();
            break;
        }
        }
    }

    public void addRouteTrain() {
        routeTrainController.getRouteTrainView().printAddRouteTrainViewPage();
        routeTrainController.getRouteTrainView().printCodeRouteTrain();
        String routeCode = sc.nextLine();
        if (!(routeTrainController.getRwRoute(routeCode).getRoute() == null)) {
            if (routeTrainController.checkRouteAvailability(routeCode)) {
                routeTrainController.getRouteTrainView().howToEndInputTimeNote();
                int i = 1;
                routeTrainController.getRouteTrainView().iterateInputTrain(i);
                String trainCode = sc.nextLine();
                RouteTrainModel routeTime = new RouteTrainModel();
                while (!trainCode.equals("-99")) {
                    if (routeTrainController.searchTrain(trainCode)) {
                        routeTime.setRouteTrainCode(routeTrainController.generateLastRouteTrainCode());
                        routeTime.setRwRoute(routeTrainController.getRwRoute(routeCode));
                        routeTrainController.addTrain(routeTrainController.getTrain(trainCode), routeTime);
                        routeTrainController.sortTrain(routeTime);
                    } else {
                        routeTrainController.getRouteTrainView().FailedAddRouteTrain("Kode kereta tidak ditemukan!");
                    }
                    i++;
                    routeTrainController.getRouteTrainView().iterateInputTrain(i);
                    trainCode = sc.nextLine();
                }
                routeTrainController.setRouteTrain(routeTime);
            } else {
                routeTrainController.getRouteTrainView().FailedAddRouteTrain(
                        "Daftar kereta pada kode rute " + routeCode + " telah ada! Hapus terlebih dahulu!");
            }
        } else {
            routeTrainController.getRouteTrainView().FailedAddRouteTrain("Kode rute dan jalurnya tidak ditemukan pada " + routeCode + "!!");
        }
        pressEnterKey();
        run();
    }

    public void showRouteTrain() {
        routeTrainController.getRouteTrainView().HeaderViewRouteTrain();
        System.out.println(routeTrainController.allRouteTrainView(routeTrainController.getAllRouteTrain()));
        pressEnterKey();
        run();
    }

    public void delRouteTrain() {
        routeTrainController.getRouteTrainView().printDeleteRouteTrainViewPage();
        routeTrainController.getRouteTrainView().printDeleteRouteTrain();
        String routeTimeCode = sc.nextLine();
        if (routeTrainController.deleteRouteTrain(routeTimeCode)) {
            routeTrainController.getRouteTrainView().SuccessDeleteRouteTrain();
        } else {
            routeTrainController.getRouteTrainView().FailedDeleteRouteTrain(
                    "Kode kereta rute tidak ditemukan! Silahkan pilih menu 'Lihat Kereta Pada Rute' untuk mengecek kode kereta rute!");
        }
        pressEnterKey();
        run();
    }
}