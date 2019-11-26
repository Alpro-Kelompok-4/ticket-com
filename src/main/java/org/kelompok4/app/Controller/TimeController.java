package org.kelompok4.app.Controller;

import com.github.freva.asciitable.AsciiTable;
import com.github.freva.asciitable.Column;
import org.kelompok4.app.Interface.ICanCreate;
import org.kelompok4.app.Model.JamModel;
import org.kelompok4.app.Model.TimeModel;
import org.kelompok4.app.View.TimeView;

import java.util.ArrayList;
import java.util.Arrays;
import org.kelompok4.app.Repo.TimeRepo;

public class TimeController implements  ICanCreate {
    TimeModel timeModel;
    TimeView timeView;
    TimeRepo timeRepo = new TimeRepo();
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
        //write ka json
        ArrayList<TimeModel> timeModels = generateTime();

        //masukan ke json
    }
    public void menuTimePageView(){
        timeView.printAddTimePage();
    }
    public void generateTimeView(){
        timeView.printGenerateTime();
    }
    public void menuTimeView(){
        timeView.printTimeMenu();
    }

    public ArrayList<TimeModel> generateTime(){
        ArrayList<TimeModel> timeModels = new ArrayList<TimeModel>();
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
        return timeModels;
    }
    public void resultGenerateTime(boolean valid){
        if(valid){
            timeView.SuccessGenerateTime();
        }else{
            timeView.FailedGenerateTime();
        }
    }
    public boolean checkJsonTime(){
        if(timeRepo.getAll().size()==0){
            return false;
        }else{
            return true;
        }
    }
    public TimeModel getTime(String code){
        return timeRepo.get(code);
    }
    public ArrayList<TimeModel> fetchAll(){
//        System.out.println(rwRouteRepo.getAll().get(0).stringRwTrack());
        return timeRepo.getAll();
    }
    public String allTimeView(ArrayList<TimeModel> timeModels){
        return AsciiTable.getTable(timeModels, Arrays.asList(
        new Column().header("Kode Waktu").with(timeModel ->timeModel.getTimeCode()),
        new Column().header("Waktu").with(timeModel -> timeModel.printJam())));
    }
     public void timeTable(String S){
        timeView.printShowTable(S);
    }
    
}
