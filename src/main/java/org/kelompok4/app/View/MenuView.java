/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kelompok4.app.View;

//@Author Gayuh
public class MenuView {

    public MenuView(){

    }

    public void MenuHome(){
            //Tampilan Home
            System.out.println("********************************************************************************************************************");
            System.out.println("                                           SYSTEM TRAIN TICKET BOOKING                                              ");
            System.out.println("********************************************************************************************************************");
            System.out.println("1. Login");
            System.out.println("2. Register Customer");
            System.out.println(" ");
    }

    public void MenuLogin(){
            //Tampilan Home
            System.out.println("********************************************************************************************************************");
            System.out.println("                                           SYSTEM TRAIN TICKET BOOKING                                              ");
            System.out.println("********************************************************************************************************************");
            System.out.println("Email     : ");
            System.out.println("Password  : ");
            System.out.println(" ");
    }

    public void MenuRegistration() {
            System.out.println("********************************************************************************************************************");
            System.out.println("                                                   REGISTRASI SISTEM                                                ");
            System.out.println("********************************************************************************************************************");
            System.out.println("Nomor KTP        :");
            System.out.println("Nama Lengkap     :");
            System.out.println("Nomor Handphone  :");
            System.out.println("Email            :");
            System.out.println("Password         :");
            System.out.println("Re-Password      :");
            System.out.println(" ");
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
		System.out.println("7.  Kelola Kereta");
		System.out.println("8.  Kelola Waktu Pada Rute ");
		System.out.println("9.  Kelola Kereta Pada Rute ");
		System.out.println("10. Generate Jadwal Kereta Api ");
		System.out.println("11. Lihat Pemasukan ");
		System.out.println("12. Lihat Jadwal Kereta Api ");
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
    
    public void printChooseMenu() {
		System.out.print("Pilih Menu : ");
		System.out.flush();
	}

    public void printChooseMenu(int Menu) {
            System.out.print("Pilih Menu : " + Menu);
            System.out.flush();
    }

    public void failedValidateMenu(){
		System.out.println("Pilihan menu yang Anda masukan salah!");
		System.out.flush();
	}
}