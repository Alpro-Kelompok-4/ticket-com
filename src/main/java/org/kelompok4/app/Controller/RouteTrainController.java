package org.kelompok4.app.Controller;

import org.kelompok4.app.Interface.ICanCreate;
import org.kelompok4.app.Interface.ICanDelete;
import org.kelompok4.app.Interface.ICanRead;
import org.kelompok4.app.Model.RouteTrainModel;
import org.kelompok4.app.View.RouteTrainView;

public class RouteTrainController implements ICanCreate, ICanRead, ICanDelete {
    RouteTrainModel routeTrainModel;
    RouteTrainView routeTrainView;

    public RouteTrainController(RouteTrainModel routeTrainModel, RouteTrainView routeTrainView) {
        this.routeTrainModel = routeTrainModel;
        this.routeTrainView = routeTrainView;
    }

    public RouteTrainModel getRouteTrainModel() {
        return this.routeTrainModel;
    }

    public void setRouteTrainModel(RouteTrainModel routeTrainModel) {
        this.routeTrainModel = routeTrainModel;
    }

    public RouteTrainView getRouteTrainView() {
        return this.routeTrainView;
    }

    public void setRouteTrainView(RouteTrainView routeTrainView) {
        this.routeTrainView = routeTrainView;
    }


    @Override
    public void create() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void read() {

    }
}
