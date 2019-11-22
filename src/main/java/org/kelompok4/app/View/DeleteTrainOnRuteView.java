package org.kelompok4.app;
public class DeleteTrainOnRuteView {

	public DeleteTrainOnRuteView(){

	}
	public void printDeleteTrainOnRutePage() {
		System.out.println("#HAPUS DATA KERETA BERDASARKAN RUTE#");
		System.out.println("");
		System.out.println("");

	}

	public void printDeleteTrainOnRute() {
		System.out.print("Hapus Data Kereta Berdasarkan Rute : ");
		System.out.flush();
	}

	public void printDeleteTrainOnRute(String formatDeleteTrainOnRute) {
		System.out.print("Hapus Data Kereta Berdasarkan Rute : " + formatDeleteTrainOnRute);
		System.out.flush();
	}

public void failedValidateDeleteTrainOnRute(){
		System.out.println("Format hapus kereta pada rute yang Anda masukan salah!");
		System.out.flush();
	}
}