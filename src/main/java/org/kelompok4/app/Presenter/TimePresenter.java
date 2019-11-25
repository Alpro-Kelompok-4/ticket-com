package org.kelompok4.app.Presenter;

import org.kelompok4.app.Controller.TimeController;
import org.kelompok4.app.Interface.ICanRun;

public class TimePresenter extends ContinuePresenter implements ICanRun{
    TimeController timeController;

    public TimePresenter(TimeController timeController) {
        this.timeController = timeController;
    }

    public TimeController getTimeController() {
        return this.timeController;
    }

    public void setTimeController(TimeController timeController) {
        this.timeController = timeController;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

    }
    


}