package org.kelompok4.app.Controller;

import org.kelompok4.app.Interface.*;
import org.kelompok4.app.Model.CityModel;
import org.kelompok4.app.View.CityView;

import java.util.ArrayList;

public class CityController implements ICanCreate, ICanRead, ICanUpdate, ICanDelete, ICanManageCity, ICanValidateName{
    private CityModel cityModel;
    private CityView cityView;

    public CityController(CityModel cityModel, CityView cityView) {
        this.cityModel = cityModel;
        this.cityView = cityView;
    }

    public CityModel getCityModel() {
        return cityModel;
    }

    public void setCityModel(CityModel cityModel) {
        this.cityModel = cityModel;
    }

    public CityView getCityView() {
        return cityView;
    }

    public void setCityView(CityView cityView) {
        this.cityView = cityView;
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
    public String getCityCode() {
        return cityModel.getCityCode();
    }

    @Override
    public void setCityCode(String cityCode) {
        cityModel.setCityCode(cityCode);
    }

    @Override
    public String getCityName() {
        return cityModel.getCityName();
    }

    @Override
    public void setCityName(String cityName) {
        cityModel.setCityName(cityName);
    }

    public void addCityView(){
        cityView.printAddCityPage();
        cityView.printAddCity();
    }

    public void editCityView(){
        cityView.printEditCityPage();
        cityView.printEditCity();
    }

    public void viewCity(){
        cityView.printViewCityPage();
        cityView.printViewCity();
    }

    public void deleteCity(){
        cityView.printDeleteCityPage();
        cityView.printDeleteCity();
    }

    public boolean validateCodeCity(){
        //mengecek kode city dari json
        return true;
    }
    public String allCityView(ArrayList<CityModel> CityModels){
        TableStringBuilder<CityModel> t = new TableStringBuilder<CityModel>();
        t.addColumn("KODE KOTA", CityModel::getCityCode);
        t.addColumn("NAMA KOTA",CityModel::getCityName);
        return t.createString(CityModels);
    }

    public void resultView(){
        cityView.printCityCode(getCityCode());
        cityView.printCityName(getCityName());
    }

    public void resultAddCity(boolean success){
        if(success){
            cityView.SuccessAddCity();
        }else {
            cityView.FailedAddCity();
        }
    }

    public void resultEditCity(boolean success){
        if(success){
            cityView.SuccessEditCity();
        }else {
            cityView.FailedEditCity();
        }
    }

    public void resultDeleteCity(boolean success){
        if(success){
            cityView.SuccessDeleteCity();
        }else {
            cityView.FailedDeleteCity();
        }
    }

    public boolean validateInputCity(String input){
        boolean valid;

        String[] inputs=input.split("\\s+");
        if(inputs.length==2){
            if(inputs[0].length()==3){
                cityModel.setCityCode(inputs[0]);
                valid=true;
            }else {
                valid=false;
            }

            cityModel.setCityName(inputs[1]);
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
    public boolean validateName() {
       return ICanValidateName.NAME_REGEX.matcher(getCityName()).find();
    }

    public void showCityView(){
        cityView.printViewCityPage();
    }

    public void cityTable(String S){
        cityView.printShowTable(S);;
    }

    public void deleteCityView() {
        cityView.printDeleteCity();
    }
}
