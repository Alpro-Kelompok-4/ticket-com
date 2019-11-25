package org.kelompok4.app.Presenter;

import org.kelompok4.app.Controller.TrainScheduleController;
import org.kelompok4.app.Interface.ICanRun;

public class TrainSchedulePresenter extends ContinuePresenter implements ICanRun{
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

    }

}