package org.kelompok4.app;
public class EditTrainView {

	public EditTrainView(){

	}
	public void printEditTrainPage() {
		System.out.println("#EDIT DATA KERETA#");
		System.out.println("");
		System.out.println("");

	}

	public void printEditTrain() {
		System.out.print("Edit Data Kereta : ");
		System.out.flush();
	}

	public void printEditTrain(String formatEditTrain) {
		System.out.print("Edit Data Kereta  : " + formatEditTrain);
		System.out.flush();
	}

public void failedValidateEditTrain(){
		System.out.println("Format edit kereta yang Anda masukan salah!");
		System.out.flush();
	}
}