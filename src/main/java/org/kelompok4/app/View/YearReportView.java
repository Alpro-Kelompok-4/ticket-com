package org.kelompok4.app;
public class YearReportView {

	public YearReportView(){

	}
	public void printYearReportViewPage() {
		System.out.println("#LAPORAN TAHUNAN PEMASUKAN#");
		System.out.println("");
		System.out.println("");

	}

	public void printYearReportView() {
		System.out.print("Masukkan Tahun Pencarian : ");
		System.out.flush();
	}

	public void printYearReportView(String formatDate) {
		System.out.print("Masukkan Tahun Pencarian : " + formatDate);
		System.out.flush();
	}

public void failedValidateYearReportView(){
		System.out.println("Format tanggal yang Anda masukan salah!");
		System.out.flush();
	}
}