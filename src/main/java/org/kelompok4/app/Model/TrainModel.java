package org.kelompok4.app.Model;

import java.util.ArrayList;

public class TrainModel {
    private String trainCode;
    private String trainName;
    private int carriage;//jumlah gerbong
    private int premium;
    private int business;
    ArrayList<CoachModel> businessCarriage = new ArrayList<CoachModel>();
    ArrayList<CoachModel> premiumCarriage = new ArrayList<CoachModel>();
}