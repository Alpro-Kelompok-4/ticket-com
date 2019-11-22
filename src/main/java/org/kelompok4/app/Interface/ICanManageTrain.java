package org.kelompok4.app.Interface;

import org.kelompok4.app.Model.CoachModel;

import java.util.ArrayList;

public interface ICanManageTrain {


    public String getTrainCode();

    public void setTrainCode(String trainCode);

    public String getTrainName();

    public void setTrainName(String trainName);

    public ArrayList<CoachModel> getCoachs();

    public void setCoachs(ArrayList<CoachModel> coachs);
}
