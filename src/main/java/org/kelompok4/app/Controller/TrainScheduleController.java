package org.kelompok4.app.Controller;

import java.util.ArrayList;
import java.util.Scanner;

import org.kelompok4.app.Interface.ICanCreate;
import org.kelompok4.app.Interface.ICanRead;
import org.kelompok4.app.Model.RouteModel;
import org.kelompok4.app.Model.RouteTimeModel;
import org.kelompok4.app.Model.RouteTrainModel;
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

    public ArrayList<TrainScheduleModel> generateTrainSchedule(RouteTrainModel train, RouteTimeModel time){
        ArrayList<TrainScheduleModel> schedule = new ArrayList<TrainScheduleModel>();

        

        // TODO: Update json


        return schedule;
    }

    public ArrayList<TrainScheduleModel> findTrainSchedule(RouteModel route){
        ArrayList<TrainScheduleModel> schedule = new ArrayList<TrainScheduleModel>();

        return schedule;
    }
}
