package org.kelompok4.app;
public class DeleteStationView {

	public DeleteStationView(){

	}
	public void printDeleteStationPage() {
		System.out.println("HAPUS DATA STASIUN#");
		System.out.println("");
		System.out.println("");

	}

	public void printDeleteStation() {
		System.out.print("Delete Data Stasiun : ");
		System.out.flush();
	}

	public void printDeleteStation(String formatDeleteStation) {
		System.out.print("Delete Data Stasiun  : " + formatDeleteStation);
		System.out.flush();
	}

public void failedValidateDeleteStation(){
		System.out.println("Format hapus stasiun yang Anda masukan salah!");
		System.out.flush();
	}
}