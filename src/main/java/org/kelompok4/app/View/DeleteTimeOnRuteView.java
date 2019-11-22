package org.kelompok4.app;
public class DeleteTimeOnRuteView {

	public DeleteTimeOnRuteView(){

	}
	public void printDeleteTimeOnRutePage() {
		System.out.println("#HAPUS WAKTU PADA RUTE#");
		System.out.println("");
		System.out.println("");

	}

	public void printDeleteTimeOnRute() {
		System.out.print("Hapus Waktu Pada Rute : ");
		System.out.flush();
	}

	public void printDeleteTimeOnRute(String formatDeleteTimeOnRute) {
		System.out.print("Hapus Waktu Pada Rute  : " + formatDeleteTimeOnRute);
		System.out.flush();
	}

public void failedValidateDeleteTimeOnRute(){
		System.out.println("Format hapus waktu pada rute yang Anda masukan salah!");
		System.out.flush();
	}
}