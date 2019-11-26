package org.kelompok4.app.Presenter;

import org.kelompok4.app.Controller.TrainScheduleController;
import org.kelompok4.app.Interface.ICanRun;

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
        // TODO Auto-generated method stub
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
            // TODO: Generate schedule
            trainScheduleController.getTrainScheduleView().SuccessGenerateSchedule();
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