package org.kelompok4.app;

import org.kelompok4.app.Controller.CustomerController;
import org.kelompok4.app.Controller.LoginController;
import org.kelompok4.app.Controller.RegisterController;
import org.kelompok4.app.Model.LoginModel;
import org.kelompok4.app.Model.UserModel;
import org.kelompok4.app.Presenter.LoginPresenter;
import org.kelompok4.app.Presenter.RegisterPresenter;
import org.kelompok4.app.View.LoginView;
import org.kelompok4.app.View.RegisterView;

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
		registerPresenter.run();
		// driver.login(loginController,loginModel,loginView);
		// driver.register(registerController,userModel,registerView);
		// driver.updateinfouser(customerController, userModel, registerView);

	}

}
