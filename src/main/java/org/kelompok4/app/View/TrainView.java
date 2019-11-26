package org.kelompok4.app.View;

public class TrainView {
    public void printTrainMenu(){
        System.out.println("#KELOLA DATA KERETA API#");
        System.out.println("1. Tambah Data Kereta Api ");
        System.out.println("2. Lihat Data Kereta Api ");
        System.out.println("3. Edit Data Kereta Api ");
        System.out.println("4. Delete Data Kereta Api ");
        System.out.println("99. Main Menu ");
        System.out.println(" ");
        System.out.print("Pilih Menu : ");
        System.out.flush();
    }
    public void printAddTrainPage() {
        System.out.println("#TAMBAH DATA KERETA#");
        System.out.println("99. Kembali ke Menu Kelola Data Kereta API#");
        System.out.println("");
        System.out.println("");
        System.out.flush();

    }
    public void printviewTrainPage() {
        System.out.println("#LIHAT DATA KERETA API#");
        System.out.println("#Data Lengkap Kereta Api#");
        System.out.println("");
        System.out.println("");
        System.out.flush();

    }

    public void printAddTrain() {
        System.out.print("Tambah Data Kereta : ");
        System.out.flush();
    }

    public void printtrainName(String trainName) {
        System.out.println("Nama Kereta  : " + trainName);
        System.out.flush();
    }
    public void printtrainCode(String trainCode) {
        System.out.println("Kode Kereta  : " + trainCode);
        System.out.flush();
    }
    public void printtrainCoach(int trainCoach) {
        System.out.println("Jumlah Gerbong  : " + trainCoach);
        System.out.flush();
    }

    public void printbussinessCoach(int business) {
        System.out.println("Jumlah Gerbong Bisnis  : " + business);
        System.out.flush();
    }

    public void printpremiumCoach(int premium) {
        System.out.println("Jumlah Gerbong Premium  : " + premium);
        System.out.flush();
    }

    public void failedAddTrain(){
        System.out.println("Format tambah kereta yang Anda masukan salah!");
        System.out.flush();
    }
    public void successAddTrain(){
        System.out.println("Kereta Api Berhasil Ditambahkan!");
        System.out.flush();
    }
    public void printDeleteTrainPage() {
        System.out.println("#HAPUS DATA KERETA#");
        System.out.println("");
        System.out.println("");
        System.out.flush();
    }
    public void printShowTable(String S) {
        System.out.println("#TABLE DATA KERETA#");
        System.out.println(S);
        System.out.flush();
    }

    public void printDeleteTrain() {
        System.out.print("Hapus Data Kereta : ");
        System.out.flush();
    }

    public void printDeleteTrain(String formatDeleteTrain) {
        System.out.print("Hapus Data Kereta  : " + formatDeleteTrain);
        System.out.flush();
    }

    public void failedValidateDeleteTrain(){
        System.out.println("Format hapus kereta yang Anda masukan salah!");
        System.out.flush();
    }
    public void printEditTrainPage() {
        System.out.println("#EDIT DATA KERETA#");
        System.out.println("");
        System.out.println("");

    }

    public void printEditTrain() {
        System.out.print("Edit Data Kereta : ");
        System.out.flush();
    }

    public void printEditTrain(String formatEditTrain) {
        System.out.print("Edit Data Kereta  : " + formatEditTrain);
        System.out.flush();
    }

    public void failedEditTrain(){
        System.out.println("Kode kereta tidak ditemukan! Pastikan inputan Kode kereta benar!");
        System.out.flush();
    }
    public void successEditTrain(){
        System.out.println("Kereta Api Berhasil Diedit!");
        System.out.flush();
    }
    public void failedDeleteTrain(){
        System.out.println("Kode kereta tidak ditemukan! Pastikan inputan Kode kereta benar!");
        System.out.flush();
    }
    public void successDeleteTrain(){
        System.out.println("Kereta Api Berhasil dihapus!");
        System.out.flush();
    }

}
