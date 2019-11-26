package org.kelompok4.app.View;

//Author Gayuh
public class BookingView {

	public BookingView(){

    }

    public void printBookingViewPage() {
		System.out.println("#BOOKING TICKET#");
		System.out.println("");
		System.out.println("");
    }

    public void printScheduleCode() {
		System.out.println("Kode Jadwal  :");
		System.out.flush();
    }
    
    public void printScheduleCode(String KodeJadwal) {
		System.out.println("Kode Jadwal  :" + KodeJadwal);
		System.out.flush();
    }

    public void failedValidateScheduleCode(){
		System.out.println("Jadwal kereta yang Anda masukan salah!");
		System.out.flush();
    }

    public void printTotalCustomer() {
		System.out.println("Jumlah  :");
		System.out.flush();
    }
    
    public void printTotalCustomer(int jumlah) {
		System.out.println("Jumlah  :" + jumlah);
		System.out.flush();
    }

    public void failedValidateTotalCustomer(){
		System.out.println("Jumlah penumpang yang Anda masukan salah!");
		System.out.flush();
    }

    public void printBookingSeatViewPage() {
		System.out.println("Pilih Kursi (Dengan Tanda E/Empty) :");
		System.out.println("");
    }

    public void printPaymentViewPage() {
		System.out.println("#PEMBAYARAN TIKET KERETA API#");
		System.out.println("");
		System.out.println("");
    }

    public void printRecNumber() {
		System.out.println("Kode Rekening  :");
		System.out.flush();
    }

    public void printRecNumber(int Rekening) {
		System.out.println("Kode Rekening  :" + Rekening);
		System.out.flush();
    }

    public void failedValidateRecNumber(){
		System.out.println("Kode Rekening yang Anda masukan salah!");
		System.out.flush();
    }

    public void printTotalPayment() {
		System.out.println("Total Pembayaran :");
		System.out.flush();
    }
    
    public void printTotalPayment(int payment) {
		System.out.println("Total Pembayaran  :" + payment);
		System.out.flush();
    }

    public void printPayment() {
		System.out.println("Apakah data pembayaran sudah benar (Y/N)?");
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
		System.out.println("Pembayaran Berhasil!");
		System.out.flush();
    }
    
    public void FailedPayment(){
		System.out.println("Pembayaran Gagal!");
		System.out.flush();
    }
}