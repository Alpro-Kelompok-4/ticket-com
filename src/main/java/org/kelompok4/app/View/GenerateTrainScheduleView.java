package org.kelompok4.app;
public class GenerateTrainScheduleView {

	public GenerateTrainScheduleView(){

	}
	public void printGenerateTimePage() {
		System.out.println("#GENERATE JADWAL KERETA API#");
		System.out.println("");
		System.out.println("");
	}

	public void printGenerateTrainSchedule() {
		System.out.print("Apakah anda yakin untuk generate jadwal (Y/N)? ");
		System.out.flush();
	}

	public void printGenerateTrainSchedule(String formatYesNo) {
		System.out.print("Apakah anda yakin untuk generate jadwal (Y/N)?: " + formatYesNo);
		System.out.flush();
	}

public void failedValidateGenerateTrainSchedule(){
		System.out.println("Format yang Anda masukan salah! Pilih Y/N");
		System.out.flush();
	}
}