package org.kelompok4.app;
public class EditRuteView {

	public EditRuteView(){

	}
	public void printEditRutePage() {
		System.out.println("#EDIT DATA RUTE#");
		System.out.println("");
		System.out.println("");

	}

	public void printEditRute() {
		System.out.print("Edit Data Rute : ");
		System.out.flush();
	}

	public void printEditRute(String formatEditRute) {
		System.out.print("Edit Data Rute  : " + formatEditRute);
		System.out.flush();
	}

public void failedValidateEditRute(){
		System.out.println("Format edit rute yang Anda masukan salah!");
		System.out.flush();
	}
}