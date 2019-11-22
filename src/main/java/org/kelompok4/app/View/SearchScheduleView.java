package org.kelompok4.app;

public class SearchScheduleView {

	public SearchScheduleView(){

	}
	public void printSearchScheduleViewPage() {
		System.out.println("#CARI JADWAL KERETA API#");
		System.out.println("");
		System.out.println("");

	}

	public void printDeparture() {
		System.out.print("Keberangkatan :");
		System.out.flush();
    }
    
	public void printDeparture(String departure) {
		System.out.print("Keberangkatan " + departure);
		System.out.flush();
    }
    
	public void printArrival() {
		System.out.print("Tujuan :");
		System.out.flush();
    }
    
	public void printArrival(String arrival) {
		System.out.print("Tujuan " + arrival);
		System.out.flush();
    }
    
	public void printDate() {
		System.out.print("Tanggal :");
		System.out.flush();
    }
    
	public void printDate(String tanggal) {
		System.out.print("Tanggal :" + tanggal);
		System.out.flush();
    }

    public void failedValidateDeparture(){
		System.out.println("Kota Keberangkatan yang Anda masukan salah!");
		System.out.flush();
	}

    public void failedValidateArrival(){
        System.out.println("Kota Tujuan yang Anda masukan salah!");
        System.out.flush();
    }

    public void failedValidateDate(){
        System.out.println("Format tanggal yang Anda masukan salah!");
        System.out.flush();
    }
}