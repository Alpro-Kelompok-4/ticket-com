package org.kelompok4.app.Model;

import java.util.Date;
public class TrainScheduleModel {
    private String scheduleCode;
    private TimeModel timeModel;
    private Date date;
    private RwRouteModel rwRouteModel;
    private TrainModel trainModel;

    public TrainScheduleModel() {
    }

    public TrainScheduleModel(String scheduleCode, TimeModel timeModel, Date date, RwRouteModel rwRouteModel, TrainModel trainModel) {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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
}
