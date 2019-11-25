package org.kelompok4.app.Controller;

import org.kelompok4.app.Interface.ICanCreate;
import org.kelompok4.app.Interface.ICanDelete;
import org.kelompok4.app.Interface.ICanRead;
import org.kelompok4.app.Model.RouteTimeModel;
import org.kelompok4.app.Model.TimeModel;
import org.kelompok4.app.View.RouteTimeView;

public class RouteTimeController implements ICanCreate, ICanRead, ICanDelete {
    RouteTimeModel routeTimeModel;
    RouteTimeView routeTimeView;


    public RouteTimeController(RouteTimeModel routeTimeModel, RouteTimeView routeTimeView) {
        this.routeTimeModel = routeTimeModel;
        this.routeTimeView = routeTimeView;
    }

    public RouteTimeModel getRouteTimeModel() {
        return this.routeTimeModel;
    }

    public void setRouteTimeModel(RouteTimeModel routeTimeModel) {
        this.routeTimeModel = routeTimeModel;
    }

    public RouteTimeView getRouteTimeView() {
        return this.routeTimeView;
    }

    public void setRouteTimeView(RouteTimeView routeTimeView) {
        this.routeTimeView = routeTimeView;
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

    public void addTime(TimeModel time){

    }

    public void displayTime(){

    }

    public void deleteTime(int id){

    }
}
