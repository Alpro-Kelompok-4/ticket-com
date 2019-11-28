/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kelompok4.app.Controller;

import com.github.freva.asciitable.AsciiTable;
import com.github.freva.asciitable.Column;
import java.util.ArrayList;
import java.util.Arrays;
import org.kelompok4.app.Interface.ICanCreate;
import org.kelompok4.app.Interface.ICanDelete;
import org.kelompok4.app.Interface.ICanRead;
import org.kelompok4.app.Interface.ICanUpdate;
import org.kelompok4.app.Interface.ICanValidateName;
import org.kelompok4.app.Interface.ICanManageRwStation;
import org.kelompok4.app.Model.RwStationModel;
import org.kelompok4.app.Repo.RwStationRepo;
import org.kelompok4.app.View.RwStationView;

/**
 *
 * 
 */
public class RwStationController implements ICanCreate,ICanRead,ICanUpdate,ICanValidateName,ICanDelete, ICanManageRwStation{
   private RwStationModel rwStationModel;
   private RwStationView rwStationView;
   private RwStationRepo rwStationRepo = new RwStationRepo();
    public RwStationController(RwStationModel rwStationModel, RwStationView rwStationView) {
        this.rwStationModel = rwStationModel;
        this.rwStationView = rwStationView;
    }

    public RwStationModel getRwStationModel() {
        return rwStationModel;
    }

    public void setRwStationModel(RwStationModel rwStationModel) {
        this.rwStationModel = rwStationModel;
    }

    public RwStationView getRwStationView() {
        return rwStationView;
    }

    public void setRwStationView(RwStationView rwStationView) {
        this.rwStationView = rwStationView;
    }

    @Override
    public void create() {
        rwStationRepo.create(rwStationModel);
    }

    @Override
    public void read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        rwStationRepo.update(rwStationModel);
    }

    @Override
    public boolean validateName() {
        return ICanValidateName.NAME_REGEX.matcher(getRwStationName()).find();
    }

    @Override
    public String getRwStationCode() {
        return rwStationModel.getRwStationCode();
    }

    @Override
    public void setRwStationCode(String rwStationCode) {
        rwStationModel.setRwStationCode(rwStationCode);
    }

    @Override
    public String getRwStationName() {
        return rwStationModel.getRwStationName();
    }

    @Override
    public void setRwStationName(String rwStationName) {
        rwStationModel.setRwStationCode(rwStationName);
    }
    public void addStationView(){
        rwStationView.printAddStationPage();
        rwStationView.printAddStation();
    }

    public void editStationView(){
        rwStationView.printEditStationPage();
        rwStationView.printEditStation();
    }

    public void showStationView(){
        rwStationView.printViewStationPage();
    }

    public void deleteStationView(){
        rwStationView.printDeleteStationPage();
        rwStationView.printDeleteStation();
    }
    public boolean validateCodeStation(){
        RwStationModel rwStationModel = rwStationRepo.get(this.getRwStationCode());
        if(rwStationModel.getRwStationCode()== null){
            return true;
        }else{
            return false;
        }
    }
    public boolean validateUpdateDeleteCodeStation(){
        RwStationModel rwStationModel = rwStationRepo.get(this.getRwStationCode());
        if(rwStationModel.getRwStationCode()!= null){
            return true;
        }else{
            return false;
        }
    }
    public ArrayList<RwStationModel> fetchAll(){
        return rwStationRepo.getAll();
    }
    public String allRwStationView(ArrayList<RwStationModel> rwStationModels){
        return AsciiTable.getTable(rwStationModels, Arrays.asList(
        new Column().header("KODE STASIUN").with(rwStationModel ->rwStationModel.getRwStationCode()),
        new Column().header("NAMA STASIUN").with(rwStationModel ->rwStationModel.getRwStationName())));
    }
    public void resultView(){
        rwStationView.printRwStationCode(getRwStationCode());
        rwStationView.printRwStationName(getRwStationName());
    }
    public void resultAddRwStation(boolean success){
        if(success){
            rwStationView.SuccessAddStation();
        }else {
            rwStationView.FailedAddStation();
        }
    }
    public void resultEditStation(boolean success){
        if(success){
            rwStationView.SuccessEditStation();
        }else {
            rwStationView.FailedEditStation();
        }
    }

    public void resultDeleteCity(boolean success){
        if(success){
            rwStationView.SuccessDeleteStation();
        }else {
            rwStationView.FailedDeleteStation();
        }
    }

    public void stationTable(String S){
        rwStationView.printShowTable(S);;
    }

    public boolean validateInputStation(String input) {
        boolean valid;
        String[] inputs=input.split("\\s+");
        if(inputs.length==2){
            if(inputs[0].length()==3){
                rwStationModel.setRwStationCode(inputs[0]);
                valid=true;
            }else {
                valid=false;
            }
            rwStationModel.setRwStationName(inputs[1]);
            if (validateName()){
                valid=true;
            }else {
                valid=false;
            }
        }else {
            valid=false;
        }
        return valid;
    }

    @Override
    public void delete() {
        setRwStationModel(rwStationRepo.get(getRwStationCode()));
        rwStationRepo.delete(rwStationModel);
    }
}
