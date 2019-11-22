package org.kelompok4.app;
public class AddSectionRouteView {

	public AddSectionRouteView(){

	}
	public void printAddSectionRoutePage() {
		System.out.println("#KELOLA STASIUN BERDASARKAN RUTE#");
		System.out.println("");
		System.out.println("");

	}

	public void printAddSectionRoute() {
		System.out.print("Kode Rute : ");
		System.out.flush();
	}

	public void printAddSectionRoute(String kodeRute) {
		System.out.print("Kode Rute  : " + kodeRute);
		System.out.flush();
	}

public void failedValidateAddSectionRoute(){
		System.out.println("Kode Rute stasiun yang Anda masukan salah!");
		System.out.flush();
	}
}