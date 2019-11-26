package org.kelompok4.app.View;

//@Author gayuh
public class RwRouteView {
    public void menuRwRouteView(){
        System.out.println("********************************************************************************************************************");
        System.out.println("                                                      TICKET.COM                                                    ");
        System.out.println("********************************************************************************************************************");
        System.out.println("1. Tambah Jalur Stasiun Pada Rute ");
        System.out.println("2. Lihat Jalur StasiunPada Rute ");
        System.out.println("3. Delete Jalur Stasiun Pada Rute ");
        System.out.println("99. Main Menu ");
        System.out.println(" ");
        System.out.println("Pilih Menu : ");
        System.out.println(" ");
    }

    public void printHeaderRwRouteView() {
        System.out.print("Stasiun Awal Sampai Stasiun Akhir ");
        System.out.println("********************************************************************************************************************");
        System.out.flush();
    }

    public void printAddRwRouteViewPage() {
        System.out.println("#KELOLA STASIUN BERDASARKAN RUTE#");
        System.out.println("");
        System.out.println("");
    }

    public void printCodeRwRouteView() {
        System.out.print("Kode Rute : ");
        System.out.flush();
    }

    public void printCodeRwRouteView(String CodeRwRoute) {
        System.out.print("Kode Rute  : " + CodeRwRoute);
        System.out.flush();
    }
    public void printTrackInputView(int i){
        System.out.print("Jalur " + i + " : ");
    }
    public void failedValidateCodeRwRouteView(){
        System.out.println("Format Kode rute yang Anda masukan salah!");
        System.out.flush();
    }
    public void printHeaderAddRwRoute() {
        System.out.println("Kereta Api Untuk Rute");
        System.out.println("********************************************************************************************************************");
        System.out.println("");
    }

    public void SuccessAddRwRoute() {
        System.out.print("Jalur Stasiun Yang dilewati berdasarkan Rute Berhasil Ditambahkan");
        System.out.flush();
    }

    public void FailedAddRwRoute() {
        System.out.print("Jalur Stasiun Yang dilewati berdasarkan Rute Gagal Ditambahkan");
        System.out.flush();
    }

    public void printViewRwRoutePage() {
        System.out.println("#LIHAT JALUR STASIUN BERDASARKAN RUTE#");
        System.out.println("");
        System.out.println("");
    }

    public void printHeaderViewRwRoute() {
        System.out.println("Kereta Api Berdasarkan Rute");
        System.out.println("********************************************************************************************************************");
        System.out.println("");
    }

    public void printDeleteRwRouteViewPage() {
        System.out.println("#HAPUS JALUR STASIUN BERDASARKAN RUTE#");
        System.out.println("");
        System.out.println("");
    }

    public void printDeleteRwRouteView() {
        System.out.print("Hapus Kode Jalur : ");
        System.out.flush();
    }

    public void printDeleteRwRouteView(String formatDelRwRoute) {
        System.out.print("Hapus Kode Jalur : " + formatDelRwRoute);
        System.out.flush();
    }

    public void failedValidateDeleteRwRouteView(){
        System.out.println("Format hapus jalur yang Anda masukan salah!");
        System.out.flush();
    }

    public void SuccessDeleteRwRoute() {
        System.out.print("Jalur Stasiun pada Rute Berhasil Dihapus");
        System.out.flush();
    }

    public void FailedDeleteRwRoute() {
        System.out.print("Jalur Stasiun pada Rute Gagal Dihapus");
        System.out.flush();
    }
    public void printShowTable(String S) {
        System.out.println(S);
        System.out.flush();
    }

}
