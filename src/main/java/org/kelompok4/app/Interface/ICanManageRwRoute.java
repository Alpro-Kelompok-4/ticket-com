package org.kelompok4.app.Interface;

import org.kelompok4.app.Model.RouteModel;
import org.kelompok4.app.Model.RwTrackModel;

import java.util.ArrayList;

public interface ICanManageRwRoute {
    public RouteModel getRoute();
    public void setRoute(RouteModel route);
    public ArrayList<RwTrackModel> getList();
    public void setList(ArrayList<RwTrackModel> list);
    public void setSumOfDuration(int duration);
    public int getSumOfDuration();
    public String getRwRouteCode();
    public void setRwRouteCode(String rwRouteCode);
}
