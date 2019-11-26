package org.kelompok4.app.Model;

import java.util.ArrayList;

public class RouteTimeModel {
    private RwRouteModel rwRoute;
    private String routeTimeCode;
    private ArrayList<TimeModel> list = new ArrayList<TimeModel>();
    public RouteTimeModel(RwRouteModel rwRoute, String routeTimeCode, ArrayList<TimeModel> list) {
        this.rwRoute = rwRoute;
        this.routeTimeCode = routeTimeCode;
        this.list = list;
    }

    public RouteTimeModel() {
    }

    public RwRouteModel getRwRoute() {
        return rwRoute;
    }

    public void setRwRoute(RwRouteModel rwRoute) {
        this.rwRoute = rwRoute;
    }

    public String getRouteTimeCode() {
        return routeTimeCode;
    }

    public void setRouteTimeCode(String routeTimeCode) {
        this.routeTimeCode = routeTimeCode;
    }

    public ArrayList<TimeModel> getList() {
        return list;
    }

    public void setList(ArrayList<TimeModel> list) {
        this.list = list;
    }

    public String routeCode(){
        return rwRoute.getRoute().getRouteCode();
    }

    public String listString(){
        String output = "";
        for (TimeModel timeModel : list) {
            output += "- ";
            output += timeModel.getTimeCode();
            output += "\n";
        }

        return output;
    }
}
