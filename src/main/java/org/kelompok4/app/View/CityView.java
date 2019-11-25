//@Author Gayuh 
public class CityView {

	public CityView(){

	}

	public void MenuCity(){
		System.out.println("#KELOLA KOTA#");
		System.out.println("1.  Tambah Data Kota ");
		System.out.println("2.  Lihat Data Kota ");
		System.out.println("3.  Edit Data Kota ");
		System.out.println("4.  Delete Data Kota ");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");	
	}

	public void printAddCityPage() {
		System.out.println("#TAMBAH DATA KOTA#");
		System.out.println("");
		System.out.println("");

	}

	public void printAddCity() {
		System.out.print("Tambah Kota : ");
		System.out.flush();
	}

	public void printAddCity(String kota) {
		System.out.print("Tambah Kota : " + kota);
		System.out.flush();
	}

    public void failedValidateAddCity(){
		System.out.println("Format tambah kota yang Anda masukan salah!");
		System.out.flush();
	}
	
	public void SuccessAddCity(){
		System.out.println("Kota Berhasil Ditambahkan");
		System.out.flush();
	}
	
	public void FailedAddCity(){
		System.out.println("Kota Gagal Ditambahkan");
		System.out.flush();
    }
    
    public void printEditCityPage() {
		System.out.println("#EDIT DATA KOTA#");
		System.out.println("");
		System.out.println("");

	}

	public void printEditCity() {
		System.out.print("Edit Kota : ");
		System.out.flush();
	}

	public void printEditCity(String formatEdit) {
		System.out.print("Edit Kota: " + formatEdit);
		System.out.flush();
	}

	public void printEditCodeCity() {
		System.out.print("Kode Kota : ");
		System.out.flush();
	}

	public void printEditCodeCity(String kodeKota) {
		System.out.print("Kode Kota : " + kodeKota);
		System.out.flush();
	}

    public void printEditNameCity() {
		System.out.print("Nama Kota : ");
		System.out.flush();
	}

	public void printEditNameCity(String namaKota) {
		System.out.print("Nama Kota : " + namaKota);
		System.out.flush();
	}

    public void failedValidateEditCity(){
		System.out.println("Format edit kota yang Anda masukan salah!");
		System.out.flush();
	}
	
	public void SuccessEditCity(){
		System.out.println("Kota Berhasil Diupdate");
		System.out.flush();
	}
	
	public void FailedEditCity(){
		System.out.println("Kota Gagal Diupdate");
		System.out.flush();
    }
    
    public void printDeleteCityPage() {
		System.out.println("#HAPUS DATA KOTA#");
		System.out.println("");
		System.out.println("");
	}

	public void printDeleteCity() {
		System.out.print("Hapus Kota : ");
		System.out.flush();
	}

	public void printDeleteCity(String formatDelete) {
		System.out.print("Hapus Kota: " + formatDelete);
		System.out.flush();
	}

	public void failedValidateDeleteCity(){
		System.out.println("Format hapus kota yang Anda masukan salah!");
		System.out.flush();
	}
	
	public void SuccessDeleteCity(){
		System.out.println("Kota Berhasil Dihapus");
		System.out.flush();
	}
	
	public void FailedDeleteCity(){
		System.out.println("Kota Gagal Dihapus");
		System.out.flush();
	}
	
	public void printViewCityPage() {
		System.out.println("#LIHAT DATA KOTA#");
		System.out.println("Data Lengkap Kota");
		System.out.println("********************************************************************************************************************");
	}
}