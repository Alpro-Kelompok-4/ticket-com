package org.kelompok4.app.View;
//@Author gayuh
public class RouteTimeView {

	public RouteTimeView(){

    }
    
    public void MenuRouteTimeView(){
        System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
        System.out.println("1. Tambah Waktu Pada Rute ");
		System.out.println("2. Lihat Waktu Pada Rute ");
		System.out.println("3. Delete Waktu Pada Rute ");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");
    }

	public void printAddRouteTimeViewPage() {
		System.out.println("#KELOLA WAKTU BERDASARKAN RUTE#");
		System.out.println("");
		System.out.println("");
	}

	public void printCodeRouteTime() {
		System.out.print("Kode Rute : ");
		System.out.flush();
	}

	public void printCodeRouteTime(String formatAddRouteTime) {
		System.out.print("Kode Rute  : " + formatAddRouteTime);
		System.out.flush();
	}

    public void failedValidateCodeRouteTime(){
		System.out.println("Format Kode rute yang Anda masukan salah!");
		System.out.flush();
    }
    
    public void SuccessAddRouteTime(){
		System.out.println("Waktu Untuk Rute Berhasil Ditambahkan");
		System.out.flush();
    }
    
    public void FailedAddRouteTime(){
		System.out.println("Waktu Untuk Rute gagal Ditambahkan");
		System.out.flush();
    }
    
    public void printViewRouteTimePage() {
		System.out.println("#LIHAT WAKTU BERDASARKAN RUTE#");
		System.out.println("");
		System.out.println("");
    }
    
    public void HeaderViewRouteTime(){
        System.out.println("Waktu Available Untuk Rute");
		System.out.println("********************************************************************************************************************");
		System.out.println("");
    }

    public void printDeleteRouteTimeViewPage() {
		System.out.println("#HAPUS WAKTU PADA RUTE#");
		System.out.println("");
		System.out.println("");
	}

	public void printDeleteRouteTime() {
		System.out.print("Delete Waktu Pada Rute : ");
		System.out.flush();
	}

	public void printDeleteRouteTime(String formatDeleteRouteTime) {
		System.out.print("Delete Waktu Pada Rute  : " + formatDeleteRouteTime);
		System.out.flush();
	}

    public void failedValidateDeleteRouteTime(){
		System.out.println("Format delete waktu rute yang Anda masukan salah!");
		System.out.flush();
    }
    
    public void SuccessDeleteRouteTime(){
		System.out.println("Waktu Untuk Rute Berhasil Dihapus");
		System.out.flush();
    }
    
    public void FailedDeleteRouteTime(){
		System.out.println("Waktu Untuk Rute Gagal Dihapus");
		System.out.flush();
    }

}