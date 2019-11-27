package org.kelompok4.app.Presenter;

import java.util.ArrayList;

import org.kelompok4.app.Controller.TrainScheduleController;
import org.kelompok4.app.Interface.ICanRun;
import org.kelompok4.app.Model.RouteTimeModel;
import org.kelompok4.app.Model.RouteTrainModel;
import org.kelompok4.app.Model.RwRouteModel;
import org.kelompok4.app.Repo.RouteTimeRepo;
import org.kelompok4.app.Repo.RouteTrainRepo;
import org.kelompok4.app.Repo.RwRouteRepo;

public class TrainSchedulePresenter extends ContinuePresenter implements ICanRun {
    TrainScheduleController trainScheduleController;

    public TrainSchedulePresenter(TrainScheduleController trainScheduleController) {
        this.trainScheduleController = trainScheduleController;
    }

    public TrainScheduleController getTrainScheduleController() {
        return this.trainScheduleController;
    }

    public void setTrainScheduleController(TrainScheduleController trainScheduleController) {
        this.trainScheduleController = trainScheduleController;
    }

    @Override
    public void run() {
        trainScheduleController.getTrainScheduleView().MenuTrainScheduleView();
        int menu = sc.nextInt();
        sc.nextLine();
        menu(menu);
    }

    public void menu(int menu) {
        switch (menu) {
        case 1:
            generateSchedule();
            break;
        case 2:
            viewSchedule();
            break;
        }
    }

    public void generateSchedule() {
        trainScheduleController.getTrainScheduleView().printGenerateTrainSchedule();
        char c = sc.nextLine().charAt(0);
        if (c == 'Y') {
            RwRouteRepo rwRouteRepo = new RwRouteRepo();
            RouteTimeRepo routeTimeRepo = new RouteTimeRepo();
            RouteTrainRepo routeTrainRepo = new RouteTrainRepo();

            ArrayList<RwRouteModel> rwRoutes = rwRouteRepo.getAll();
            System.out.println(rwRoutes.get(0).getRoute().getRouteCode());
            ArrayList<RouteTimeModel> routeTimes = routeTimeRepo.getAll();
            System.out.println(routeTimes.get(0).getRwRoute().getRoute().getRouteCode());
            ArrayList<RouteTrainModel> routeTrains = routeTrainRepo.getAll();
            System.out.println(routeTrains.get(0).getRwRoute().getRoute().getRouteCode());

            trainScheduleController.generateTrainSchedule(rwRoutes, routeTimes, routeTrains);
        } else if (c == 'N') {
            trainScheduleController.getTrainScheduleView().FailedGenerateSchedule();
        } else {
            trainScheduleController.getTrainScheduleView().failedValidateYesNo();
        }
        pressEnterKey();
        run();
    }

    public void viewSchedule() {
        trainScheduleController.getTrainScheduleView().printViewTrainSchedulePage();
        System.out.println(trainScheduleController.allTrainScheduleView(trainScheduleController.getAllTrainSchedule()));
        pressEnterKey();
        run();
    }
}