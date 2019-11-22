//@Author gayuh
public class RwRouteView {

	public RwRouteView(){

    }
    
    public void MenuRwRouteView(){
        System.out.println("********************************************************************************************************************");
		System.out.println("                                                      TICKET.COM                                                    ");
		System.out.println("********************************************************************************************************************");
        System.out.println("1. Tambah Kereta Pada Rute ");
		System.out.println("2. Lihat Kereta Pada Rute ");
		System.out.println("3. Delete Kereta Pada Rute ");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");
    }

	public void printAddRwRouteViewPage() {
		System.out.println("#KELOLA WAKTU BERDASARKAN RUTE#");
		System.out.println("");
		System.out.println("");
	}

	public void printAddRwRouteView() {
		System.out.print("Kode Rute : ");
		System.out.flush();
	}

	public void printAddRwRouteView(String formatAddRwRoute) {
		System.out.print("Kode Rute  : " + formatAddRwRoute);
		System.out.flush();
	}

    public void failedValidateAddRwRouteView(){
		System.out.println("Format Kode rute yang Anda masukan salah!");
		System.out.flush();
    }
    
    public void printViewRwRoutePage() {
		System.out.println("#LIHAT KERETA BERDASARKAN RUTE#");
		System.out.println("");
		System.out.println("");
    }
    
    public void printDeleteRwRouteViewPage() {
		System.out.println("#HAPUS KERETA BERDASARKAN RUTE#");
		System.out.println("");
		System.out.println("");
	}

	public void printDeleteRwRouteView() {
		System.out.print("Kode Rute : ");
		System.out.flush();
	}

	public void printDeleteRwRouteView(String formatDelRwRoute) {
		System.out.print("Kode Rute  : " + formatDelRwRoute);
		System.out.flush();
	}

    public void failedValidateDeleteRwRouteView(){
		System.out.println("Format Kode rute yang Anda masukan salah!");
		System.out.flush();
    }

}