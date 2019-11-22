package org.kelompok4.app;
public class AddTrainBasedOnRouteView {

	public AddTrainBasedOnRouteView(){

	}
	public void printAddTrainBasedOnRoutePage() {
		System.out.println("#KELOLA WAKTU BERDASARKAN RUTE#");
		System.out.println("");
		System.out.println("");

	}

	public void printAddTrainBasedOnRoute() {
		System.out.print("Kode Rute : ");
		System.out.flush();
	}

	public void printAddTrainBasedOnRoute(String formatAddTrainBasedOnRoute) {
		System.out.print("Kode Rute  : " + formatAddTrainBasedOnRoute);
		System.out.flush();
	}

public void failedValidateAddTrainBasedOnRoute(){
		System.out.println("Format Kode rute yang Anda masukan salah!");
		System.out.flush();
	}
}