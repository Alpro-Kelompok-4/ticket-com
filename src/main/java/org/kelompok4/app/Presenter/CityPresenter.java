/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kelompok4.app.Presenter;
//@author gayuh

import org.kelompok4.app.Controller.CityController;
import org.kelompok4.app.Interface.ICanRun;
import org.kelompok4.app.Model.CityModel;

import java.util.ArrayList;

public class CityPresenter extends ContinuePresenter implements ICanRun  {

    CityController cityController;

    public CityPresenter(CityController cityController) {
        this.cityController = cityController;
    }

    public CityController getCityController() {
        return cityController;
    }

    public void setCityController(CityController cityController) {
        this.cityController = cityController;
    }

    @Override
    public void run() {
        cityController.getCityView().printCityMenu();
        int menu =sc.nextInt();
        sc.nextLine();
        menu(menu);
    }

    public void menu(int choice){
        switch (choice){
            case 1:
                addCity();
                break;
            case 2:
                showCity();
                break;
            case 3:
                updateCity();
                break;
            case 4:
                delCity();
                break;
        }
    }

    public void addCity() {
        boolean valid;
        String input;
        do {
            cityController.addCityView();
            input = sc.nextLine();
            valid = cityController.validateInputCity(input);
            if(!input.equals("99")&&!valid){
                cityController.resultAddCity(valid);
                pressEnterKey();
            }
        }while(!valid && !input.equals("99"));
        if(input.equals("99")){
            run();
        } else if(valid){
            //true adalah city inputan user tidak ada di json
            if(cityController.validateCodeCity()){
                cityController.create();
                cityController.resultView();
                cityController.resultAddCity(valid);
                pressEnterKey();
                run();
            }else{
                cityController.resultView();
                System.out.println("Kota gagal ditambahkan, Kode Kota sudah Terdaftar");
                run();
            }
        }
    }

    public void updateCity() {
        boolean valid;
        String input;
        do {
            showTable();
            cityController.editCityView();
            input = sc.nextLine();
            valid = cityController.validateInputCity(input);
            if(!input.equals("99")&&!valid){
                cityController.resultEditCity(valid);
                pressEnterKey();
            }
        }while(!valid && !input.equals("99"));
        if(input.equals("99")){
            run();
        } else if(valid){
            if(cityController.validateUpdateDeleteCodeCity()){
                cityController.update();
                cityController.resultView();
                cityController.resultEditCity(valid);
                pressEnterKey();
                run();
            }else{
                cityController.resultView();
                System.out.println("Kota gagal diedit, Kode Kota sudah terdaftar");
                run();
            }
        }
    }

    public void delCity() {
        boolean valid;
        String input;
        do {
            showTable();
            cityController.deleteCityView();
            input = sc.nextLine();
            cityController.setCityCode(input);
            valid = cityController.validateUpdateDeleteCodeCity();
            if(!input.equals("99")&&!valid){
                cityController.resultDeleteCity(valid);
                pressEnterKey();
            }
        }while(!valid && !input.equals("99"));
        if(input.equals("99")){
            run();
        } else if(valid){
            if(cityController.validateUpdateDeleteCodeCity()){
                cityController.delete();
                cityController.resultView();
                cityController.resultDeleteCity(valid);
                pressEnterKey();
                run();
            }else{
                cityController.resultView();
                System.out.println("Kota gagal dihapus");
                run();
            }
        }
    }


    public void showTable(){
        cityController.cityTable(cityController.allCityView(cityController.fetchAll()));
    }
    public void showCity() {
        cityController.showCityView();
        showTable();
        pressEnterKey();
        run();
    }


}
