package org.kelompok4.app.View;
//@Author gayuh
public class RouteTrainView {

	public RouteTrainView(){

    }
    
    public void MenuRouteTrainView(){
        System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
        System.out.println("1. Tambah Kereta Pada Rute ");
		System.out.println("2. Lihat Kereta Pada Rute ");
		System.out.println("3. Delete Kereta Pada Rute ");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");
    }

	public void printAddRouteTrainViewPage() {
		System.out.println("#KELOLA KERETA API PADA RUTE#");
		System.out.println("");
		System.out.println("");
	}

	public void printCodeRouteTrain() {
		System.out.print("Kode Rute : ");
		System.out.flush();
	}

	public void printCodeRouteTrain(String formatAddRouteTrain) {
		System.out.print("Kode Rute  : " + formatAddRouteTrain);
		System.out.flush();
	}

    public void failedValidateCodeRouteTrain(){
		System.out.println("Format Kode rute yang Anda masukan salah!");
		System.out.flush();
    }
    
    public void SuccessAddRouteTrain(){
		System.out.println("Kereta Api Untuk Rute Berhasil Ditambahkan");
		System.out.flush();
    }
    
    public void FailedAddRouteTrain(){
		System.out.println("Kereta Api Untuk Rute gagal Ditambahkan");
		System.out.flush();
    }
    
    public void printViewRouteTrainPage() {
		System.out.println("#LIHAT KERETA BERDASARKAN RUTE#");
		System.out.println("");
		System.out.println("");
    }
    
    public void HeaderViewRouteTrain(){
        System.out.println("Kereta Api Berdasarkan Rute");
		System.out.println("********************************************************************************************************************");
		System.out.println("");
    }

    public void printDeleteRouteTrainViewPage() {
		System.out.println("#HAPUS KERETA API PADA RUTE#");
		System.out.println("");
		System.out.println("");
	}

	public void printDeleteRouteTrain() {
		System.out.print("Delete Rute : ");
		System.out.flush();
	}

	public void printDeleteRouteTrain(String formatDeleteRouteTrain) {
		System.out.print("Delete Rute  : " + formatDeleteRouteTrain);
		System.out.flush();
	}

    public void failedValidateDeleteRouteTrain(){
		System.out.println("Format delete rute yang Anda masukan salah!");
		System.out.flush();
    }
    
    public void SuccessDeleteRouteTrain(){
		System.out.println("Kereta Api Untuk Rute Berhasil Dihapus");
		System.out.flush();
    }
    
    public void FailedDeleteRouteTrain(){
		System.out.println("Kereta Api Untuk Rute Gagal Dihapus");
		System.out.flush();
    }

}