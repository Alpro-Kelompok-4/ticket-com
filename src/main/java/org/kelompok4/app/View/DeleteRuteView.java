package org.kelompok4.app;
public class DeleteRuteView {

	public DeleteRuteView(){

	}
	public void printDeleteRutePage() {
		System.out.println("#HAPUS DATA RUTE#");
		System.out.println("");
		System.out.println("");

	}

	public void printDeleteRute() {
		System.out.print("Delete Data Rute : ");
		System.out.flush();
	}

	public void printDeleteRute(String formatDeleteRute) {
		System.out.print("Delete Data Rute  : " + formatDeleteRute);
		System.out.flush();
	}

public void failedValidateDeleteRute(){
		System.out.println("Format hapus rute yang Anda masukan salah!");
		System.out.flush();
	}
}