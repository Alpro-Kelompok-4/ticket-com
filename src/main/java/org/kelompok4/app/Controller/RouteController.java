package org.kelompok4.app.Controller;

import com.github.freva.asciitable.AsciiTable;
import com.github.freva.asciitable.Column;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.commons.lang3.math.NumberUtils;
import org.kelompok4.app.Interface.*;
import org.kelompok4.app.Model.CityModel;
import org.kelompok4.app.Model.PriceModel;
import org.kelompok4.app.Model.RouteModel;
import org.kelompok4.app.Repo.CityRepo;
import org.kelompok4.app.Repo.RouteRepo;
import org.kelompok4.app.View.RouteView;

public class RouteController implements ICanManageRoute, ICanCreate, ICanUpdate, ICanDelete, ICanRead {
    RouteModel routeModel;
    RouteView routeView;
    RouteRepo routeRepo =  new RouteRepo();
    CityRepo cityRepo =  new CityRepo();

    public RouteController(RouteModel routeModel, RouteView routeView) {
        this.routeModel = routeModel;
        this.routeView = routeView;
    }

    public RouteController() {
    }

    public RouteModel getRouteModel() {
        return routeModel;
    }

    public void setRouteModel(RouteModel routeModel) {
        this.routeModel = routeModel;
    }

    public RouteView getRouteView() {
        return routeView;
    }

    public void setRouteView(RouteView routeView) {
        this.routeView = routeView;
    }

    public RouteRepo getRouteRepo() {
        return routeRepo;
    }

    public void setRouteRepo(RouteRepo routeRepo) {
        this.routeRepo = routeRepo;
    }

    @Override
    public void create() {
        routeRepo.create(routeModel);
    }

    @Override
    public void delete() {
        setRouteModel(routeRepo.get(getRouteCode()));
        routeRepo.delete(routeModel);
    }

    @Override
    public CityModel getDeparture() {
        return routeModel.getDeparture();
    }

    @Override
    public void setDeparture(CityModel departure) {
routeModel.setDeparture(departure);
    }

    @Override
    public CityModel getArrival() {
        return routeModel.getArrival();
    }

    @Override
    public void setArrival(CityModel arrival) {
        routeModel.setArrival(arrival);
    }

    @Override
    public String getRouteCode() {
        return routeModel.getRouteCode();
    }

    @Override
    public void setRouteCode(String routeCode) {
routeModel.setRouteCode(routeCode);
    }

    @Override
    public PriceModel getBusiness() {
        
        return routeModel.getBusiness();
    }

    @Override
    public void setBusiness(PriceModel business) {
routeModel.setBusiness(business);
    }

    @Override
    public PriceModel getPremium() {
        
        return routeModel.getPremium();
    }

    @Override
    public void setPremium(PriceModel premium) {
        routeModel.setPremium(premium);
    }

    @Override
    public void read() {

    }

    @Override
    public void update() {
        routeRepo.update(routeModel);
    }
    public void showRouteMenuView(){
        routeView.MenuRute();
    }
    public void addRouteView(){
        routeView.printAddRutePage();
        routeView.printAddRute();
    }

    public void editRouteView(){
        routeView.printEditRutePage();
        routeView.printEditRute();
    }

    public void viewRoute(){
        routeView.printViewRutePage();
    }

    public void deleteRoute(){
        routeView.printDeleteRutePage();
        routeView.printDeleteRute();
    }

    public boolean validateCodeRoute(){
//        System.out.print(this.getRouteCode());
        RouteModel routeModel = routeRepo.get(this.getRouteCode());
        if(routeModel.getRouteCode()== null){
            return true;
        }else{
            return false;
        }
    }
    public boolean validateUpdateDeleteCodeRoute(){
        RouteModel routeModel = routeRepo.get(this.getRouteCode());
        if(routeModel.getRouteCode()== null){
            return false;
        }else{
            return true;
        }
        //mengecek kode city dari json
    }
    public ArrayList<RouteModel> fetchAll(){
        return routeRepo.getAll();
    }
    
    public String allRouteView(ArrayList<RouteModel> routeModels){
        return AsciiTable.getTable(routeModels, Arrays.asList(
        new Column().header("KEBERANGKATAN").with(routeModel -> routeModel.getDeparture().getCityName()),
        new Column().header("TUJUAN").with(routeModel ->routeModel.getArrival().getCityName()),
        new Column().header("KODE RUTE").with(routeModel ->routeModel.getRouteCode()),
        new Column().header("BUSINESS").with(routeModel ->Double.toString(routeModel.getBusiness().getPrice())),
        new Column().header("PREMIUM").with(routeModel ->Double.toString(routeModel.getPremium().getPrice())))
        );

    }

    public void resultView(){}

    public void resultAddRoute(boolean success){
        if(success){
            routeView.SuccessAddRute();
        }else {
            routeView.FailedAddRute();
        }
    }

    public void resultEditRoute(boolean success){
        if(success){
            routeView.SuccessEditRute();
        }else {
            routeView.FailedEditRute();
        }
    }

    public void resultDeleteRoute(boolean success){
        if(success){
            routeView.SuccessDeleteRute();
        }else {
            routeView.FailedDeleteRute();
        }
    }

    public boolean validateInputRoute(String input){
        boolean valid;
//      System.out.println(input);
        //cek apakah ada nama Train dengan format didalam tanda petik
 
            //Split inputan sisa menjadi 4 string yang disimpan pada array of string strings
            String[] inputs=input.split("\\s+");
//            System.out.println(inputs.length);
            //validasi jumlah string ada 4
            if(inputs.length==4){
                //pada G B P ambil char setelahnya untuk di cek valuenya harus pada rang 0-6
//                System.out.println(NumberUtils.isNumber(inputs[3]));
//                System.out.println(NumberUtils.isNumber(inputs[2]));
//                System.out.println(validateCity(inputs[0]));
//                System.out.println(validateCity(inputs[1]));
                if(NumberUtils.isNumber(inputs[3])&&NumberUtils.isNumber(inputs[2])&&validateCity(inputs[0])&&validateCity(inputs[1])){
                    //validasi jumlah val G = B + PsetTrainName(name);
                        setArrival(cityRepo.getByName(inputs[1]));
                        setDeparture(cityRepo.getByName(inputs[0]));
                        
//                        System.out.println(getArrival().getCityCode());
                        setRouteCode(generateRouteCode());
                        setPremium(new PriceModel(new Double(inputs[3])));
                        setBusiness(new PriceModel(new Double(inputs[2])));
                        valid = true;
                    }else{
                        valid = false;
                    }
                }else {
                    valid = false;
                }
        return valid;
    }
    boolean validateCity(String input) {
       CityModel cityModel = cityRepo.getByName(input);
        if(cityModel.getCityName()== null){
            return false;
        }else{
            return true;
        }
    }

    private String generateRouteCode() {
        return getDeparture().getCityCode()+'-'+getArrival().getCityCode();
    }
    
    public void showRouteView(){
        routeView.printViewRutePage();
    }

    public void routeTable(String S){
        routeView.printShowTable(S);;
    }

    public void deleteRouteView() {
        routeView.printDeleteRute();
    }
    public void inputCodeRouteView(){
        routeView.printInputCodeRute();
    }
}

