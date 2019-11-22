package org.kelompok4.app;
public class AddStationView {

	public AddStationView(){

	}
	public void printAddStationPage() {
		System.out.println("#TAMBAH DATA STASIUN#");
		System.out.println("");
		System.out.println("");

	}

	public void printAddStation() {
		System.out.print("Tambah Data Stasiun : ");
		System.out.flush();
	}

	public void printAddStation(String formatAddStation) {
		System.out.print("Tambah Data Stasiun  : " + formatAddStation);
		System.out.flush();
	}

public void failedValidateAddStation(){
		System.out.println("Format tambah stasiun yang Anda masukan salah!");
		System.out.flush();
	}
}