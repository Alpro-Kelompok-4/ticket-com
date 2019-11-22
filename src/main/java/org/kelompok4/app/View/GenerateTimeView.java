package org.kelompok4.app;
public class GenerateTimeView {

	public GenerateTimeView(){

	}
	public void printGenerateTimePage() {
		System.out.println("#GENERATE DATA WAKTU#");
		System.out.println("");
		System.out.println("");

	}

	public void printGenerateTime() {
		System.out.print("Apakah anda yakin untuk generate waktu (Y/N)? ");
		System.out.flush();
	}

	public void printGenerateTime(String formatYesNo) {
		System.out.print("Apakah anda yakin untuk generate waktu (Y/N)?: " + formatYesNo);
		System.out.flush();
	}

public void failedValidateGenerateTime(){
		System.out.println("Format yang Anda masukan salah! Pilih Y/N");
		System.out.flush();
	}
}