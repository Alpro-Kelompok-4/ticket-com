package org.kelompok4.app;
public class DeleteSectionRouteView {

	public DeleteSectionRouteView(){

	}
	public void printDeleteSectionRoutePage() {
		System.out.println("#HAPUS JALUR STASIUN PADA RUTE#");
		System.out.println("");
		System.out.println("");

	}

	public void printDeleteSectionRoute() {
		System.out.print("Kode Jalur : ");
		System.out.flush();
	}

	public void printDeleteSectionRoute(String formatDelete) {
		System.out.print("Kode Jalur : " + formatDelete);
		System.out.flush();
	}

public void failedValidateDeleteSectionRoute(){
		System.out.println("Kode Jalur Stasiun stasiun yang Anda masukan salah!");
		System.out.flush();
	}
}