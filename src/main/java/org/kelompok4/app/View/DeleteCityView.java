package org.kelompok4.app;
public class DeleteCityView {

	public DeleteCityView(){

	}
	public void printDeleteCityPage() {
		System.out.println("#HAPUS DATA KOTA#");
		System.out.println("");
		System.out.println("");

	}

	public void printDeleteCity() {
		System.out.print("Delete Kota : ");
		System.out.flush();
	}

	public void printDeleteCity(String formatDelete) {
		System.out.print("Edit Kota: " + formatDelete);
		System.out.flush();
	}

	public void failedValidateDeleteCity(){
		System.out.println("Format hapus kota yang Anda masukan salah!");
		System.out.flush();
	}

}