package org.kelompok4.app.Presenter;

import org.kelompok4.app.Controller.TimeController;
import org.kelompok4.app.Interface.ICanRun;

public class TimePresenter extends ContinuePresenter implements ICanRun {
    private TimeController timeController;

    public TimePresenter(TimeController timeController) {
        this.timeController = timeController;
    }

    public TimeController getTimeController() {
        return timeController;
    }

    public void setTimeController(TimeController timeController) {
        this.timeController = timeController;
    }
     
    @Override
    public void run() {
    	// boolean valid = true;
        int menu=0;
        do{
            timeController.menuTimePageView();
            if(timeController.checkJsonTime()){
                timeController.menuTimeView();
                menu = sc.nextInt();
                if(menu==1){
                    showTable();
                    pressEnterKey();
                }
            }else{
                timeController.generateTimeView();
                String x  = sc.nextLine();
                if(x.equals("Y")){
                    timeController.create();
                    timeController.resultGenerateTime(true);
                    pressEnterKey();
                }else{
                    timeController.resultGenerateTime(false);
                    pressEnterKey();
                }
            }
        }while(menu!=99);
    }
    public void showTable(){
        timeController.timeTable(timeController.allTimeView(timeController.fetchAll()));
    }
}
