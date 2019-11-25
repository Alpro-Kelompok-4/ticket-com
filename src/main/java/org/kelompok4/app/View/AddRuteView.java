package org.kelompok4.app;
public class AddRuteView {

	public AddRuteView(){

	}
	public void printAddRutePage() {
		System.out.println("#TAMBAH DATA RUTE#");
		System.out.println("");
		System.out.println("");

	}

	public void printAddRute() {
		System.out.print("Tambah Data Rute : ");
		System.out.flush();
	}

	public void printAddRute(String formatTambahRute) {
		System.out.print("Tambah Data Rute  : " + formatTambahRute);
		System.out.flush();
	}

public void failedValidateAddRute(){
		System.out.println("Format tambah rute yang Anda masukan salah!");
		System.out.flush();
	}
}