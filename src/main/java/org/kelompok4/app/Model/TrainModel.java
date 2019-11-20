package org.kelompok4.app.Model;

import java.util.ArrayList;

public class TrainModel {
    private static int MAX_COACH = 6;
    private String trainCode;
    private String trainName;
    ArrayList<BusinessCoach> businessCoach = new ArrayList<BusinessCoach>();
    ArrayList<PremiumCoach> premiumCoach = new ArrayList<PremiumCoach>();
}