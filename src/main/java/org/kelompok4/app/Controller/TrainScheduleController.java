package org.kelompok4.app.Controller;

import java.util.ArrayList;
import java.util.Scanner;

import org.kelompok4.app.Interface.ICanCreate;
import org.kelompok4.app.Interface.ICanRead;
import org.kelompok4.app.Model.RouteModel;
import org.kelompok4.app.Model.RouteTimeModel;
import org.kelompok4.app.Model.RouteTrainModel;
import org.kelompok4.app.Model.RwRouteModel;
import org.kelompok4.app.Model.TimeModel;
import org.kelompok4.app.Model.TrainScheduleModel;
import org.kelompok4.app.View.TrainScheduleView;

public class TrainScheduleController implements ICanCreate, ICanRead {
    TrainScheduleModel trainScheduleModel;
    TrainScheduleView trainScheduleView;
    Scanner scanner = new Scanner(System.in);

    public TrainScheduleController(TrainScheduleModel trainScheduleModel, TrainScheduleView trainScheduleView) {
        this.trainScheduleModel = trainScheduleModel;
        this.trainScheduleView = trainScheduleView;
    }

    public TrainScheduleModel getTrainScheduleModel() {
        return this.trainScheduleModel;
    }

    public void setTrainScheduleModel(TrainScheduleModel trainScheduleModel) {
        this.trainScheduleModel = trainScheduleModel;
    }

    public TrainScheduleView getTrainScheduleView() {
        return this.trainScheduleView;
    }

    public void setTrainScheduleView(TrainScheduleView trainScheduleView) {
        this.trainScheduleView = trainScheduleView;
    }

    @Override
    public void create() {

    }

    @Override
    public void read() {

    }

    public boolean generateTrainSchedule(ArrayList<RwRouteModel> rwRoutes, ArrayList<RouteTimeModel> routeTimes, ArrayList<RouteTrainModel> routeTrains){
        ArrayList<TrainScheduleModel> trainSchedules = new ArrayList<TrainScheduleModel>();
        boolean generateStatus = true;
        for (RwRouteModel r : rwRoutes) {
            
        }
        
        // TODO: Update json
        return generateStatus;
    }

    public ArrayList<TrainScheduleModel> getAllTrainSchedule(){
        ArrayList<TrainScheduleModel> schedules = new ArrayList<TrainScheduleModel>();
        // TODO: Get from json

        return schedules;
    }

    public ArrayList<TrainScheduleModel> findTrainSchedule(RouteModel route, TimeModel time){
        ArrayList<TrainScheduleModel> schedules = new ArrayList<TrainScheduleModel>();
        for (TrainScheduleModel t : getAllTrainSchedule()) {
            if (t.getTimeModel().equals(time) && t.getRwRouteModel().getRoute().equals(route)){
                schedules.add(t);
            }
        }
        return schedules;
    }

    public String allTrainScheduleView(ArrayList<TrainScheduleModel> trainSchedules){
        TableStringBuilder<TrainScheduleModel> t = new TableStringBuilder<TrainScheduleModel>();
        t.addColumn("Kode Jadwal", TrainScheduleModel::getScheduleCode);
        t.addColumn("Tanggal", TrainScheduleModel::getDateString);
        t.addColumn("Waktu Keberangkatan", TrainScheduleModel::getDepartureTimeString);
        t.addColumn("Keberangkatan", TrainScheduleModel::getDepartureCityString);
        t.addColumn("Tujuan", TrainScheduleModel::getArrivalCityString);
        t.addColumn("Waktu Tiba", TrainScheduleModel::getArrivalTimeString);
        t.addColumn("KAI", TrainScheduleModel::getTrainCodeString);
        t.addColumn("Status", TrainScheduleModel::getRemainingSeatString);
        return t.createString(trainSchedules);
    }
}
