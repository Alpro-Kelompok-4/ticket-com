/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kelompok4.app.Presenter;

import org.kelompok4.app.Controller.RwStationController;
import org.kelompok4.app.Interface.ICanRun;


public class RwStationPresenter extends ContinuePresenter implements ICanRun {
    private RwStationController rwStationController;

    public RwStationPresenter(RwStationController rwStationController) {
        this.rwStationController = rwStationController;
    }
    @Override
    public void run() {
        rwStationController.getRwStationView().MenuRwStation();
        int menu =sc.nextInt();
        sc.nextLine();
        menu(menu);
    }
     public void menu(int choice){
        switch (choice){
            case 1:
                addRwStation();
                break;
            case 2:
                showRwStation();
                break;
            case 3:
                updateRwStation();
                break;
            case 4:
                delRwStation();
                break;
        }
    }

    public void addRwStation() {
        boolean valid;
        String input;
        do {
            rwStationController.addStationView();
            input = sc.nextLine();
            valid = rwStationController.validateInputStation(input);
            if(!input.equals("99")&&!valid){
                rwStationController.resultAddRwStation(valid);
                pressEnterKey();
            }
        }while(!valid && !input.equals("99"));
        if(input.equals("99")){
            run();
        } else if(valid){
            //true adalah city inputan user tidak ada di json
            if(rwStationController.validateCodeStation()){
                rwStationController.create();
                rwStationController.resultView();
                rwStationController.resultAddRwStation(valid);
                pressEnterKey();
                run();
            }else{
                rwStationController.resultView();
                System.out.println("Stasiun gagal ditambahkan, Kode Stasiun sudah Terdaftar");
                run();
            }
        }
    }

    public void updateRwStation() {
        boolean valid;
        String input;
        do {
            showTable();
            rwStationController.editStationView();
            input = sc.nextLine();
            valid = rwStationController.validateInputStation(input);
            if(!input.equals("99")&&!valid){
                rwStationController.resultEditStation(valid);
                pressEnterKey();
            }
        }while(!valid && !input.equals("99"));
        if(input.equals("99")){
            run();
        } else if(valid){
            if(rwStationController.validateUpdateDeleteCodeStation()){
                rwStationController.update();
                rwStationController.resultView();
                rwStationController.resultEditStation(valid);
                pressEnterKey();
                run();
            }else{
                rwStationController.resultView();
                System.out.println("Stasiun gagal diedit, Kode Stasuyb sudah terdaftar");
                run();
            }
        }
    }

    public void delRwStation() {
        boolean valid;
        String input;
        do {
            showTable();
            rwStationController.deleteStationView();
            input = sc.nextLine();
            rwStationController.setRwStationCode(input);
            valid = rwStationController.validateUpdateDeleteCodeStation();
            if(!input.equals("99")&&!valid){
                rwStationController.resultDeleteStatiun(valid);
                pressEnterKey();
            }
        }while(!valid && !input.equals("99"));
        if(input.equals("99")){
            run();
        } else if(valid){
            if(rwStationController.validateUpdateDeleteCodeStation()){
                rwStationController.delete();
                rwStationController.resultView();
                rwStationController.resultDeleteStatiun(valid);
                pressEnterKey();
                run();
            }else{
                rwStationController.resultView();
                System.out.println("Stasiun gagal dihapus");
                run();
            }
        }
    }


    public void showTable(){
        rwStationController.stationTable(rwStationController.allRwStationView(rwStationController.fetchAll()));
    }
    public void showRwStation() {
        rwStationController.showStationView();
        showTable();
        pressEnterKey();
        run();
    }

    
}
