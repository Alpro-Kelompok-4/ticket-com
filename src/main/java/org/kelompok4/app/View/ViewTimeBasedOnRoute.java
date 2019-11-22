package org.kelompok4.app;
public class ViewTimeBasedOnRoute {

	public ViewTimeBasedOnRoute(){

	}
	public void printViewTimeRoutePage() {
		System.out.println("#LIHAT WAKTU BERDASARKAN RUTE#");
		System.out.println("");
		System.out.println("");

	}

	public void printViewTimeRoute() {
		System.out.print("Kode Rute : ");
		System.out.flush();
	}

	public void printViewTimeRoute(String formatViewTimeRoute) {
		System.out.print("Kode Rute  : " + formatViewTimeRoute);
		System.out.flush();
	}

public void failedValidateViewTimeRoute(){
		System.out.println("Format Kode rute yang Anda masukan salah!");
		System.out.flush();
	}
}