package org.kelompok4.app.Model;

import java.util.ArrayList;

public class RouteTrainModel {
    private RwRouteModel rwRoute;
    private String routeTrainCode;
    private ArrayList<TrainModel> list = new ArrayList<TrainModel>();

    public RouteTrainModel(RwRouteModel rwRoute, String routeTrainCode, ArrayList<TrainModel> list) {
        this.rwRoute = rwRoute;
        this.routeTrainCode = routeTrainCode;
        this.list = list;
    }

    public RouteTrainModel() {
    }

    public RwRouteModel getRwRoute() {
        return rwRoute;
    }

    public void setRwRoute(RwRouteModel rwRoute) {
        this.rwRoute = rwRoute;
    }

    public String getRouteTrainCode() {
        return routeTrainCode;
    }

    public void setRouteTrainCode(String routeTrainCode) {
        this.routeTrainCode = routeTrainCode;
    }

    public ArrayList<TrainModel> getList() {
        return list;
    }

    public void setList(ArrayList<TrainModel> list) {
        this.list = list;
    }
}
