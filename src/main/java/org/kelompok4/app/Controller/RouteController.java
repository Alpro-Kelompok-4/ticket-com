package org.kelompok4.app.Controller;

import org.kelompok4.app.Interface.*;
import org.kelompok4.app.Model.CityModel;
import org.kelompok4.app.Model.PriceModel;
import org.kelompok4.app.Model.RouteModel;
import org.kelompok4.app.Repo.RouteRepo;
import org.kelompok4.app.View.RouteView;

public class RouteController implements ICanManageRoute, ICanCreate, ICanUpdate, ICanDelete, ICanRead {
    RouteModel routeModel;
    RouteView routeView;
    RouteRepo routeRepo =  new RouteRepo();

    public RouteController(RouteModel routeModel, RouteView routeView) {
        this.routeModel = routeModel;
        this.routeView = routeView;
    }

    public RouteController() {
    }

    public RouteModel getRouteModel() {
        return routeModel;
    }

    public void setRouteModel(RouteModel routeModel) {
        this.routeModel = routeModel;
    }

    public RouteView getRouteView() {
        return routeView;
    }

    public void setRouteView(RouteView routeView) {
        this.routeView = routeView;
    }

    public RouteRepo getRouteRepo() {
        return routeRepo;
    }

    public void setRouteRepo(RouteRepo routeRepo) {
        this.routeRepo = routeRepo;
    }

    @Override
    public void create() {

    }

    @Override
    public void delete() {

    }

    @Override
    public CityModel getDeparture() {
        return null;
    }

    @Override
    public void setDeparture(CityModel departure) {

    }

    @Override
    public CityModel getArrival() {
        return null;
    }

    @Override
    public void setArrival(CityModel arrival) {

    }

    @Override
    public String getRouteCode() {
        return null;
    }

    @Override
    public void setRouteCode(String routeCode) {

    }

    @Override
    public PriceModel getBusiness() {
        return null;
    }

    @Override
    public void setBusiness(PriceModel business) {

    }

    @Override
    public PriceModel getPremium() {
        return null;
    }

    @Override
    public void setPremium(PriceModel premium) {

    }

    @Override
    public void read() {

    }

    @Override
    public void update() {

    }
}
