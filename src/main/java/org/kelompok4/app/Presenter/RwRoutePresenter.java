package org.kelompok4.app.Presenter;

import org.kelompok4.app.Controller.RwRouteController;
import org.kelompok4.app.Interface.ICanInput;
import org.kelompok4.app.Interface.ICanRun;
import org.kelompok4.app.Model.RwRouteModel;

import java.util.ArrayList;

public class RwRoutePresenter extends ContinuePresenter implements ICanRun, ICanInput {
    RwRouteController rwRouteController;
    ArrayList<RwRouteModel> rwRouteModels = new ArrayList<RwRouteModel>();

    public RwRoutePresenter(RwRouteController rwRouteController) {
        this.rwRouteController = rwRouteController;
    }

    public RwRouteController getRwRouteController() {
        return rwRouteController;
    }

    public void setRwRouteController(RwRouteController rwRouteController) {
        this.rwRouteController = rwRouteController;
    }

    @Override
    public void run() {
        rwRouteController.rwRouteMenuView();
        int menu =sc.nextInt();
        sc.nextLine();
        menu(menu);
    }
    public void menu(int choice){
        switch (choice){
            case 1:
                addRwRoute();
                break;
            case 2:
                showRwRoute();
                break;
            case 3:
                delRwRoute();
                break;
        }
    }

    public void showRwRoute() {
        rwRouteController.showRwRoute();
        showTable();
        pressEnterKey();
        run();
    }
    public void showTable(){
        rwRouteController.rwRouteTable(rwRouteController.allRwRouteView((rwRouteModels)));
    }

    public void delRwRoute(){
        String input;
        boolean valid_code;
        do{
            rwRouteController.deleteRwRoute();
            input = sc.nextLine();
            valid_code = rwRouteController.validateInputCodeRoute(input);
            if(!input.equals("99")&&!valid_code) {
                System.out.println("Format Masukan Anda Salah!");
            }
        }while(!valid_code&&!input.equals("99"));
        if(input.equals("99")){
            run();
        }else if(valid_code){
            if(!rwRouteController.validateCodeRoute()){
                rwRouteController.delete();
                rwRouteController.resultDeleteRwRoute(valid_code);
                pressEnterKey();
                run();
            }else{
                rwRouteController.resultView();
                System.out.println("KERETA gagal ditambahkan, Kode KAI sudah Terdaftar");
            }
        }
    }

    public void addRwRoute(){
        String input;
        boolean valid_code;
        ArrayList<String> tracks = new ArrayList<String>();
        do{
            rwRouteController.addRwRoute();
            input = sc.nextLine();
            valid_code = rwRouteController.validateInputCodeRoute(input);
            if(!input.equals("99")&&!valid_code) {
                System.out.println("Format Masukan Anda Salah!");
            }
        }while(!valid_code&&!input.equals("99"));
        if(input.equals("99")){
            run();
        }else if(valid_code){
            boolean valid_track=true;
            String track;
            tracks.clear();
            int i=0;
            do{
                System.out.println("Stasiun Awal Sampai Stasiun Akhir");
                rwRouteController.printTrackRwRoute(i+1);
                track=sc.nextLine();
                valid_track = rwRouteController.validateInputTrackRoute(track);
                if(!track.equals("99")&&!valid_track) {
                    System.out.println("Format Masukan Anda Salah!");
                }else{
                    if(!track.equals("99")){
                        i++;
                        tracks.add(new String(track));
                    }
                }
            }while(!track.equals("99"));
            if(valid_track){
                //kalo lolos semuanya
                if(rwRouteController.validateCodeRoute()&&rwRouteController.validateListTrack(tracks)){
                    System.out.println(rwRouteController.getRoute().toString());
                    System.out.println(rwRouteController.getList().toString());
                    System.out.println(rwRouteController.getSumOfDuration());
                    rwRouteModels.add(new RwRouteModel(rwRouteController.getRoute(),rwRouteController.getList(),rwRouteController.getSumOfDuration()));
                    rwRouteController.resultView();
                    rwRouteController.resultAddRwRoute(valid_track);
                    pressEnterKey();
                    run();
                }else{
                    rwRouteController.resultView();
                    System.out.println("Jalur gagal ditambahkan,Periksa Kembali Jalur yang anda buat!");
                    pressEnterKey();
                    addRwRoute();
                }

            }else{
                System.out.println("Jalur gagal ditambahkan,Periksa Kembali Jalur yang anda buat!");
                pressEnterKey();
                addRwRoute();
            }
        }
    }

}
