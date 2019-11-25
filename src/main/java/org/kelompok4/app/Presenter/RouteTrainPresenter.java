package org.kelompok4.app.Presenter;

import org.kelompok4.app.Controller.RouteTrainController;
import org.kelompok4.app.Interface.ICanRun;

public class RouteTrainPresenter extends ContinuePresenter implements ICanRun{
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
        // TODO Auto-generated method stub

    }
    
}