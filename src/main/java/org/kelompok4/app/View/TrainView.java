package org.kelompok4.app;
public class TrainView {

	public TrainView(){

    }
    
    public void MenuTrain(){
        System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#KELOLA DATA KERETA API#");
		System.out.println("1. Tambah Data Kereta Api ");
		System.out.println("2. Lihat Data Kereta Api ");
		System.out.println("3. Edit Data Kereta Api ");
		System.out.println("4. Delete Data Kereta Api ");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");
    }

	public void printAddTrainPage() {
		System.out.println("#TAMBAH DATA KERETA#");
		System.out.println("");
		System.out.println("");

	}

	public void printAddTrain() {
		System.out.print("Tambah Data Kereta : ");
		System.out.flush();
	}

	public void printAddTrain(String formatAddTrain) {
		System.out.print("Tambah Data Kereta  : " + formatAddTrain);
		System.out.flush();
	}

	public void failedValidateAddTrain(){
		System.out.println("Format tambah kereta yang Anda masukan salah!");
		System.out.flush();
	}
	
	public void SuccessAddTrain() {
		System.out.print("Kereta Api Berhasil Ditambahkan");
		System.out.flush();
	}

	public void FailedAddTrain() {
		System.out.print("Kereta Api Gagal Ditambahkan");
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

    public void failedValidateEditTrain(){
		System.out.println("Format edit kereta yang Anda masukan salah!");
		System.out.flush();
	}
	
	public void SuccessEditTrain() {
		System.out.print("Kereta Api Berhasil Diupdate");
		System.out.flush();
	}

	public void FailedEditTrain() {
		System.out.print("Kereta Api Gagal Diupdate");
		System.out.flush();
	}
    
    public void printDeleteTrainPage() {
		System.out.println("#HAPUS DATA KERETA#");
		System.out.println("");
		System.out.println("");

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

	public void SuccessDeleteTrain() {
		System.out.print("Kereta Api Berhasil Dihapus");
		System.out.flush();
	}

	public void FailedDeleteTrain() {
		System.out.print("Kereta Api Gagal Dihapus");
		System.out.flush();
	}

	public void printViewTrainPage() {
		System.out.println("#LIHAT DATA KERETA#");
		System.out.println("Data Lengkap Stasiun");
		System.out.println("********************************************************************************************************************");
	}

}