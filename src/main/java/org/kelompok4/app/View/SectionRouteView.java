package org.kelompok4.app;
public class SectionRouteView {

	public SectionRouteView(){

	}
	public void printSectionRoutePage() {
		System.out.println("#LIHAT STASIUN BERDASARKAN RUTE#");
		System.out.println("");
		System.out.println("");

	}

	public void printSectionRoute() {
		System.out.print("Kode Rute : ");
		System.out.flush();
	}

	public void printSectionRoute(String kodeRute) {
		System.out.print("Kode Rute  : " + kodeRute);
		System.out.flush();
	}

public void failedValidateSectionRoute(){
		System.out.println("Kode Rute stasiun yang Anda masukan salah!");
		System.out.flush();
	}
}