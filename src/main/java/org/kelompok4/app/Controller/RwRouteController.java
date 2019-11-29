package org.kelompok4.app.Controller;

import com.github.freva.asciitable.AsciiTable;
import com.github.freva.asciitable.Column;
import org.kelompok4.app.Interface.ICanCreate;
import org.kelompok4.app.Interface.ICanDelete;
import org.kelompok4.app.Interface.ICanManageRwRoute;
import org.kelompok4.app.Interface.ICanRead;
import org.kelompok4.app.Model.*;
import org.kelompok4.app.View.RwRouteView;
import org.kelompok4.app.Repo.RwRouteRepo;
import org.kelompok4.app.Repo.RwStationRepo;

import java.util.ArrayList;
import java.util.Arrays;
import static org.apache.commons.lang3.StringUtils.isNumeric;
import org.kelompok4.app.Repo.RouteRepo;

public class RwRouteController implements ICanRead, ICanCreate,ICanDelete, ICanManageRwRoute {
    RwRouteModel rwRouteModel;
    RwRouteView rwRouteView;
    RwRouteRepo rwRouteRepo = new RwRouteRepo();
    RwStationRepo rwStationRepo = new RwStationRepo();
    RouteRepo routeRepo = new RouteRepo();

    public RwRouteController() {
    }

    public RwRouteController(RwRouteModel rwRouteModel, RwRouteView rwRouteView) {
        this.rwRouteModel = rwRouteModel;
        this.rwRouteView = rwRouteView;
    }

    public RwRouteModel getRwRouteModel() {
        return rwRouteModel;
    }

    public void setRwRouteModel(RwRouteModel rwRouteModel) {
        this.rwRouteModel = rwRouteModel;
    }

    public RwRouteView getRwRouteView() {
        return rwRouteView;
    }

    public void setRwRouteView(RwRouteView rwRouteView) {
        this.rwRouteView = rwRouteView;
    }

    @Override
    public void create() {
        rwRouteRepo.create(rwRouteModel);
    }

    @Override
    public void delete() {
        setRwRouteModel(rwRouteRepo.get(getRwRouteCode()));
        rwRouteRepo.delete(rwRouteModel);
    }

    @Override
    public void read() {

    }

    @Override
    public RouteModel getRoute() {
        return rwRouteModel.getRoute();
    }

    public ArrayList<RwRouteModel> fetchAll(){
//        System.out.println(rwRouteRepo.getAll().get(0).stringRwTrack());
        return rwRouteRepo.getAll();
    }

    @Override
    public void setRoute(RouteModel route) {
        rwRouteModel.setRoute(route);
    }

    @Override
    public ArrayList<RwTrackModel> getList() {
        return rwRouteModel.getList();
    }

    @Override
    public void setList(ArrayList<RwTrackModel> list) {
        rwRouteModel.setList(list);
    }

    @Override
    public void setSumOfDuration(int duration) {
        rwRouteModel.setSumOfDuration(duration);
    }

    @Override
    public int getSumOfDuration() {
        return rwRouteModel.getSumOfDuration();
    }

    @Override
    public String getRwRouteCode() {
        return rwRouteModel.getRwRouteCode();
    }

    @Override
    public void setRwRouteCode(String rwRouteCode) {
        rwRouteModel.setRwRouteCode(rwRouteCode);
    }

    public String getRouteCode() {
        return rwRouteModel.routeCodeFromRoute();

    }

    public void addRwRoute(){
        rwRouteView.printAddRwRouteViewPage();
        rwRouteView.printCodeRwRouteView();

    }
    public boolean validateStasion(String station){
        if(rwStationRepo.getByName(station).getRwStationName()==null){
            return false;
        }else{
            return true;
        }
    }
    public boolean validateInputTrackRoute(String input_track){
            boolean valid;
            String[] inputs=input_track.split("\\s+");
    //      System.out.println(inputs.length);
            //validasi jumlah string ada 4
            if(inputs.length==3){
                //belum validasi nama stasiun harus nyambung
                if(validateStasion(inputs[0])&&validateStasion(inputs[0])){
                    valid=true;
                }else{
                    valid=false;
                }
            }else{
                valid=false;
            }
            return true;
        }
    public void printTrackRwRoute(int i){
        rwRouteView.printTrackInputView(i);
    }
    public void showRwRoute(){
        rwRouteView.printViewRwRoutePage();
        rwRouteView.printCodeRwRouteView();
    }
    public void deleteRwRoute(){
        rwRouteView.printDeleteRwRouteViewPage();
        rwRouteView.printDeleteRwRouteView();
    }
    public String allRwRouteView(ArrayList<RwRouteModel> rwRouteModels){
        return AsciiTable.getTable(rwRouteModels, Arrays.asList(
        new Column().header("Kode Jalur").with(rwRouteModel ->rwRouteModel.getRwRouteCode()),
        new Column().header("Kode Rute").with(rwRouteModel -> rwRouteModel.routeCodeFromRoute()),
        new Column().header("Jalur Yang Dilewati").with(rwRouteModel ->rwRouteModel.stringRwTrack() ),
        new Column().header("Waktu").with(rwRouteModel -> Integer.toString(rwRouteModel.getSumOfDuration()))));

    }
    public void resultAddRwRoute(boolean success){
        if(success){
            rwRouteView.SuccessAddRwRoute();
        }else {
            rwRouteView.FailedAddRwRoute();
        }
    }
    public void resultDeleteRwRoute(boolean success){
        if(success){
            rwRouteView.SuccessDeleteRwRoute();
        }else {
            rwRouteView.FailedDeleteRwRoute();
        }
    }
    public boolean validateInputCodeRoute(String input)
    {
        boolean valid;
//        rwRouteModel.getRoute().setRouteCode(
        if(validateCodeRoute(input)){
            setRoute(routeRepo.get(input));
            valid=true;
        }else{
            valid=false;
        }
        return valid;
    }
    public boolean validateCodeRoute(String input){
        if(routeRepo.get(input).getRouteCode()==null){
            return false;
        }else{
            return true;
        }
    }
    
    public boolean validateRwRouteCode(){
        //mengecek kode jalur dari json
        if(rwRouteRepo.get(getRwRouteCode()).getRwRouteCode()==null){
            return true;
        }else{
            return false;
        }
    }
    public boolean validateDeleteRwRouteCode(){
        //mengecek kode jalur dari json
        if(rwRouteRepo.get(getRwRouteCode()).getRwRouteCode()==null){
            return false;
        }else{
            return true;
        }
    }
    public boolean validateListTrack(ArrayList<String> tracks){
        //ubah jadi array list times
        //simpan ke model
        boolean valid=true;
        String temp;
        int i = 0;
        int t_duration=0;
        ArrayList<RwTrackModel> rwTrackModels =  new ArrayList<RwTrackModel>();
        while(i < tracks.size() && valid) {
            String[] track=tracks.get(i).split("\\s+");
            if( track.length==3){
                if(validateStasion(track[0]) && validateStasion(track[1]) && isNumeric(track[2])){
                    
                //String Origin
                //nanti diganti ngeget dari JSON
                    RwStationModel origin = rwStationRepo.getByName(track[0]);
                    //String Destination
                    //nanti diganti ngeget dari JSON
                    RwStationModel destination = rwStationRepo.getByName(track[1]);
                    rwTrackModels.add(new RwTrackModel(origin,destination,Integer.parseInt(track[2])));
                    t_duration = t_duration + Integer.parseInt(track[2]);
                    i++;
                    temp = track[1];
                    //pengecekan destination dengan origin
                    if(i>0){
        //                System.out.print(track[0] + " " + temp);
                        if(!temp.equals(track[1])){
                            valid = false;
                        }
                    }
                }else{
                    valid=false;
                }
            }else{
                valid = false;
            }
        }

        if (valid) {
            setList(rwTrackModels);
            setSumOfDuration(t_duration);
            setRwRouteCode(generateRwRouteCode());
        }
        return valid;
    }
    public String generateRwRouteCode(){
        String code = "JL";
        int jumlah = fetchAll().size()+1;
        if(jumlah<10){
            code += new String ("0"+jumlah);
        }else{
            code += jumlah;
        }
        return code;
    }
    public boolean validateTimeRw(){
        return true;
    }
    public void rwRouteMenuView(){
        rwRouteView.menuRwRouteView();
    }
    public void resultView(){}
    public void rwRouteTable(String S){
        rwRouteView.printShowTable(S);
    }
 
}
