package org.kelompok4.app;

import java.util.ArrayList;

public class RwRouteModel {
    private RouteModel route;
    ArrayList<RwTrackModel> list = new ArrayList<RwTrackModel>();

    public RwRouteModel(RouteModel route, ArrayList<RwTrackModel> list) {
        this.route = route;
        this.list = list;
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
}
