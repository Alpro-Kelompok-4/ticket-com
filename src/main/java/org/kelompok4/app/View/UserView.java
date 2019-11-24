////@Author Gayuh 
public class UserView {

	public UserView(){

	}

	public void MenuHome(){
		//Tampilan Home
		System.out.println("********************************************************************************************************************");
		System.out.println("                                           SYSTEM TRAIN TICKET BOOKING                                              ");
		System.out.println("********************************************************************************************************************");
		System.out.println("1. Login");
		System.out.println("2. Register Customer");
		System.out.println(" ");
		System.out.println("Pilih Menu :");
    }

    public void MenuAdmin(){
		//Tampilan Menu Admin
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#MENU ADMIN#");
		System.out.println("WELCOME NAMA ADMIN");
		System.out.println("1.  Kelola Akun ");
		System.out.println("2.  Kelola Data Kota ");
		System.out.println("3.  Generate Waktu ");
		System.out.println("4.  Kelola Rute ");
		System.out.println("5.  Kelola Stasiun ");
		System.out.println("6.  Kelola Jalur Stasiun Pada Rute ");
		System.out.println("7.  Kelola Waktu Pada Rute ");
		System.out.println("8.  Kelola Kereta Pada Rute ");
		System.out.println("9.  Generate Jadwal Kereta Apie ");
		System.out.println("10. Lihat Pemasukan ");
		System.out.println("11. Lihat Jadwal Kereta Api ");
		System.out.println("0.  Logout ");
		System.out.println(" ");
	}

	public void MenuCustomer(){
		//Tampilan Menu Customer
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                      TICKET.COM                                                    ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#MENU CUSTOMER#");
		System.out.println("WELCOME NAMA CUSTOMER");
		System.out.println("1. Booking Tiket ");
		System.out.println("2. Kelola Profile ");
		System.out.println("3. History Pembelian ");
		System.out.println("0. Logout ");
		System.out.println(" ");
	}
}