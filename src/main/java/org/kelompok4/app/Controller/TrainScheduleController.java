package org.kelompok4.app.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import org.kelompok4.app.Interface.ICanCreate;
import org.kelompok4.app.Interface.ICanRead;
import org.kelompok4.app.Model.JamModel;
import org.kelompok4.app.Model.RouteModel;
import org.kelompok4.app.Model.RouteTimeModel;
import org.kelompok4.app.Model.RouteTrainModel;
import org.kelompok4.app.Model.RwRouteModel;
import org.kelompok4.app.Model.TimeModel;
import org.kelompok4.app.Model.TrainScheduleModel;
import org.kelompok4.app.Repo.RwRouteRepo;
import org.kelompok4.app.Repo.TrainScheduleRepo;
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

    public boolean generateTrainSchedule(ArrayList<RwRouteModel> rwRoutes, ArrayList<RouteTimeModel> routeTimes,
            ArrayList<RouteTrainModel> routeTrains) {
        boolean generateStatus = true;
        for (RwRouteModel r : rwRoutes) {
            if (searchRwRouteFromRouteTime(routeTimes, r) && searchRwRouteFromRouteTrain(routeTrains, r)) {
                RouteTimeModel routeTime = routeTimeFromArray(routeTimes, r);
                RouteTrainModel routeTrain = routeTrainFromArray(routeTrains, r);
                if (routeTime.getList().size() > routeTrain.getList().size()) {
                    System.out.println("Failed to generate, train not enough at " + r.getRoute().getRouteCode());
                    generateStatus = false;
                } else {
                    if (hasOpposite(r)) {
                        RwRouteModel opposite = takeOpposite(r);
                        if (searchRwRouteFromRouteTime(routeTimes, opposite)
                                && searchRwRouteFromRouteTrain(routeTrains, opposite)) {
                            RouteTimeModel routeTimeOpposite = routeTimeFromArray(routeTimes, opposite);
                            // RouteTrainModel routeTrainOpposite = routeTrainFromArray(routeTrains,
                            // opposite);
                            if (checkIntersect(routeTime, routeTimeOpposite)) {
                                System.out.println(
                                        "Failed to generate, has intersection at " + opposite.getRoute().getRouteCode()
                                                + " opposite route from " + r.getRoute().getRouteCode());
                                generateStatus = false;
                                break;
                            } else {
                                // Generating model case has opposite with schedule
                            }
                        } else {
                            // Generating model case no opposite
                        }
                    } else {
                        // Generating model case no opposite
                    }
                }
            } else {
                System.out.println(
                        "Failed to generate, no routeTime or routeTrain file at " + r.getRoute().getRouteCode());
                generateStatus = false;
                break;
            }
        }

        if (generateStatus) {
            TrainScheduleRepo repo = new TrainScheduleRepo();
            repo.deleteAll();
            LocalDate currentDate = LocalDate.now();
            int is = 1; //Counter for assign schedule code
            for (RwRouteModel r : rwRoutes) {
                TrainScheduleModel trainSchedule = new TrainScheduleModel();
                for (int i = 0; i < 30; i++){
                    int j = 0; //Counter for assign train
                    for (TimeModel t : routeTimeFromArray(routeTimes, r).getList()) {
                        trainSchedule.setDate(currentDate.plusDays(i));
                        trainSchedule.setRwRouteModel(r);
                        trainSchedule.setTimeModel(t);
                        trainSchedule.setTrainModel(routeTrainFromArray(routeTrains, r).getList().get(j));
                        trainSchedule.setScheduleCode("JW"+is);
                        repo.create(trainSchedule);
                        is++;
                        j++;
                    }
                }
            }
            
            // TODO: Update json
        }

        return generateStatus;
    }

    public boolean checkIntersect(RouteTimeModel routeTime, RouteTimeModel routeTimeOpposite) {
        boolean check;
        JamModel firstTime = routeTime.getList().get(0).getJam();
        JamModel lastTime = routeTime.getList().get(routeTime.getList().size() - 1).getJam();
        lastTime.addMinute(routeTime.getRwRoute().getSumOfDuration());
        JamModel firstTimeOpposite = routeTimeOpposite.getList().get(0).getJam();
        JamModel lastTimeOpposite = routeTimeOpposite.getList().get(routeTimeOpposite.getList().size() - 1).getJam();
        lastTimeOpposite.addMinute(routeTimeOpposite.getRwRoute().getSumOfDuration());
        check = firstTimeOpposite.toMinute() < lastTime.toMinute()
                && firstTime.toMinute() < firstTimeOpposite.toMinute();
        check = check || firstTime.toMinute() < lastTimeOpposite.toMinute()
                && firstTimeOpposite.toMinute() < firstTime.toMinute();
        return check;
    }

    public RwRouteModel takeOpposite(RwRouteModel rwRoute) {
        RwRouteModel current = new RwRouteModel();
        String code = rwRoute.getRoute().getRouteCode();
        String newCode = code.split("-")[1] + "-" + code.split("-")[0];
        current = new RwRouteRepo().get(newCode);
        return current;
    }

    public boolean hasOpposite(RwRouteModel rwRoute) {
        String code = rwRoute.getRoute().getRouteCode();
        String newCode = code.split("-")[1] + "-" + code.split("-")[0];
        return new RwRouteRepo().get(newCode).equals(rwRoute);
    }

    public RouteTimeModel routeTimeFromArray(ArrayList<RouteTimeModel> routeTimes, RwRouteModel rwRoute) {
        RouteTimeModel output = new RouteTimeModel();
        for (RouteTimeModel r : routeTimes) {
            if (r.getRwRoute().equals(rwRoute)) {
                output = r;
                break;
            }
        }
        return output;
    }

    public boolean searchRwRouteFromRouteTime(ArrayList<RouteTimeModel> routeTimes, RwRouteModel rwRoute) {
        boolean check = false;
        for (RouteTimeModel r : routeTimes) {
            if (r.getRwRoute().equals(rwRoute)) {
                check = true;
                break;
            }
        }
        return check;
    }

    public RouteTrainModel routeTrainFromArray(ArrayList<RouteTrainModel> routeTrains, RwRouteModel rwRoute) {
        RouteTrainModel output = new RouteTrainModel();
        for (RouteTrainModel r : routeTrains) {
            if (r.getRwRoute().equals(rwRoute)) {
                output = r;
                break;
            }
        }
        return output;
    }

    public boolean searchRwRouteFromRouteTrain(ArrayList<RouteTrainModel> routeTrains, RwRouteModel rwRoute) {
        boolean check = false;
        for (RouteTrainModel r : routeTrains) {
            if (r.getRwRoute().equals(rwRoute)) {
                check = true;
                break;
            }
        }
        return check;
    }

    public ArrayList<TrainScheduleModel> getAllTrainSchedule() {
        ArrayList<TrainScheduleModel> schedules = new ArrayList<TrainScheduleModel>();
        // TODO: Get from json

        return schedules;
    }

    public ArrayList<TrainScheduleModel> findTrainSchedule(RouteModel route, TimeModel time) {
        ArrayList<TrainScheduleModel> schedules = new ArrayList<TrainScheduleModel>();
        for (TrainScheduleModel t : getAllTrainSchedule()) {
            if (t.getTimeModel().equals(time) && t.getRwRouteModel().getRoute().equals(route)) {
                schedules.add(t);
            }
        }
        return schedules;
    }

    public String allTrainScheduleView(ArrayList<TrainScheduleModel> trainSchedules) {
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
