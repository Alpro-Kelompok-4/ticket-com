package org.kelompok4.app.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import com.github.freva.asciitable.AsciiTable;
import com.github.freva.asciitable.Column;

import org.kelompok4.app.Interface.ICanCreate;
import org.kelompok4.app.Interface.ICanDelete;
import org.kelompok4.app.Interface.ICanRead;
import org.kelompok4.app.Model.RouteTimeModel;
import org.kelompok4.app.Model.RwRouteModel;
import org.kelompok4.app.Model.TimeModel;
import org.kelompok4.app.Repo.RouteTimeRepo;
import org.kelompok4.app.Repo.RwRouteRepo;
import org.kelompok4.app.Repo.TimeRepo;
import org.kelompok4.app.View.RouteTimeView;

public class RouteTimeController implements ICanCreate, ICanRead, ICanDelete {
    RouteTimeModel routeTimeModel;
    RouteTimeView routeTimeView;
    RouteTimeRepo routeTimeRepo = new RouteTimeRepo();

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
        
        TimeRepo timeRepo = new TimeRepo();
        
        return timeRepo.getAll();
    }

    public void setRouteTime(RouteTimeModel routeTime){
        routeTimeRepo.create(routeTime);
    }

    public void addTime(TimeModel time, RouteTimeModel routeTime) {
        ArrayList<TimeModel> current = routeTime.getList();
        if (current.contains(time)) {
            routeTimeView.FailedAddRouteTime();
        } else {
            current.add(time);
            routeTime.setList(current);
            routeTimeRepo.update(routeTime);
        }
    }

    public void displayTime() {
        routeTimeView.HeaderViewRouteTime();
        // TODO: Unused
    }

    public void sortTime(RouteTimeModel routeTime) {
        ArrayList<TimeModel> current = routeTime.getList();
        current.sort(Comparator.comparing(TimeModel::getTimeCode));
        routeTime.setList(current);
        routeTimeRepo.update(routeTime);
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
        
        return routeTimeRepo.getAll();
    }

    public String allRouteTimeView(ArrayList<RouteTimeModel> routeTimes){
        routeTimeView.HeaderViewRouteTime();
        return AsciiTable.getTable(routeTimes, Arrays.asList(
            new Column().header("Kode Kereta Rute").with(routeTime -> routeTime.getRouteTimeCode()),
            new Column().header("Kode Rute").with(routeTime -> routeTime.routeCode()),
            new Column().header("Waktu Tersedia Pada Rute").with(routeTime -> routeTime.listString())
        ));
    }

    public void updateRouteTime(ArrayList<RouteTimeModel> routeTimes){
        routeTimeRepo.update(routeTimes);
    }

    public boolean checkRouteAvailability(String routeCode){
        boolean check = true;
        for (RouteTimeModel r : getAllRouteTime()) {
            if (r.routeCode().equals(routeCode)){
                check = false;
                break;
            }
        }
        return check;
    }

    public String getLastRouteTimeCode(){
        if (getAllRouteTime().size() <= 0){
            return "WR0";
        } else {
            return getAllRouteTime().get(getAllRouteTime().size()-1).getRouteTimeCode();
        }
    }

    public String generateLastRouteTimeCode(){
        String current = getLastRouteTimeCode();
        int newCode = Integer.valueOf(current.split("WR")[1]);
        String newString = "WR" + Integer.toString(newCode);
        return newString;
    }

    public ArrayList<RwRouteModel> getAllRwRoute(){
        RwRouteRepo repo = new RwRouteRepo();
        return repo.getAll();
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
