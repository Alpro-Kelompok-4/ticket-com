package org.kelompok4.app;
public class MonthlyReportView {

	public MonthlyReportView(){

	}
	public void printMonthlyReportViewPage() {
		System.out.println("#LAPORAN BULANAN PEMASUKAN#");
		System.out.println("");
		System.out.println("");

	}

	public void printMonthlyReportView() {
		System.out.print("Masukkan Bulan Pencarian :  ");
		System.out.flush();
	}

	public void printMonthlyReportView(String formatDate) {
		System.out.print("Masukkan Bulan Pencarian : " + formatDate);
		System.out.flush();
	}

public void failedValidateMonthlyReportView(){
		System.out.println("Format tanggal yang Anda masukan salah!");
		System.out.flush();
	}
}