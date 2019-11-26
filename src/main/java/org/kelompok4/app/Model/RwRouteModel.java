package org.kelompok4.app.Model;

import java.util.ArrayList;

public class RwRouteModel {
    private RouteModel route;
    private String rwRouteCode;
    private ArrayList<RwTrackModel> list = new ArrayList<>();
    private int sumOfDuration;
    public RwRouteModel(RouteModel route, ArrayList<RwTrackModel> list, int durasi, String code) {
        this.route = route;
        this.list = list;
        this.sumOfDuration = durasi;
        this.rwRouteCode= code;
    }
    public RwRouteModel() {
    }

    public RouteModel getRoute() {
        return route;
    }

    public void setRoute(RouteModel route) {
        this.route = route;
    }

    public ArrayList<RwTrackModel> getList() {
        return list;
    }

    public void setList(ArrayList<RwTrackModel> list) {
        this.list = list;
    }

    public String getRwRouteCode() {
        return rwRouteCode;
    }

    public void setRwRouteCode(String rwRouteCode) {
        this.rwRouteCode = rwRouteCode;
    }

    public int getSumOfDuration() {
        return sumOfDuration;
    }

    public void setSumOfDuration(int sumOfDuration) {
        this.sumOfDuration = sumOfDuration;
    }
}
