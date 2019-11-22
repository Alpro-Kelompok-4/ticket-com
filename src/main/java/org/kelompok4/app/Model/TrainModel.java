package org.kelompok4.app.Model;

import java.util.ArrayList;

public class TrainModel {
    private static int MAX_COACH = 6;
    private String trainCode;
    private String trainName;
    ArrayList<CoachModel> coachs = new ArrayList<CoachModel>();

    public static int getMaxCoach() {
        return MAX_COACH;
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
}
