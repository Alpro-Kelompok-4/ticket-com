package org.kelompok4.app.Presenter;

import org.kelompok4.app.Controller.RouteTimeController;
import org.kelompok4.app.Interface.ICanRun;
import org.kelompok4.app.Model.RouteTimeModel;

public class RouteTimePresenter extends ContinuePresenter implements ICanRun{
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

    public void menu(int menu){
        switch (menu){
            case 1:{
                addRouteTime();
                break;
            }
            case 2:{
                showRouteTime();
                break;
            }
            case 3:{
                delRouteTime();
                break;
            }
        }
    }

    public void addRouteTime(){
        routeTimeController.getRouteTimeView().printCodeRouteTime();
        String routeCode = sc.nextLine();
        if (routeTimeController.checkRouteAvailability(routeCode)){
            String timeCode = sc.nextLine();
            while (timeCode.equals("-99"))
            if (routeTimeController.searchTime(timeCode)){
                RouteTimeModel routeTime = new RouteTimeModel();
                routeTime.setRouteTimeCode(routeTimeController.generateLastRouteTimeCode());
                routeTime.setRwRoute(routeTimeController.getRwRoute(routeCode));
                routeTimeController.addTime(routeTimeController.getTime(timeCode), routeTime);
            } else {
                
            }
            
        } else {
            routeTimeController.getRouteTimeView().FailedAddRouteTime();
        }

    }

    public void showRouteTime(){

    }

    public void delRouteTime(){

    }

}