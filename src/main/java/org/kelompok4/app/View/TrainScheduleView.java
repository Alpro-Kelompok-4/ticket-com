package org.kelompok4.app.View;
//Author Gayuh
public class TrainScheduleView {

	public TrainScheduleView(){

    }

    public void MenuRouteTimeView(){
        System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("1. Lihat Jadwal Kereta Api ");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");
    }

    public void printTrainScheduleViewPage() {
		System.out.println("#GENERATE JADWAL KERETA API#");
		System.out.println("");
		System.out.println("");
    }
    
    public void printGenerateTrainSchedule() {
		System.out.println("Apakah anda yakin untuk generate jadwal (Y/N)?");
		System.out.flush();
    }
    
    public void printGenerateTrainSchedule(String YesNo) {
		System.out.println("Apakah anda yakin untuk generate jadwal (Y/N)?" + YesNo);
		System.out.flush();
    }
    
    public void failedValidateYesNo(){
		System.out.println("Format yang Anda masukan salah! Pilih Y/N");
		System.out.flush();
    }

    public void SuccessGenerateSchedule(){
		System.out.println("Generate Jadwal Kereta Api Berhasil!");
		System.out.flush();
    }
    
    public void FailedGenerateSchedule(){
		System.out.println("Generate Jadwal Kereta Api Gagal!");
		System.out.flush();
    }

    public void printViewTrainSchedulePage() {
		System.out.println("#LIHAT JADWAL KERETA API#");
        System.out.println("********************************************************************************************************************");
		System.out.println("");
    }
}  