package org.kelompok4.app.Model;

public class RouteModel {
    private CityModel departure;
    private CityModel arrival;
    private String routeCode;
    private PriceModel business;
    private PriceModel premium;

    public RouteModel(CityModel departure, CityModel arrival, String routeCode, PriceModel business, PriceModel premium) {
        this.departure = departure;
        this.arrival = arrival;
        this.routeCode = routeCode;
        this.business = business;
        this.premium = premium;
    }

    public RouteModel() {}

    public CityModel getDeparture() {
        return departure;
    }

    public void setDeparture(CityModel departure) {
        this.departure = departure;
    }

    public CityModel getArrival() {
        return arrival;
    }

    public void setArrival(CityModel arrival) {
        this.arrival = arrival;
    }

    public String getRouteCode() {
        return routeCode;
    }

    public void setRouteCode(String routeCode) {
        this.routeCode = routeCode;
    }

    public PriceModel getBusiness() {
        return business;
    }

    public void setBusiness(PriceModel business) {
        this.business = business;
    }

    public PriceModel getPremium() {
        return premium;
    }

    public void setPremium(PriceModel premium) {
        this.premium = premium;
    }
}
