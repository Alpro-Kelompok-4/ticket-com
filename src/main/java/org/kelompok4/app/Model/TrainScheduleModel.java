package org.kelompok4.app.Model;

import java.time.LocalDate;

public class TrainScheduleModel {
    private String scheduleCode;
    private TimeModel timeModel;
    // private LocalDate date; -- sementara pakai string
    private String date;
    private RwRouteModel rwRouteModel;
    private TrainModel trainModel;

    public TrainScheduleModel() {
    }

    public TrainScheduleModel(String scheduleCode, TimeModel timeModel, String date, RwRouteModel rwRouteModel,
            TrainModel trainModel) {
        this.scheduleCode = scheduleCode;
        this.timeModel = timeModel;
        this.date = date;
        this.rwRouteModel = rwRouteModel;
        this.trainModel = trainModel;
    }

    public String getScheduleCode() {
        return scheduleCode;
    }

    public void setScheduleCode(String scheduleCode) {
        this.scheduleCode = scheduleCode;
    }

    public TimeModel getTimeModel() {
        return timeModel;
    }

    public void setTimeModel(TimeModel timeModel) {
        this.timeModel = timeModel;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public RwRouteModel getRwRouteModel() {
        return rwRouteModel;
    }

    public void setRwRouteModel(RwRouteModel rwRouteModel) {
        this.rwRouteModel = rwRouteModel;
    }

    public TrainModel getTrainModel() {
        return trainModel;
    }

    public void setTrainModel(TrainModel trainModel) {
        this.trainModel = trainModel;
    }

    public String departureTimeString(){
        return timeModel.printJam();
    }

    public String arrivalTimeString(){
        String output = "";
        int totalDuration = rwRouteModel.getSumOfDuration();
        int addHH = totalDuration/60;
        int addMM = totalDuration%60;
        int addedHH = timeModel.getJam().getHH() + addHH;
        int addedMM = timeModel.getJam().getMM() + addMM;
        if (addedMM >= 60){
            addedHH++;
            addedMM -= 60;
        }
        TimeModel timeModel = new TimeModel();
        timeModel.setJam(new JamModel(addedHH, addedMM));
        return timeModel.printJam();
    }

    public String departureCityString(){
        String output = "";
        output += rwRouteModel.getRoute().getDeparture().getCityName();
        return output;
    }

    public String arrivalCityString(){
        String output = "";
        output += rwRouteModel.getRoute().getArrival().getCityName();
        return output;
    }

    public String trainCodeString(){
        return trainModel.getTrainCode();
    }

    public String remainingSeatString(){
        String output = "";
        int maxSeat = 0;
        int filledSeat = 0;
        for (CoachModel c : trainModel.getCoachs()) {
            maxSeat += c.getSeatQty();
            filledSeat += c.filledSeat();
        }
        if (maxSeat > filledSeat){
            output += "Sisa ";
            output += maxSeat - filledSeat;
            output += " kursi";
        } else if (maxSeat == filledSeat){
            output += "Full";
        } else {
            output += "Aneh";
        }
        return output;
    }
}
