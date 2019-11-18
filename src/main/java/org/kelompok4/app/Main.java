package org.kelompok4.app;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public Main(){

	}
	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner scanner = new Scanner(System.in);

		//instansiasi objek objek

		LoginModel model = new LoginModel(null, null);
		LoginView view = new LoginView();
		LoginController controller = new LoginController(model, view);

		//view awal
		boolean failed = true;
		controller.clearScreen();
		view.printLoginPage();
		do{
			if(failed==false){
				view.failedValidate();
			}
			view.printEmail();
			controller.setLoginEmail(scanner.nextLine());
			failed= controller.validateEmail();
			System.out.println(failed);
		}while(failed==false);
		view.printPassword();
		controller.setLoginPassword(scanner.nextLine());

		//view setelah interaksi user
		controller.updateView();

		//mencegah leaking
		scanner.close();

	}
}
