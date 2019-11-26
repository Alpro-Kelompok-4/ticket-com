package org.kelompok4.app;

import com.github.freva.asciitable.AsciiTable;
import org.kelompok4.app.Controller.*;
import org.kelompok4.app.Model.*;
import org.kelompok4.app.Presenter.LoginPresenter;
import org.kelompok4.app.Presenter.RegisterPresenter;
import org.kelompok4.app.Presenter.RwRoutePresenter;
import org.kelompok4.app.Presenter.TrainPresenter;
import org.kelompok4.app.View.*;
import org.kelompok4.app.Repo.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.kelompok4.app.Presenter.AdminMenuPresenter;
import org.kelompok4.app.Presenter.CityPresenter;
import org.kelompok4.app.Presenter.CustomerMenuPresenter;
import org.kelompok4.app.Presenter.MenuPresenter;
import org.kelompok4.app.Presenter.TimePresenter;


public class Main {
	public Main() {

	}
	public static void main(String[] args) throws IOException, InterruptedException {
		
////		UserRepo us = new UserRepo();
////                System.out.print(us.getAll().toString());
//                Scanner scanner = new Scanner(System.in);
//		int menu;
//		// instansiasi objek objek
//		Driver driver = new Driver();
		LoginModel loginModel = new LoginModel(null, null);
		LoginView loginView = new LoginView();
                
		LoginController loginController = new LoginController(loginModel, loginView);
		UserModel userModel = new UserModel();
		RegisterView registerView = new RegisterView();
		RegisterController registerController = new RegisterController(userModel, registerView);
//		CustomerController customerController = new CustomerController(userModel, registerView);
		LoginPresenter loginPresenter = new LoginPresenter(loginController);
		RegisterPresenter registerPresenter = new RegisterPresenter(registerController);
//		registerPresenter.run();
		TrainModel trainModel = new TrainModel();
		TrainView trainView = new TrainView();
		TrainController trainController = new TrainController(trainModel,trainView);
RwRouteModel rwRouteModel = new RwRouteModel();
RwRouteView rwRouteView = new RwRouteView();
RwRouteController rwRouteController = new RwRouteController(rwRouteModel,rwRouteView);
////		trainController.validateInputTrain("KAI190801 'Kereta Api I Bulan 8 Tahun 2019' G6 B2 P4");
//		// driver.login(loginController,loginModel,loginView);
//		// driver.register(registerController,userModel,registerView);
//		// driver.updateinfouser(customerController, userModel, registerView);
		TrainPresenter trainPresenter = new TrainPresenter(trainController);
////                trainPresenter.run();
                    RwRoutePresenter rwRoutePresenter = new RwRoutePresenter(rwRouteController);
//                //  System.out.print(asd);
////                rwRoutePresenter.run();
//		TimeModel timeModel = new TimeModel();
//		TimeView timeView = new TimeView();
//		TimeController timeController = new TimeController(timeModel,timeView);
//                TimePresenter timePresenter = new TimePresenter(timeController);
//                timePresenter.run();
//		timeController.generateTime();
                CityView cityView = new CityView();
                CityModel cityModel = new CityModel();
                CityController cityController = new CityController(cityModel,cityView);
                CityPresenter cityPresenter = new CityPresenter(cityController);
                CustomerMenuPresenter customerMenuPresenter = new CustomerMenuPresenter();
                MenuView menuView = new MenuView();
		MenuController menuController = new MenuController(menuView);
                AdminMenuPresenter adminMenuPresenter = new AdminMenuPresenter(menuController, cityPresenter, trainPresenter);
                rwRoutePresenter.run();
		MenuPresenter menuPresenter = new MenuPresenter(menuController,loginPresenter,registerPresenter,customerMenuPresenter,adminMenuPresenter);
//		menuPresenter.run();
	}

}
