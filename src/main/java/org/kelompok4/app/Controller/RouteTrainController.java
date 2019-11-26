package org.kelompok4.app.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import com.github.freva.asciitable.AsciiTable;
import com.github.freva.asciitable.Column;

import org.kelompok4.app.Interface.ICanCreate;
import org.kelompok4.app.Interface.ICanDelete;
import org.kelompok4.app.Interface.ICanRead;
import org.kelompok4.app.Model.RouteTrainModel;
import org.kelompok4.app.Model.RwRouteModel;
import org.kelompok4.app.Model.TrainModel;
import org.kelompok4.app.Repo.RouteTrainRepo;
import org.kelompok4.app.Repo.RwRouteRepo;
import org.kelompok4.app.Repo.TrainRepo;
import org.kelompok4.app.View.RouteTrainView;

public class RouteTrainController implements ICanCreate, ICanRead, ICanDelete {
    RouteTrainModel routeTrainModel;
    RouteTrainView routeTrainView;
    RouteTrainRepo routeTrainRepo = new RouteTrainRepo();

    public RouteTrainController(RouteTrainModel routeTrainModel, RouteTrainView routeTrainView) {
        this.routeTrainModel = routeTrainModel;
        this.routeTrainView = routeTrainView;
    }

    public RouteTrainModel getRouteTrainModel() {
        return this.routeTrainModel;
    }

    public void setRouteTrainModel(RouteTrainModel routeTrainModel) {
        this.routeTrainModel = routeTrainModel;
    }

    public RouteTrainView getRouteTrainView() {
        return this.routeTrainView;
    }

    public void setRouteTrainView(RouteTrainView routeTrainView) {
        this.routeTrainView = routeTrainView;
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

    public TrainModel getTrain(String trainCode) {
        TrainModel train = new TrainModel();

        for (TrainModel t : getAllTrain()) {
            if (t.getTrainCode().equals(trainCode)) {
                train = t;
                break;
            }
        }

        return train;
    }

    public boolean searchTrain(String trainCode) {
        boolean check = false;

        for (TrainModel t : getAllTrain()) {
            if (t.getTrainCode().equals(trainCode)) {
                check = true;
                break;
            }
        }

        return check;
    }

    public ArrayList<TrainModel> getAllTrain() {
        TrainRepo trainRepo = new TrainRepo();

        return trainRepo.getAll();
    }

    public void setRouteTrain(RouteTrainModel routeTrain) {
        routeTrainRepo.create(routeTrain);
    }

    public void addTrain(TrainModel train, RouteTrainModel routeTrain) {
        ArrayList<TrainModel> current = routeTrain.getList();
        if (current.contains(train)) {
            routeTrainView.FailedAddRouteTrain();
        } else {
            current.add(train);
            routeTrain.setList(current);
            routeTrainRepo.update(routeTrain);
        }
    }

    public void displayRouteTrain() {
        // for (TrainModel trainModel : routeTrainModel.getList()) {

        // }

        // TODO: Unused
    }

    public void sortTrain(RouteTrainModel routeTrain) {
        ArrayList<TrainModel> current = routeTrain.getList();
        current.sort(Comparator.comparing(TrainModel::getTrainCode));
        routeTrain.setList(current);
        routeTrainRepo.update(routeTrain);
    }

    public void deleteTrain(TrainModel train) {
        ArrayList<TrainModel> current = routeTrainModel.getList();
        if (current.remove(train)) {
            routeTrainModel.setList(current);
            routeTrainView.SuccessDeleteRouteTrain();
        } else {
            routeTrainView.FailedDeleteRouteTrain();
        }
    }

    public RouteTrainModel getRouteTrain(String routeTrainCode) {
        RouteTrainModel routeTrain = new RouteTrainModel();
        for (RouteTrainModel r : getAllRouteTrain()) {
            routeTrain = r;
            break;
        }
        return routeTrain;
    }

    public ArrayList<RouteTrainModel> getAllRouteTrain() {
        return routeTrainRepo.getAll();
    }

    public String allRouteTrainView(ArrayList<RouteTrainModel> routeTrains) {
        routeTrainView.HeaderViewRouteTrain();
        return AsciiTable.getTable(routeTrains, Arrays.asList(
                new Column().header("Kode Kereta Rute").with(routeTrain -> routeTrain.getRouteTrainCode()),
                new Column().header("Kode Rute").with(routeTrain -> routeTrain.routeCode()),
                new Column().header("Kereta Tersedia Pada Rute").with(routeTrain -> routeTrain.listString())));
    }

    public void updateRouteTrain(ArrayList<RouteTrainModel> routeTrains) {
        routeTrainRepo.update(routeTrains);
    }

    public boolean checkRouteAvailability(String routeCode) {
        boolean check = true;
        for (RouteTrainModel r : getAllRouteTrain()) {
            if (r.routeCode().equals(routeCode)) {
                check = false;
                break;
            }
        }
        return check;
    }

    public String getLastRouteTrainCode() {
        if (getAllRouteTrain().size() <= 0) {
            return "KR0";
        } else {
            return getAllRouteTrain().get(getAllRouteTrain().size() - 1).getRouteTrainCode();
        }
    }

    public String generateLastRouteTrainCode() {
        String current = getLastRouteTrainCode();
        int newCode = Integer.valueOf(current.split("KR")[1]);
        String newString = "KR" + Integer.toString(newCode);
        return newString;
    }

    public ArrayList<RwRouteModel> getAllRwRoute() {
        RwRouteRepo repo = new RwRouteRepo();
        return repo.getAll();
    }

    public RwRouteModel getRwRoute(String routeCode) {
        RwRouteModel rwRoute = new RwRouteModel();
        for (RwRouteModel r : getAllRwRoute()) {
            if (r.getRoute().getRouteCode().equals(routeCode)) {
                rwRoute = r;
                break;
            }
        }
        return rwRoute;
    }

    public boolean deleteRouteTrain(String routeTrainCode) {
        ArrayList<RouteTrainModel> routeTrains = new ArrayList<RouteTrainModel>();
        boolean found = false;

        for (RouteTrainModel r : routeTrains) {
            if (r.getRouteTrainCode().equals(routeTrainCode)) {
                routeTrains.remove(r);
                found = true;
                break;
            }
        }

        if (found) {
            updateRouteTrain(routeTrains);
        }

        return found;
    }
}
