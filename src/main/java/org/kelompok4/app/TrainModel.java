package org.kelompok4.app;

import java.util.ArrayList;

public class TrainModel {
    private String trainCode;
    private String trainName;
    private int carriage;//jumlah gerbong
    private int premium;
    private int business;
    ArrayList<CarriageModel> businessCarriage = new ArrayList<CarriageModel>();
    ArrayList<CarriageModel> premiumCarriage = new ArrayList<CarriageModel>();
}