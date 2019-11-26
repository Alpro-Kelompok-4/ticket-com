package org.kelompok4.app.View;

public class TimeView {

    public void printTimeMenu(){
        System.out.println("1. Lihat Data Waktu ");
        System.out.println("99. Main Menu ");
        System.out.println(" ");
        System.out.print("Pilih Menu : ");
        System.out.flush();
    }

    public void printAddTimePage() {
        System.out.println("#GENERATE DATA WAKTU#");
        System.out.flush();
    }

    public void printGenerateTime() {
        System.out.println("Apakah anda yakin untuk generate waktu (Y/N)?");
        System.out.flush();
    }

    public void SuccessGenerateTime(){
        System.out.println("Generate Waktu Berhasil!");
        System.out.flush();
    }
    public void FailedGenerateTime(){
        System.out.println("Generate Waktu Gagal!");
        System.out.flush();
    }
     public void printShowTable(String S) {
        System.out.println("#DATA LENGKAP WAKTU#");
        System.out.println(S);
        System.out.flush();
    }
}