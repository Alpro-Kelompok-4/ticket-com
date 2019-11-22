package org.kelompok4.app;
public class AddCityView {

	public AddCityView(){

	}
	public void printAddCityPage() {
		System.out.println("#TAMBAH DATA KOTA#");
		System.out.println("");
		System.out.println("");

	}

	public void printAddCity() {
		System.out.print("Tambah Kota : ");
		System.out.flush();
	}

	public void printAddCity(String kota) {
		System.out.print("Tambah Kota : " + kota);
		System.out.flush();
	}

public void failedValidateTambahKota(){
		System.out.println("Format tambah kota yang Anda masukan salah!");
		System.out.flush();
	}
}