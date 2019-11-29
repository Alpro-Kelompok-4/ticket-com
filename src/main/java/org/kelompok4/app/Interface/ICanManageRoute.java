package org.kelompok4.app.Interface;

import org.kelompok4.app.Model.CityModel;
import org.kelompok4.app.Model.PriceModel;

public interface ICanManageRoute {
    public CityModel getDeparture();

    public void setDeparture(CityModel departure);

    public CityModel getArrival();

    public void setArrival(CityModel arrival);

    public String getRouteCode();

    public void setRouteCode(String routeCode);
    //masih rigidth
    public PriceModel getBusiness();

    public void setBusiness(PriceModel business);
    public PriceModel getPremium();

    public void setPremium(PriceModel premium);
}
