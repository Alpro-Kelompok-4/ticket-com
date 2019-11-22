package org.kelompok4.app;
public class AddTimeRouteView {

	public AddTimeRouteView(){

	}
	public void printAddTimeRoutePage() {
		System.out.println("#KELOLA WAKTU BERDASARKAN RUTE#");
		System.out.println("");
		System.out.println("");

	}

	public void printAddTimeRoute() {
		System.out.print("Kode Rute : ");
		System.out.flush();
	}

	public void printAddTimeRoute(String formatAddTimeRoute) {
		System.out.print("Kode Rute  : " + formatAddTimeRoute);
		System.out.flush();
	}

public void failedValidateAddTimeRoute(){
		System.out.println("Format Kode rute yang Anda masukan salah!");
		System.out.flush();
	}
}