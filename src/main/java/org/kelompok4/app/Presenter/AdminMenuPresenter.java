/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kelompok4.app.Presenter;

import org.kelompok4.app.Controller.*;
import org.kelompok4.app.Interface.ICanRun;
import org.kelompok4.app.Model.RouteTimeModel;
import org.kelompok4.app.Model.RouteTrainModel;
import org.kelompok4.app.Model.RwRouteModel;
import org.kelompok4.app.Model.TimeModel;
import org.kelompok4.app.Model.TrainScheduleModel;
import org.kelompok4.app.View.RouteTimeView;
import org.kelompok4.app.View.RouteTrainView;
import org.kelompok4.app.View.RwRouteView;
import org.kelompok4.app.View.TimeView;
import org.kelompok4.app.View.TrainScheduleView;

public class AdminMenuPresenter extends ContinuePresenter implements ICanRun {
    MenuController menuController;
    CityPresenter cityPresenter;
//    RwStasionController rwStasionController;
    TrainPresenter  trainPresenter ;
    TimePresenter  timePresenter = new TimePresenter(new TimeController(new TimeModel(),new TimeView()));
    RouteTimePresenter routeTimePresenter = new RouteTimePresenter(
				new RouteTimeController(new RouteTimeModel(), new RouteTimeView()));
		RouteTrainPresenter routeTrainPresenter = new RouteTrainPresenter(
				new RouteTrainController(new RouteTrainModel(), new RouteTrainView()));
		TrainSchedulePresenter trainSchedulePresenter = new TrainSchedulePresenter(
				new TrainScheduleController(new TrainScheduleModel(), new TrainScheduleView()));
                RwRoutePresenter rwRoutePresenter = new RwRoutePresenter(
				new RwRouteController(new RwRouteModel(), new RwRouteView()));
//    RoutePresenter  routePresenter ;
//    RwRoutePresenter  rwRoutePresenter ;
//    RouteTrainPresenter  routeTrainPresenter ;
//    RouteTimePresenter  routeTimePresenter ;
//    TrainSchedulePresenter  trainSchedulePresenter;
//    ReportPresenter  reportPresenter ;
//    UserPresenter  userPresenter ;


    public AdminMenuPresenter(){
        
    }

    public AdminMenuPresenter(MenuController menuController, CityPresenter cityPresenter, TrainPresenter trainPresenter) {
        this.menuController = menuController;
        this.cityPresenter = cityPresenter ;
//        this.rwStasionController = rwStasionController;
        this.trainPresenter  = trainPresenter ;
//        this.timeController = timeController;
//        this.routeController = routeController;
//        this.rwRouteController = rwRouteController;
//        this.routeTrainController = routeTrainController;
//        this.routeTimeController = routeTimeController;
//        this.trainScheduleController = trainScheduleController
//        this.reportController = reportController;
//        this.userController = userController;
    }

    public MenuController getMenuController() {
        return menuController;
    }
    public void setMenuController(MenuController menuController) {
        this.menuController = menuController;
    }

    public CityPresenter getCityPresenter() {
        return cityPresenter;
    }

    public void setCityPresenter(CityPresenter cityPresenter) {
        this.cityPresenter = cityPresenter;
    }

    public TrainPresenter getTrainPresenter() {
            
        return trainPresenter;
    }

    public void setTrainPresenter(TrainPresenter trainPresenter) {
        this.trainPresenter = trainPresenter;
    }

    @Override
    public void run() {
        int menu;
        do{
            menuController.showMenuAdmin();
            menu = sc.nextInt();
            sc.nextLine();
            menu(menu);
        }while(menu!=99);
        
    }

    private void menu(int choice) {
        if (menuController.ValidateInputMenuAdmin(choice)){
            switch (choice) {
                case 1:
                    System.out.println("//Nyambung ke Kelola Akun userPresenter.run()");
                    //  userPresenter.run();
                    break;
                case 2://Kelola Data Kota
                    cityPresenter.run();
                    break;
                case 3://Generate Waktu
                    System.out.println("//Nyambung ke timePresenter.run()");
                    timePresenter.run();
                    break;
                case 4://Kelola Rute
                    System.out.println("//Nyambung ke rwRoutePresenter.run()");
                    //rwRoutePresenter.run();
                    break;
                case 5://Kelola Stasiun
                    System.out.println("//Nyambung ke rwStationPresenter.run()");
                    //rwStationPresenter.run();
                    break;
                case 6://Kelola Jalur Stasiun Pada Rute
                    System.out.println("//Nyambung ke rwRoutePresenter.run()");
                    rwRoutePresenter.run();
                    break;
                case 7://Kelola Waktu Pada Rute
                    System.out.println("//Nyambung ke routeTimePresenter.run()");
                    routeTimePresenter.run();
                    break;
                case 8://Kelola Kereta Pada Rute
                    System.out.println("//Nyambung ke routeTrainPresenter.run()");
                    routeTrainPresenter.run();
                    break;
                case 9://Generate Jadwal Kereta Api
                    System.out.println("//Nyambung ke trainSchedulePresenter.run()");
                    trainSchedulePresenter.run();
                    break;
                case 10://Lihat Pemasukan
                    System.out.println("//Nyambung ke reportPresenter.run()");
                    //reportPresenter.run();
                    break;
                case 11://Lihat Jadwal Kereta Api
                    System.out.println("//Nyambung ke trainPresenter.run() menu lihat???");
                    //trainPresenter.run();
                    break;
                case 0://exit
                    System.exit(0);
                    break;
            }
        }else{
            menuController.resultValidateMenu();
        }
    }
}
