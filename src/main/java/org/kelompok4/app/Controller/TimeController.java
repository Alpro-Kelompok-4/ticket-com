package org.kelompok4.app.Controller;

import org.kelompok4.app.Interface.ICanCreate;
import org.kelompok4.app.Interface.ICanRead;
import org.kelompok4.app.Model.JamModel;
import org.kelompok4.app.Model.TimeModel;
import org.kelompok4.app.View.TimeView;

import java.util.ArrayList;

public class TimeController implements ICanRead, ICanCreate {
    TimeModel timeModel;
    TimeView timeView;
    ArrayList<TimeModel> timeModels = new ArrayList<TimeModel>();
    public TimeController(TimeModel timeModel, TimeView timeView) {
        this.timeModel = timeModel;
        this.timeView = timeView;
    }

    public TimeModel getTimeModel() {
        return timeModel;
    }

    public void setTimeModel(TimeModel timeModel) {
        this.timeModel = timeModel;
    }

    public TimeView getTimeView() {
        return timeView;
    }

    public void setTimeView(TimeView timeView) {
        this.timeView = timeView;
    }


    @Override
    public void create() {

    }

    @Override
    public void read() {

    }
    public void generateTimeView(){
        timeView.printAddTimePage();
        timeView.printGenerateTime();
    }
    public boolean generateTime(){
        int hour = 0;
        int minute = 0;
        String code = "TM";
        int i=1;
        do{
            System.out.print(hour + " " + minute + "\n");
            timeModels.add(new TimeModel(new String(code+i),new JamModel(hour,minute)));
            i++;
            minute=minute+15;
            if(minute==60){
                minute=0;
                hour++;
            }

        }while (hour<24);
        timeModels.forEach((n) -> System.out.println(n.getTimeCode()));
        return true;
    }
    public void resultGenerateTime(boolean valid){
        if(valid){
            timeView.SuccessGenerateTime();
        }else{
            timeView.FailedGenerateTime();
        }
    }
}
