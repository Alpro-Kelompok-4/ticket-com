package org.kelompok4.app.Controller;

import java.util.ArrayList;
import java.util.Comparator;

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

    public void addTime(TimeModel time) {
        ArrayList<TimeModel> current = routeTimeModel.getList();
        if (current.contains(time)) {
            routeTimeView.FailedAddRouteTime();
        } else {
            current.add(time);
            routeTimeModel.setList(current);
            // TODO: Update json
            routeTimeView.SuccessAddRouteTime();
        }
    }

    public void displayTime() {
        routeTimeView.HeaderViewRouteTime();
        // TODO: Display list
    }

    public void sortTime() {
        ArrayList<TimeModel> current = routeTimeModel.getList();
        current.sort(Comparator.comparing(TimeModel::getTimeCode));
        routeTimeModel.setList(current);
    }

    public void deleteTime(TimeModel time) {
        ArrayList<TimeModel> current = routeTimeModel.getList();
        if (current.remove(time)){
            routeTimeModel.setList(current);
            routeTimeView.SuccessDeleteRouteTime();
        } else {
            routeTimeView.FailedDeleteRouteTime();
        }
    }

    public ArrayList<RouteTimeModel> getAllRouteTime(){
        ArrayList<RouteTimeModel> routeTimes = new ArrayList<RouteTimeModel>();
        // TODO: Get from json
        return routeTimes;
    }

    public String allRouteTimeView(ArrayList<RouteTimeModel> routeTimes){
        routeTimeView.HeaderViewRouteTime();
        TableStringBuilder<RouteTimeModel> t = new TableStringBuilder<>();
        t.addColumn("Kode Kereta Rute", RouteTimeModel::getRouteTimeCode);
        t.addColumn("Kode Rute", RouteTimeModel::getRwRouteCode);
        t.addColumn("Waktu Tersedia Pada Rute", RouteTimeModel::getListString);
        return t.createString(routeTimes);
    }
}
