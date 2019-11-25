package org.kelompok4.app.Controller;

import java.util.ArrayList;
import java.util.Comparator;

import org.kelompok4.app.Interface.ICanCreate;
import org.kelompok4.app.Interface.ICanDelete;
import org.kelompok4.app.Interface.ICanRead;
import org.kelompok4.app.Model.RouteTimeModel;
import org.kelompok4.app.Model.RwRouteModel;
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

    public TimeModel getTime(String timeCode){
        TimeModel time = new TimeModel();

        for (TimeModel t : getAllTime()) {
            if (t.getTimeCode().equals(timeCode)){
                time = t;
                break;
            }
        }
        
        return time;
    }

    public boolean searchTime(String timeCode){
        boolean check = false;

        for (TimeModel t : getAllTime()) {
            if (t.getTimeCode().equals(timeCode)){
                check = true;
                break;
            }
        }

        return check;
    }
    
    public ArrayList<TimeModel> getAllTime(){
        ArrayList<TimeModel> times = new ArrayList<TimeModel>();
        // TODO: Get from json
        return times;
    }

    public void setRouteTime(RouteTimeModel routeTime){
        // TODO: Insert to json
    }

    public void addTime(TimeModel time, RouteTimeModel routeTime) {
        ArrayList<TimeModel> current = routeTime.getList();
        if (current.contains(time)) {
            routeTimeView.FailedAddRouteTime();
        } else {
            current.add(time);
            routeTimeModel.setList(current);
            // TODO: Update json
        }
    }

    public void displayTime() {
        routeTimeView.HeaderViewRouteTime();
        // TODO: Display list
    }

    public void sortTime(RouteTimeModel routeTime) {
        ArrayList<TimeModel> current = routeTime.getList();
        current.sort(Comparator.comparing(TimeModel::getTimeCode));
        routeTime.setList(current);
        // TODO: Update json
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

    public RouteTimeModel getRouteTime(String routeTimeCode){
        // TODO: get from json
        RouteTimeModel routeTime = new RouteTimeModel();
        for (RouteTimeModel r : getAllRouteTime()) {
            if (r.getRouteTimeCode().equals(routeTimeCode)){
                routeTime = r;
                break;
            }
        }
        return routeTime;
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
        t.addColumn("Kode Rute", RouteTimeModel::getRouteCode);
        t.addColumn("Waktu Tersedia Pada Rute", RouteTimeModel::getListString);
        return t.createString(routeTimes);
    }

    public void updateRouteTime(ArrayList<RouteTimeModel> routeTimes){
        // TODO: Update json
    }

    public boolean checkRouteAvailability(String routeCode){
        boolean check = false;
        for (RouteTimeModel r : getAllRouteTime()) {
            if (r.getRouteCode().equals(routeCode)){
                check = true;
                break;
            }
        }
        return check;
    }

    public String getLastRouteTimeCode(){
        return getAllRouteTime().get(getAllRouteTime().size()-1).getRouteTimeCode();
    }

    public String generateLastRouteTimeCode(){
        String current = getLastRouteTimeCode();
        int newCode = Integer.valueOf(current.split("WR")[0]);
        String newString = "WR" + Integer.toString(newCode);
        return newString;
    }

    public ArrayList<RwRouteModel> getAllRwRoute(){
        ArrayList<RwRouteModel> rwRoutes = new ArrayList<RwRouteModel>();
        // TODO: get from json
        return rwRoutes;
    }

	public RwRouteModel getRwRoute(String routeCode) {
        RwRouteModel rwRoute = new RwRouteModel();
        for (RwRouteModel r : getAllRwRoute()) {
            if (r.getRoute().getRouteCode().equals(routeCode)){
                rwRoute = r;
                break;
            }
        }
		return rwRoute;
	}

	public boolean deleteRouteTime(String routeTimeCode) {
        ArrayList<RouteTimeModel> routeTimes = new ArrayList<RouteTimeModel>();
        boolean found = false;

        for (RouteTimeModel r : routeTimes) {
            if (r.getRouteTimeCode().equals(routeTimeCode)){
                routeTimes.remove(r);
                found = true;
                break;
            }
        }

        if (found){
            updateRouteTime(routeTimes);
        }

        return found;
	}
}
