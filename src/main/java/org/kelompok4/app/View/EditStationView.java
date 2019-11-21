package org.kelompok4.app;
public class EditStationView {

	public EditStationView(){

	}
	public void printEditStationPage() {
		System.out.println("#EDIT DATA STASIUN#");
		System.out.println("");
		System.out.println("");

	}

	public void printEditStation() {
		System.out.print("Edit Data Stasiun : ");
		System.out.flush();
	}

	public void printEditStation(String formatEditStation) {
		System.out.print("Edit Data Stasiun  : " + formatEditStation);
		System.out.flush();
	}

public void failedValidateEditStation(){
		System.out.println("Format edit stasiun yang Anda masukan salah!");
		System.out.flush();
	}
}