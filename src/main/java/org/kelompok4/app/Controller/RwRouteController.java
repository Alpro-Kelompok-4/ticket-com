package org.kelompok4.app.Controller;

import org.kelompok4.app.Interface.ICanCreate;
import org.kelompok4.app.Interface.ICanDelete;
import org.kelompok4.app.Interface.ICanManageRwRoute;
import org.kelompok4.app.Interface.ICanRead;
import org.kelompok4.app.Model.*;
import org.kelompok4.app.View.RwRouteView;

import java.util.ArrayList;

public class RwRouteController implements ICanRead, ICanCreate, ICanDelete, ICanManageRwRoute {
    RwRouteModel rwRouteModel;
    RwRouteView rwRouteView;

    public RwRouteController() {
    }

    public RwRouteController(RwRouteModel rwRouteModel, RwRouteView rwRouteView) {
        this.rwRouteModel = rwRouteModel;
        this.rwRouteView = rwRouteView;
    }

    public RwRouteModel getRwRouteModel() {
        return rwRouteModel;
    }

    public void setRwRouteModel(RwRouteModel rwRouteModel) {
        this.rwRouteModel = rwRouteModel;
    }

    public RwRouteView getRwRouteView() {
        return rwRouteView;
    }

    public void setRwRouteView(RwRouteView rwRouteView) {
        this.rwRouteView = rwRouteView;
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

    @Override
    public RouteModel getRoute() {
        return rwRouteModel.getRoute();
    }

    @Override
    public void setRoute(RouteModel route) {
        rwRouteModel.setRoute(route);
    }

    @Override
    public ArrayList<RwTrackModel> getList() {
        return rwRouteModel.getList();
    }

    @Override
    public void setList(ArrayList<RwTrackModel> list) {
        rwRouteModel.setList(list);
    }

    @Override
    public void setSumOfDuration(int duration) {
        rwRouteModel.setSumOfDuration(duration);
    }

    @Override
    public int getSumOfDuration() {
        return rwRouteModel.getSumOfDuration();
    }

    @Override
    public String getRwRouteCode() {
        return rwRouteModel.getRwRouteCode();
    }

    @Override
    public void setRwRouteCode(String rwRouteCode) {
        rwRouteModel.setRwRouteCode(rwRouteCode);
    }

    public String getRouteCode() {
        return rwRouteModel.routeCode();
    }

    public void addRwRoute() {
        rwRouteView.printAddRwRouteViewPage();
        rwRouteView.printCodeRwRouteView();

    }

    public boolean validateStasion(String statiun) {
        return true;
    }

    public boolean validateInputTrackRoute(String input_track) {
        boolean valid;
        String[] inputs = input_track.split("\\s+");
        // System.out.println(inputs.length);
        // validasi jumlah string ada 4
        if (inputs.length == 3) {
            // belum validasi nama stasiun harus nyambung
            if (validateStasion(inputs[0]) && validateStasion(inputs[0])) {
                valid = true;
            } else {
                valid = false;
            }
        } else {
            valid = false;
        }
        return true;
    }

    public void printTrackRwRoute(int i) {
        rwRouteView.printTrackInputView(i);
    }

    public void showRwRoute() {
        rwRouteView.printViewRwRoutePage();
        rwRouteView.printCodeRwRouteView();
    }

    public void deleteRwRoute() {
        rwRouteView.printDeleteRwRouteViewPage();
        rwRouteView.printDeleteRwRouteView();
    }

    public String allRwRouteView(ArrayList<RwRouteModel> rwRouteModels) {
        TableStringBuilder<RwRouteModel> t = new TableStringBuilder<>();
        t.addColumn("Kode Jalur", RwRouteModel::getRwRouteCode);
        t.addColumn("Kode Rute", RwRouteModel::routeCode);
        t.addColumn("Jalur Yang Dilewati", RwRouteModel::routeCode);
        t.addColumn("Waktu", RwRouteModel::getSumOfDuration);
        return t.createString(rwRouteModels);
    }

    public void resultAddRwRoute(boolean success) {
        if (success) {
            rwRouteView.SuccessAddRwRoute();
        } else {
            rwRouteView.FailedAddRwRoute();
        }
    }

    public void resultDeleteRwRoute(boolean success) {
        if (success) {
            rwRouteView.SuccessDeleteRwRoute();
        } else {
            rwRouteView.FailedDeleteRwRoute();
        }
    }

    public boolean validateInputCodeRoute(String input) {
        boolean valid;
        // rwRouteModel.getRoute().setRouteCode(input);
        if (validateCodeRoute()) {
            CityModel origin = new CityModel("BDG", "BANDUNG");
            CityModel dest = new CityModel("JKT", "JAKARTA");
            // nanti get route dari JSON
            setRoute(new RouteModel(origin, dest, "BDG-JKT", new PriceModel(100000), new PriceModel(100000)));
            valid = true;
        } else {
            valid = false;
        }
        return valid;
    }

    public boolean validateCodeRoute() {
        // mengecek kode jalur dari json
        return true;
    }

    public boolean validateListTrack(ArrayList<String> tracks) {
        // ubah jadi array list times
        // simpan ke model
        boolean valid = true;
        String temp;
        int i = 0;
        int t_duration = 0;
        ArrayList<RwTrackModel> rwTrackModels = new ArrayList<RwTrackModel>();
        while (i < tracks.size() && valid) {
            String[] track = tracks.get(i).split("\\s+");
            // String Origin
            // nanti diganti ngeget dari JSON
            System.out.print(tracks.get(i));
            RwStationModel origin = new RwStationModel(track[0].substring(0, 3), track[0]);
            // String Destination
            // nanti diganti ngeget dari JSON
            RwStationModel destination = new RwStationModel(track[1].substring(0, 3), track[1]);
            rwTrackModels.add(new RwTrackModel(origin, destination, Integer.parseInt(track[2])));
            t_duration = t_duration + Integer.parseInt(track[2]);
            i++;
            temp = track[1];
            // pengecekan destination dengan origin
            if (i > 0) {
                // System.out.print(track[0] + " " + temp);
                if (!temp.equals(track[1])) {
                    valid = false;
                }
            }
        }

        if (valid) {
            setList(rwTrackModels);
            setSumOfDuration(t_duration);
            setRwRouteCode("JL01");
        } else {
            valid = false;
        }
        return valid;
    }

    public boolean validateTimeRw() {
        return true;
    }

    public void rwRouteMenuView() {
        rwRouteView.menuRwRouteView();
    }

    public void resultView() {
    }

    public void rwRouteTable(String S) {
        rwRouteView.printShowTable(S);
    }
}
