package org.kelompok4.app.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import com.github.freva.asciitable.AsciiTable;
import com.github.freva.asciitable.Column;

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
    TrainScheduleRepo trainScheduleRepo = new TrainScheduleRepo();

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

    public void generateTrainSchedule(ArrayList<RwRouteModel> rwRoutes, ArrayList<RouteTimeModel> routeTimes,
            ArrayList<RouteTrainModel> routeTrains) {
        boolean generateStatus = true;
        trainScheduleRepo.deleteAll();
        for (RwRouteModel r : rwRoutes) {
            System.out.println("Generating schedule at route " + r.getRoute().getRouteCode());
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
            }
            if (generateStatus) {
                LocalDate currentDate = LocalDate.now();
                int is = 1; // Counter for assign schedule code
                TrainScheduleModel trainSchedule = new TrainScheduleModel();
                for (int i = 0; i < 30; i++) {
                    int j = 0; // Counter for assign train
                    for (TimeModel t : routeTimeFromArray(routeTimes, r).getList()) {
                        trainSchedule.setDate(currentDate.plusDays(i).toString());
                        trainSchedule.setRwRouteModel(r);
                        trainSchedule.setTimeModel(t);
                        trainSchedule.setTrainModel(routeTrainFromArray(routeTrains, r).getList().get(j));
                        trainSchedule.setScheduleCode("JW" + is);
                        trainScheduleRepo.create(trainSchedule);
                        is++;
                        j++;
                    }
                }
            }
        }
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
            if (r.getRwRoute().getRoute().getRouteCode().equals(rwRoute.getRoute().getRouteCode())) {
                output = r;
                return output;
            }
        }
        return output;
    }

    public boolean searchRwRouteFromRouteTime(ArrayList<RouteTimeModel> routeTimes, RwRouteModel rwRoute) {
        boolean check = false;
        for (RouteTimeModel r : routeTimes) {
            if (r.getRwRoute().getRoute().getRouteCode().equals(rwRoute.getRoute().getRouteCode())) {
                check = true;
                return check;
            }
        }
        return check;
    }

    public RouteTrainModel routeTrainFromArray(ArrayList<RouteTrainModel> routeTrains, RwRouteModel rwRoute) {
        RouteTrainModel output = new RouteTrainModel();
        for (RouteTrainModel r : routeTrains) {
            if (r.getRwRoute().getRoute().getRouteCode().equals(rwRoute.getRoute().getRouteCode())) {
                output = r;
                return output;
            }
        }
        return output;
    }

    public boolean searchRwRouteFromRouteTrain(ArrayList<RouteTrainModel> routeTrains, RwRouteModel rwRoute) {
        boolean check = false;
        for (RouteTrainModel r : routeTrains) {
            if (r.getRwRoute().getRoute().getRouteCode().equals(rwRoute.getRoute().getRouteCode())) {
                check = true;
                return check;
            }
        }
        return check;
    }

    public ArrayList<TrainScheduleModel> getAllTrainSchedule() {
        return trainScheduleRepo.getAll();
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

        return AsciiTable.getTable(trainSchedules,
                Arrays.asList(new Column().header("Kode Jadwal").with(trainSchedule -> trainSchedule.getScheduleCode()),
                        new Column().header("Tanggal").with(trainSchedule -> trainSchedule.getDate()),
                        new Column().header("Waktu Keberangkatan")
                                .with(trainSchedule -> trainSchedule.departureTimeString()),
                        new Column().header("Keberangkatan").with(trainSchedule -> trainSchedule.departureCityString()),
                        new Column().header("Tujuan").with(trainSchedule -> trainSchedule.arrivalCityString()),
                        new Column().header("Waktu Tiba").with(trainSchedule -> trainSchedule.arrivalTimeString()),
                        new Column().header("KAI").with(trainSchedule -> trainSchedule.trainCodeString()),
                        new Column().header("Status").with(trainSchedule -> trainSchedule.remainingSeatString())));
    }
}
