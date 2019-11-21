package org.kelompok4.app;
public class DeleteTrainView {

	public DeleteTrainView(){

	}
	public void printDeleteTrainPage() {
		System.out.println("#HAPUS DATA KERETA#");
		System.out.println("");
		System.out.println("");

	}

	public void printDeleteTrain() {
		System.out.print("Hapus Data Kereta : ");
		System.out.flush();
	}

	public void printDeleteTrain(String formatDeleteTrain) {
		System.out.print("Hapus Data Kereta  : " + formatDeleteTrain);
		System.out.flush();
	}

public void failedValidateDeleteTrain(){
		System.out.println("Format hapus kereta yang Anda masukan salah!");
		System.out.flush();
	}
}