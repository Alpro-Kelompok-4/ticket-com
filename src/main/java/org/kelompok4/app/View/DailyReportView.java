package org.kelompok4.app;
public class DailyReportView {

	public DailyReportView(){

	}
	public void printDailyReportViewPage() {
		System.out.println("#LAPORAN HARIAN PEMASUKAN#");
		System.out.println("");
		System.out.println("");

	}

	public void printDailyReportView() {
		System.out.print("Masukkan Tanggal Pencarian : ");
		System.out.flush();
	}

	public void printDailyReportView(String formatDate) {
		System.out.print("Masukkan Tanggal Pencarian : " + formatDate);
		System.out.flush();
	}

public void failedValidateDailyReportView(){
		System.out.println("Format tanggal yang Anda masukan salah!");
		System.out.flush();
	}
}