/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kelompok4.app.Presenter;

import org.kelompok4.app.Controller.RouteController;
import org.kelompok4.app.Interface.ICanRun;
import org.kelompok4.app.Model.RouteModel;

/**
 *
 * @author Rewingw
 */
public class RoutePresenter extends ContinuePresenter implements ICanRun{
    RouteController routeController;

    public RoutePresenter() {
    }

    public RoutePresenter(RouteController routeController) {
        this.routeController = routeController;
    }

    public RouteController getRouteController() {
        return routeController;
    }

    public void setRouteController(RouteController routeController) {
        this.routeController = routeController;
    }
    
    @Override
    public void run() {
        routeController.showRouteMenuView();
        int menu =sc.nextInt();
        sc.nextLine();
        menu(menu);
    }
    public void menu(int choice){
        switch (choice){
            case 1:
                addRoute();
                break;
            case 2:
                showRoute();
                break;
            case 3:
                updateRoute();
                break;
            case 4:
                delRoute();
                break;
        }
    }

    private void addRoute() {
        boolean valid;
        String input;
        do {
            routeController.addRouteView();
            input = sc.nextLine();
            valid = routeController.validateInputRoute(input);
            if(!input.equals("99")&&!valid){
                routeController.resultAddRoute(valid);
                pressEnterKey();
            }
        }while(!valid && !input.equals("99"));
        if(input.equals("99")){
            run();
        } else if(valid){
            //true adalah train inputan user tidak ada di json
            if(routeController.validateCodeRoute()){
                routeController.create();
//              trainModels.add(new TrainModel(trainController.getTrainCode(),trainController.getTrainName(),trainController.getSizeOfBC(),trainController.getSizeOfPC(),trainController.getCoachs()));
                routeController.resultView();
                routeController.resultAddRoute(valid);
                pressEnterKey();
                run();
            }else{
                System.out.print(getRouteController().getRouteCode());
                routeController.resultView();
                System.out.println("Rute gagal ditambahkan, Kode Rute sudah Terdaftar");
                pressEnterKey();
                run();
            }

        }
    }

    private void showRoute() {
        routeController.showRouteView();
        showTable();
        pressEnterKey();
        run();
    }
    public void showTable(){
        routeController.routeTable(routeController.allRouteView(routeController.fetchAll()));
    }

    private void updateRoute() {
        boolean valid;
        String input;
        String input_edit;
        do {
            showTable();
            
            routeController.inputCodeRouteView();
            input = sc.nextLine();
            routeController.setRouteCode(input);
            valid = routeController.validateUpdateDeleteCodeRoute();
            if(!input.equals("99")&&!valid){
                routeController.resultEditRoute(valid);
                pressEnterKey();
            }
        }while(!valid && !input.equals("99"));
        if(input.equals("99")){
            run();
        } else if(valid){
            routeController.editRouteView();
            input_edit = sc.nextLine();
            valid = routeController.validateInputRoute(input_edit);
            if(valid){
                if(routeController.validateCodeRoute()){
                    routeController.create();
                    routeController.resultView();
                    routeController.resultEditRoute(valid);
                    routeController.setRouteCode(input);
                    routeController.validateUpdateDeleteCodeRoute();
                    routeController.delete();
                    pressEnterKey();
                    run();
                }else{
                    routeController.resultView();
                    System.out.println("Rute gagal diedit, Kode Rute Tidak Terdaftar");
                    run();
                }
            }else{
                    routeController.resultView();
                    System.out.println("Rute gagal diedit, Kode Rute Tidak Terdaftar");
                    run();
                
            }
        }
    }

    private void delRoute() {
        String input;
        boolean valid_code;
        do{
            routeController.deleteRoute();
            input = sc.nextLine();
            routeController.setRouteCode(input);
//            System.out.print(input);
            valid_code = routeController.validateUpdateDeleteCodeRoute();
            if(!input.equals("99")&&!valid_code) {
                System.out.println("Format Masukan Anda Salah!");
            }
        }while(!valid_code&&!input.equals("99"));
        if(input.equals("99")){
            run();
        }else if(valid_code){
            if(routeController.validateUpdateDeleteCodeRoute()){
                routeController.delete();
                routeController.resultDeleteRoute(valid_code);
                pressEnterKey();
                run();
            }else{
                routeController.resultView();
                System.out.println("KERETA gagal Dihapus, Kode Rute Tidak sudah Terdaftar");
                pressEnterKey();
                run();
            }
        }
    }
    
}
