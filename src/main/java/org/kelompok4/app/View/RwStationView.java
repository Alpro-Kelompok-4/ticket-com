package org.kelompok4.app.View;

//@Author gayuh
public class RwStationView {

	public RwStationView(){

    }
    
    public void MenuRwStation(){
        //6. Tampilan data stasiun
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#KELOLA DATA STASIUN#");
		System.out.println("1.  Tambah Data Stasiun ");
		System.out.println("2.  Lihat Data Stasiun ");
		System.out.println("3.  Edit Data Stasiun ");
		System.out.println("4.  Delete Data Stasiun ");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");

    }

	public void printAddStationPage() {
		System.out.println("#TAMBAH DATA STASIUN#");
		System.out.println("");
		System.out.println("");

	}

	public void printAddStation() {
		System.out.print("Tambah Data Stasiun : ");
		System.out.flush();
	}

	public void printAddStation(String formatAddStation) {
		System.out.print("Tambah Data Stasiun  : " + formatAddStation);
		System.out.flush();
	}

	public void failedValidateAddStation(){
		System.out.println("Format tambah stasiun yang Anda masukan salah!");
		System.out.flush();
	}
	
	public void SuccessAddStation() {
		System.out.print("Stasiun Berhasil Ditambahkan");
		System.out.flush();
	}

	public void FailedAddStation() {
		System.out.print("Stasiun Gagal Ditambahkan");
		System.out.flush();
	}
    
    public void printEditStationPage() {
		System.out.println("#EDIT DATA STASIUN#");
		System.out.println("");
		System.out.println("");
	}

	public void printEditStation() {
		System.out.print("Edit Data Stasiun : ");
		System.out.flush();
	}

	public void printEditStation(String formatEditStation) {
		System.out.print("Edit Data Stasiun  : " + formatEditStation);
		System.out.flush();
	}

    public void failedValidateEditStation(){
		System.out.println("Format edit stasiun yang Anda masukan salah!");
		System.out.flush();
	}
	
	public void SuccessEditStation() {
		System.out.print("Stasiun Berhasil DiUpdate");
		System.out.flush();
	}

	public void FailedEditStation() {
		System.out.print("Stasiun Gagal DiUpdate");
		System.out.flush();
	}
    
    public void printViewStationPage() {
		System.out.println("#LIHAT DATA STASIUN#");
		System.out.println("Data Lengkap Stasiun");
		System.out.println("********************************************************************************************************************");
    }
    
    public void printDeleteStationPage() {
		System.out.println("HAPUS DATA STASIUN#");
		System.out.println("");
		System.out.println("");
	}

	public void printDeleteStation() {
		System.out.print("Delete Data Stasiun : ");
		System.out.flush();
	}

	public void printDeleteStation(String formatDeleteStation) {
		System.out.print("Delete Data Stasiun  : " + formatDeleteStation);
		System.out.flush();
	}

    public void failedValidateDeleteStation(){
		System.out.println("Format hapus stasiun yang Anda masukan salah!");
		System.out.flush();
	}

	public void SuccessDeleteStation() {
		System.out.print("Stasiun Berhasil Dihapus");
		System.out.flush();
	}

	public void FailedDeleteStation() {
		System.out.print("Stasiun Gagal Dihapus");
		System.out.flush();
	}
}