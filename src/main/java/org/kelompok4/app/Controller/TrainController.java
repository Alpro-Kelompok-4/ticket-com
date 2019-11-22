package org.kelompok4.app.Controller;

import org.kelompok4.app.Interface.*;
import org.kelompok4.app.Model.BusinessCoachModel;
import org.kelompok4.app.Model.CoachModel;
import org.kelompok4.app.Model.PremiumCoachModel;
import org.kelompok4.app.Model.TrainModel;
import org.kelompok4.app.View.TrainView;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainController implements ICanRead, ICanCreate, ICanUpdate, ICanDelete, ICanManageTrain {
    private TrainModel trainModel;
    private TrainView trainView;

    public TrainController(TrainModel trainModel, TrainView trainView) {
        this.trainModel = trainModel;
        this.trainView = trainView;
    }

    public TrainModel getTrainModel() {
        return trainModel;
    }

    public void setTrainModel(TrainModel trainModel) {
        this.trainModel = trainModel;
    }

    public TrainView getTrainView() {
        return trainView;
    }

    public void setTrainView(TrainView trainView) {
        this.trainView = trainView;
    }

    @Override
    public void create() {

    }

    @Override
    public void delete() {
    }

    @Override
    public void read() {

    }
    @Override
    public void update() {

    }

    @Override
    public String getTrainCode() {
        return trainModel.getTrainCode();
    }

    @Override
    public void setTrainCode(String trainCode) {
        trainModel.setTrainCode(trainCode);
    }

    @Override
    public String getTrainName() {
        return trainModel.getTrainName();
    }

    @Override
    public void setTrainName(String trainName) {
        trainModel.setTrainName(trainName);
    }

    @Override
    public ArrayList<CoachModel> getCoachs() {
        return trainModel.getCoachs();
    }

    @Override
    public void setCoachs(ArrayList<CoachModel> coachs) {
        trainModel.setCoachs(coachs);
    }

    @Override
    public void setSizeOfBC(int bc) {
        trainModel.setSizeOfBC(bc);
    }

    @Override
    public int getSizeOfBC() {
        return trainModel.getSizeOfPC();
    }

    @Override
    public void setTizeOfPC(int bp) {
        trainModel.setSizeOfPC(bp);
    }

    @Override
    public int getSizeOfPC() {
        return trainModel.getSizeOfPC();
    }

    public void addTrainView(){
        trainView.printAddTrainPage();
        trainView.printAddTrain();
    }
    public ArrayList<TrainModel> fetchAll(ArrayList<TrainModel> trainModels){
        return trainModels;
    }
    public void allTrainView(ArrayList<TrainModel> trainModels){
        TableStringBuilder<TrainModel> t = new TableStringBuilder<TrainModel>();
        t.addColumn("Kode KAI", TrainModel::getTrainCode);
        t.addColumn("NAMA KAI", TrainModel::getTrainName);
        t.addColumn("GERBONG", TrainModel::getSizeOfBC);
        t.addColumn("BUSINESS", TrainModel::getSizeOfBC);
        t.addColumn("PREMIUM", TrainModel::getSizeOfPC);
        String s = t.createString(trainModels);
        System.out.println(s);
    }


    public void trainView(){
        trainView.printviewTrainPage();
    }
    public void showAllTrain(){
//        ArrayList<TrainModel> trainModels;
//        trainModels.add(new TrainModel("KAI18801","KUTOJAYA SELATAN",))

    }

    public void resultView(){
        trainView.printtrainCode(getTrainCode());
        trainView.printtrainName(getTrainName());
        trainView.printtrainCoach(getCoachs().size());
        trainView.printbussinessCoach(getSizeOfBC());
        trainView.printpremiumCoach(getSizeOfPC());
    }
//    public boolean validateInputTrain(){
//        return validateCodeTrain() && validateSizeofCoach();
//    }
//
//    public boolean validateSizeofCoach(){
//            return getCoachs().size()==6;
//    }
    public boolean validateCodeTrain(String trainCode){
        //mengecek kode train dari json
        return true;
    }
    public void resultAddTrain(boolean success){
        if(success){
            trainView.successAddTrain();
        }else {
            trainView.failedAddTrain();
        }
    }
    public boolean validateInputTrain(String input){
        boolean valid;
//        System.out.println(input);
        Pattern p = Pattern.compile("'([^']*)'");
        Matcher m = p.matcher(input);
        //cek apakah ada nama Train dengan format didalam tanda petik
        if(m.find()){
            String name = m.group(1);
//            System.out.println(name);
            String temp_name= "'" + name + "'";
            //hilangkan nama pada inputan string
            input = input.replaceAll(temp_name,"");
//            System.out.println(input);
            //Split inputan sisa menjadi 4 string yang disimpan pada array of string strings
            String[] inputs=input.split("\\s+");
//            System.out.println(inputs.length);
            //validasi jumlah string ada 4
            if(inputs.length==4){
                //pada G B P ambil char setelahnya untuk di cek valuenya harus pada rang 0-6
                if(inputs[1].charAt(1) >= '0' && inputs[1].charAt(1) <= '6' && inputs[3].charAt(1) >= '0' && inputs[3].charAt(1) <= '6' && inputs[2].charAt(1) >= '0' && inputs[2].charAt(1) <= '6'){
                    //validasi jumlah val G = B + P
                    if(Character.getNumericValue(inputs[3].charAt(1)) + Character.getNumericValue(inputs[2].charAt(1))==Character.getNumericValue(inputs[1].charAt(1))){
                        if(validateCodeTrain(inputs[0])){
                            trainModel.setTrainName(name);
                            trainModel.setTrainCode(inputs[0]);
                            ArrayList<CoachModel> coachModels = new ArrayList<CoachModel>();
                            for(int i = 0 ; i < Character.getNumericValue(inputs[2].charAt(1));i++){
                                coachModels.add(new BusinessCoachModel());
                            }
                            for(int i = 0 ; i < Character.getNumericValue(inputs[3].charAt(1));i++){
                                coachModels.add(new PremiumCoachModel());
                            }
                            trainModel.setCoachs(coachModels);
                            valid = true;

                        }else{
                            valid = false;
                        }
                    }else{
                        valid = false;
                    }
                }else {
                    valid = false;
                }
            }else {
                valid = false;
            }
        }else{
            valid = false;
        }
        return valid;
    }

}
