package org.kelompok4.app.Model;

import java.util.ArrayList;

public class TrainModel {
    private static int MAX_COACH = 6;
    private String trainCode;
    private String trainName;
    private int sizeOfBC;//jumlah bisnis coach
    private int sizeOfPC;//jumlah premium coach
    ArrayList<CoachModel> coachs = new ArrayList<CoachModel>();

    public static int getMaxCoach() {
        return MAX_COACH;
    }

    public TrainModel(String trainCode, String trainName, int sizeOfBC, int sizeOfPC, ArrayList<CoachModel> coachs) {
        this.trainCode = trainCode;
        this.trainName = trainName;
        this.sizeOfBC = sizeOfBC;
        this.sizeOfPC = sizeOfPC;
        this.coachs = coachs;
    }

    public TrainModel() {
    }

    public int getSizeOfBC() {
        return sizeOfBC;
    }

    public void setSizeOfBC(int sizeOfBC) {
        this.sizeOfBC = sizeOfBC;
    }

    public int getSizeOfPC() {
        return sizeOfPC;
    }

    public void setSizeOfPC(int sizeOfPC) {
        this.sizeOfPC = sizeOfPC;
    }

    public static void setMaxCoach(int maxCoach) {
        MAX_COACH = maxCoach;
    }

    public String getTrainCode() {
        return trainCode;
    }

    public void setTrainCode(String trainCode) {
        this.trainCode = trainCode;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public ArrayList<CoachModel> getCoachs() {
        return coachs;
    }

    public void setCoachs(ArrayList<CoachModel> coachs) {
        this.coachs = coachs;
    }
    public int getNumberOfCoach(){
        return getSizeOfBC()+getSizeOfPC();
    }
}
