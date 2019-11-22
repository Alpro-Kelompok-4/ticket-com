package org.kelompok4.app;
public class ViewTrainBasedOnRoute {

	public ViewTrainBasedOnRoute(){

	}
	public void printViewTrainRoutePage() {
		System.out.println("#LIHAT WAKTU BERDASARKAN RUTE#");
		System.out.println("");
		System.out.println("");

	}

	public void printViewTrainRoute() {
		System.out.print("Kode Rute : ");
		System.out.flush();
	}

	public void printViewTrainRoute(String formatViewTrainRoute) {
		System.out.print("Kode Rute  : " + formatViewTrainRoute);
		System.out.flush();
	}

public void failedValidateViewTrainRoute(){
		System.out.println("Format Kode rute yang Anda masukan salah!");
		System.out.flush();
	}
}