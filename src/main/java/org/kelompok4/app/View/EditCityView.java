package org.kelompok4.app;
public class EditCityView {

	public EditCityView(){

	}
	public void printEditCityPage() {
		System.out.println("#EDIT DATA KOTA#");
		System.out.println("");
		System.out.println("");

	}

	public void printEditCity() {
		System.out.print("Edit Kota : ");
		System.out.flush();
	}

	public void printEditCity(String formatEdit) {
		System.out.print("Edit Kota: " + formatEdit);
		System.out.flush();
	}

	public void printEditCodeCity() {
		System.out.print("Kode Kota : ");
		System.out.flush();
	}

	public void printEditCodeCity(String kodeKota) {
		System.out.print("Kode Kota : " + kodeKota);
		System.out.flush();
	}

    public void printEditNameCity() {
		System.out.print("Nama Kota : ");
		System.out.flush();
	}

	public void printEditNameCity(String namaKota) {
		System.out.print("Nama Kota : " + namaKota);
		System.out.flush();
	}

    public void failedValidateEditCity(){
		System.out.println("Format edit kota yang Anda masukan salah!");
		System.out.flush();
	}

}