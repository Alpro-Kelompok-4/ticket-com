package org.kelompok4.app;

import jdk.vm.ci.code.Register;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Main {
	public Main(){

	}
	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner scanner = new Scanner(System.in);

		//instansiasi objek objek
		Driver driver = new Driver();
		LoginModel loginModel = new LoginModel(null, null);
		LoginView loginView = new LoginView();
		LoginController loginController = new LoginController(loginModel, loginView);
		UserModel userModel = new UserModel();
		RegisterView registerView = new RegisterView();
		RegisterController registerController = new RegisterController(userModel,registerView);
//		driver.login(loginController,loginModel,loginView);
		driver.register(registerController,userModel,registerView);

	}


}


