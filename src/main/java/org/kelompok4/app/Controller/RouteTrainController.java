package org.kelompok4.app.Controller;

import java.util.ArrayList;
import java.util.Comparator;

import org.kelompok4.app.Interface.ICanCreate;
import org.kelompok4.app.Interface.ICanDelete;
import org.kelompok4.app.Interface.ICanRead;
import org.kelompok4.app.Model.RouteTrainModel;
import org.kelompok4.app.Model.TrainModel;
import org.kelompok4.app.View.RouteTrainView;

public class RouteTrainController implements ICanCreate, ICanRead, ICanDelete {
    RouteTrainModel routeTrainModel;
    RouteTrainView routeTrainView;

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



    public void addTrain(TrainModel train){
        ArrayList<TrainModel> current = routeTrainModel.getList();
        if (current.contains(train)){
            routeTrainView.FailedAddRouteTrain();
        } else {
            current.add(train);
            routeTrainModel.setList(current);
            // TODO: Update json
            routeTrainView.SuccessAddRouteTrain();
        }
    }

    public void displayRouteTrain(){
        // for (TrainModel trainModel : routeTrainModel.getList()) {
            
        // }

        // TODO: Display list
    }

    public void sortTrain(){
        ArrayList<TrainModel> current = routeTrainModel.getList();
        current.sort(Comparator.comparing(TrainModel::getTrainCode));
        routeTrainModel.setList(current);
        // TODO: Update json
    }

    // public void deleteTrain(TrainModel train){
    //     ArrayList<TrainModel> current = routeTrainModel.getList();
    //     if (current.remove(train)){
    //         routeTrainModel.setList(current);
    //         // TODO: Update json
    //         routeTrainView.SuccessDeleteRouteTrain();
    //     } else {
    //         routeTrainView.FailedDeleteRouteTrain();
    //     }
    // }

    public ArrayList<RouteTrainModel> getAllRouteTrain(){
        ArrayList<RouteTrainModel> routeTrains = new ArrayList<RouteTrainModel>();
        // TODO: Get from json
        return routeTrains;
    }

    public String allRouteTrainView(ArrayList<RouteTrainModel> routeTrains){
        routeTrainView.HeaderViewRouteTrain();
        TableStringBuilder<RouteTrainModel> t = new TableStringBuilder<>();
        t.addColumn("Kode Kereta Rute", RouteTrainModel::getRouteTrainCode);
        t.addColumn("Kode Rute", RouteTrainModel::getRwRouteCode);
        t.addColumn("Kereta Tersedia Pada Rute", RouteTrainModel::getListString);
        return t.createString(routeTrains);
    }

}
