package org.kelompok4.app;

//import jdk.vm.ci.code.Register;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

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
		// driver.login(loginController,loginModel,loginView);
		// driver.register(registerController,userModel,registerView);
		driver.updateinfouser(customerController, userModel, registerView);

		System.out.println("#JENDELA UTAMA#");
		System.out.println("1. Register penumpang");
		System.out.println("2. Login");
		System.out.print("Pilih menu: ");
		menu = scanner.nextInt();
		while (menu != 99) {
			switch (menu) {
			case 1: {
				// driver.register(registerController, userModel, registerView);
				break;
			}
			case 2: {
				if(driver.login(loginController, loginModel, loginView)){
					System.out.println("#MENU PENGGUNA#");
					System.out.println("Welcome");
					System.out.println();
					System.out.println("1. Booking Tiket");
					System.out.println("2. Kelola Profile");
					System.out.println("3. History Pembelian");
					System.out.println("0. Logout");
					System.out.println();
					System.out.print("Pilihan: ");
					menu = scanner.nextInt();
					while (menu != 0){
						switch (menu){
							case 1:{
								// driver.bookingTiket();
								break;
							}
							case 2:{
								// driver.kelolaProfile();
								break;
							}
							case 3:{
								// driver.historyPembelian();
								break;
							}
							case 0:{
								// driver.logout();
								break;
							}
							default:{
								System.out.println("Menu salah!");
								System.out.print("Pilihan: ");
								menu = scanner.nextInt();
							}
						}
					}
				};
				break;
			}
			default: {
				if (menu != 99) {
					System.out.println("Pilihan menu salah!");
					System.out.print("Pilih menu: ");
					menu = scanner.nextInt();
				}
			}
			}
		}

	}

}
