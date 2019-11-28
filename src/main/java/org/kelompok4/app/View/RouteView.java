package org.kelompok4.app.View;

//@Author Gayuh 
public class RouteView {

	public RouteView(){

	}

	public void MenuRute(){
		System.out.println("#KELOLA DATA RUTE#");
		System.out.println("1.  Tambah Data Rute ");
		System.out.println("2.  Lihat Data Rute ");
		System.out.println("3.  Edit Data Rute ");
		System.out.println("4.  Delete Data Rute ");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");
	}

	public void printAddRutePage() {
		System.out.println("#TAMBAH DATA RUTE#");
		System.out.println("");
		System.out.println("");
	}

	public void printAddRute() {
		System.out.print("Tambah Data Rute : ");
		System.out.flush();
	}

	public void printAddRute(String formatTambahRute) {
		System.out.print("Tambah Data Rute  : " + formatTambahRute);
		System.out.flush();
	}

	public void failedValidateAddRute(){
		System.out.println("Format tambah rute yang Anda masukan salah!");
		System.out.flush();
	}

	public void SuccessAddRute() {
		System.out.print("Rute Berhasil Ditambahkan");
		System.out.flush();
	}

	public void FailedAddRute() {
		System.out.print("Rute Gagal Ditambahkan");
		System.out.flush();
	}

	public void printEditRutePage() {
		System.out.println("#EDIT DATA RUTE#");
		System.out.println("");
		System.out.println("");
	}

	public void printEditRute() {
		System.out.print("Edit Data Rute : ");
		System.out.flush();
	}
        public void printInputCodeRute() {
		System.out.print("Masukan Kode Rute: ");
		System.out.flush();
	}

	public void printEditRute(String formatEditRute) {
		System.out.print("Edit Data Rute  : " + formatEditRute);
		System.out.flush();
	}

	public void failedValidateEditRute(){
		System.out.println("Format edit rute yang Anda masukan salah!");
		System.out.flush();
	}

	public void SuccessEditRute() {
		System.out.print("Rute Berhasil Diupdate");
		System.out.flush();
	}

	public void FailedEditRute() {
		System.out.print("Rute Gagal Diupdate");
		System.out.flush();
	}

	public void printViewRutePage() {
		System.out.println("#LIHAT DATA RUTE#");
		System.out.println("Data Lengkap Rute Kereta Api");	
		System.out.println("********************************************************************************************************************");

	}

	public void printDeleteRutePage() {
		System.out.println("#HAPUS DATA RUTE#");
		System.out.println("");
		System.out.println("");

	}

	public void printDeleteRute() {
		System.out.print("Delete Data Rute : ");
		System.out.flush();
	}

	public void printDeleteRute(String formatDeleteRute) {
		System.out.print("Delete Data Rute  : " + formatDeleteRute);
		System.out.flush();
	}

	public void failedValidateDeleteRute(){
		System.out.println("Format hapus rute yang Anda masukan salah!");
		System.out.flush();
	}

	public void SuccessDeleteRute() {
		System.out.print("Rute Berhasil Dihapus");
		System.out.flush();
	}

	public void FailedDeleteRute() {
		System.out.print("Rute Gagal Dihapus");
		System.out.flush();
	}

    public void printShowTable(String S) {
        System.out.println(S);
    }
}