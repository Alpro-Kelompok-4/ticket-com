package org.kelompok4.app;

import org.kelompok4.app.Controller.*;
import org.kelompok4.app.Model.LoginModel;
import org.kelompok4.app.Model.RwRouteModel;
import org.kelompok4.app.Model.TrainModel;
import org.kelompok4.app.Model.UserModel;
import org.kelompok4.app.Presenter.LoginPresenter;
import org.kelompok4.app.Presenter.RegisterPresenter;
import org.kelompok4.app.Presenter.RwRoutePresenter;
import org.kelompok4.app.Presenter.TrainPresenter;
import org.kelompok4.app.View.LoginView;
import org.kelompok4.app.View.RegisterView;
import org.kelompok4.app.View.RwRouteView;
import org.kelompok4.app.View.TrainView;

import java.io.IOException;
import java.util.Scanner;


public class Main {
	public Main() {

	}

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner scanner = new Scanner(System.in);
		int menu;
		// instansiasi objek objek
		Driver driver = new Driver();
		LoginModel loginModel = new LoginModel(null, null);
		LoginView loginView = new LoginView();
		LoginController loginController = new LoginController(loginModel, loginView);
		UserModel userModel = new UserModel("erwin@gmail.com", "123123as", "Erwin", "1231231231231231", "123123123123");
		RegisterView registerView = new RegisterView();
		RegisterController registerController = new RegisterController(userModel, registerView);
		CustomerController customerController = new CustomerController(userModel, registerView);
		LoginPresenter loginPresenter = new LoginPresenter(loginController);
		RegisterPresenter registerPresenter = new RegisterPresenter(registerController);
//		registerPresenter.run();
		TrainModel trainModel = new TrainModel();
		TrainView trainView = new TrainView();
		TrainController trainController = new TrainController(trainModel,trainView);
		RwRouteModel rwRouteModel = new RwRouteModel();
		RwRouteView rwRouteView = new RwRouteView();
		RwRouteController rwRouteController = new RwRouteController(rwRouteModel,rwRouteView);
//		trainController.validateInputTrain("KAI190801 'Kereta Api I Bulan 8 Tahun 2019' G6 B2 P4");
		// driver.login(loginController,loginModel,loginView);
		// driver.register(registerController,userModel,registerView);
		// driver.updateinfouser(customerController, userModel, registerView);
		TrainPresenter trainPresenter = new TrainPresenter(trainController);
		trainPresenter.run();
		RwRoutePresenter rwRoutePresenter = new RwRoutePresenter(rwRouteController);
		// rwRoutePresenter.run();
	}

}
