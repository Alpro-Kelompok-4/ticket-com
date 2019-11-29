package org.kelompok4.app.View;

//Author Gayuh
public class BookingView {

	public BookingView() {}

	public void printBookingMenu() {
		System.out.println("1. Booking Ticket");
		System.out.println("0. Menu Utama");
		System.out.println("\nPilih Menu : ");
	}

	public void printBookingPaymentMenu() {
		System.out.println("1. Pembayaran");
		System.out.println("0. Menu Utama");
		System.out.println("\nPilih Menu : ");
	}

	public void printHistoryBookingView() {
		System.out.println();
		System.out.println("#HISTORY BOOKING#");
		System.out.println();
	}

	public void printCariBookingView() {
		System.out.println("#CARI JADWAL KERETA API#");
		System.out.println();
		System.out.println();
		System.out.println("Cari Jadwal Kereta Api");
	}

	public void printOrigin() {
		System.out.print("Keberangkatan : ");
		System.out.flush();
	}

	public void printDestination() {
		System.out.print("Tujuan : ");
		System.out.flush();
	}

	public void printDepartureDate() {
		System.out.print("Tanggal : ");
		System.out.flush();
	}

    public void printBookingViewPage() {
		System.out.println("#BOOKING TICKET#");
		System.out.println("");
		System.out.println("");
    }

    public void printScheduleCode() {
		System.out.print("Kode Jadwal  : ");
		System.out.flush();
    }
    
    public void printScheduleCode(String KodeJadwal) {
		System.out.print("Kode Jadwal  : " + KodeJadwal);
		System.out.flush();
    }

    public void failedValidateScheduleCode(){
		System.out.println("Jadwal kereta yang Anda masukan salah!");
		System.out.println();
		System.out.flush();
    }

    public void printTotalCustomer() {
		System.out.print("Jumlah  : ");
		System.out.flush();
    }
    
    public void printTotalCustomer(int jumlah) {
		System.out.print("Jumlah  : " + jumlah);
		System.out.flush();
    }

    public void failedValidateTotalCustomer(){
		System.out.println("Jumlah penumpang yang Anda masukan salah!");
		System.out.println();
		System.out.flush();
	}
	
	public void printCustomerName(int i) {
		System.out.print("Penumpang " + i + " : ");
		System.out.flush();
	}

	public void printCustomerSeat(int i) {
		System.out.print("Kursi " + i + " : ");
		System.out.flush();
	}

    public void printBookingSeatViewPage() {
		System.out.println("Pilih Kursi (Dengan Tanda E/Empty) :");
	}
	
	public void printBookingSeatFilled() {
		System.out.println("Kursi sudah terisi (F/Full). Silahkan pilih kursi lain.");
	}

    public void printPaymentViewPage() {
		System.out.println("\n#PEMBAYARAN TIKET KERETA API#");
		System.out.println("");
		System.out.println("");
	}

	public void printBookingCode(String code) {
		System.out.println("Kode Booking  : " + code);
		System.out.flush();
    }

    public void printRecNumber() {
		System.out.print("Kode Rekening  : ");
		System.out.flush();
    }

    public void printRecNumber(String Rekening) {
		System.out.println("Kode Rekening  : " + Rekening);
		System.out.flush();
    }

    public void failedValidateRecNumber(){
		System.out.println("Kode Rekening yang Anda masukan salah!");
		System.out.flush();
    }

    public void printTotalPayment() {
		System.out.print("Total Pembayaran : ");
		System.out.flush();
    }
    
    public void printTotalPayment(double payment) {
		System.out.println("Total Pembayaran  : " + payment);
		System.out.flush();
    }

    public void printPayment() {
		System.out.print("Apakah data pembayaran sudah benar (Y/N)? ");
		System.out.flush();
    }

    public void printPayment(String YesNo) {
		System.out.println("Apakah data pembayaran sudah benar (Y/N)?" + YesNo);
		System.out.flush();
    }
    
    public void failedValidateYesNo(){
		System.out.println("Format yang Anda masukan salah! Pilih Y/N");
		System.out.flush();
    }

    public void SuccessPayment(){
		System.out.println("\nPembayaran Berhasil!");
		System.out.flush();
    }
    
    public void FailedPayment(){
		System.out.println("\nPembayaran Gagal!");
		System.out.flush();
	}

	public void printCoachSeatList(String s, String data) {
		System.out.println(s);
		System.out.println(data);
		System.out.println();
		System.out.flush();
	}
	
	public void printBorder() {
		System.out.println("\n=============================================================\n");
		System.out.flush();
	}
}