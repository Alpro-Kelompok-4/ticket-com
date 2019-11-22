package org.kelompok4.app;
public class AddTrainView {

	public AddTrainView(){

	}
	public void printAddTrainPage() {
		System.out.println("#TAMBAH DATA KERETA#");
		System.out.println("");
		System.out.println("");

	}

	public void printAddTrain() {
		System.out.print("Tambah Data Kereta : ");
		System.out.flush();
	}

	public void printAddTrain(String formatAddTrain) {
		System.out.print("Tambah Data Kereta  : " + formatAddTrain);
		System.out.flush();
	}

public void failedValidateAddTrain(){
		System.out.println("Format tambah kereta yang Anda masukan salah!");
		System.out.flush();
	}
}