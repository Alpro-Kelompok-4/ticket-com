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
        // TODO Auto-generated method stub
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
        if (routeTimeController.checkRouteAvailability(routeCode)) {
            String timeCode = sc.nextLine();
            RouteTimeModel routeTime = new RouteTimeModel();
            while (timeCode.equals("-99")) {
                if (routeTimeController.searchTime(timeCode)) {
                    routeTime.setRouteTimeCode(routeTimeController.generateLastRouteTimeCode());
                    routeTime.setRwRoute(routeTimeController.getRwRoute(routeCode));
                    routeTimeController.addTime(routeTimeController.getTime(timeCode), routeTime);
                    routeTimeController.sortTime(routeTime);
                } else {
                    routeTimeController.getRouteTimeView().FailedAddRouteTime();
                }
            }
            routeTimeController.setRouteTime(routeTime);
            pressEnterKey();
            run();
        } else {
            routeTimeController.getRouteTimeView().FailedAddRouteTime();
            pressEnterKey();
            run();
        }
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
        if (routeTimeController.deleteRouteTime(routeTimeCode)){
            routeTimeController.getRouteTimeView().SuccessDeleteRouteTime();
        } else {
            routeTimeController.getRouteTimeView().FailedDeleteRouteTime();
        }
        pressEnterKey();
        run();
    }
}