/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author gayuh
 */

// import com.fasterxml.jackson.core.type.TypeReference;
// import org.apache.commons.lang3.StringUtils;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;
// import static org.apache.commons.lang3.time.DateUtils.addDays;

class Menu{
	
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

	public void MenuLogin(){
		//2. Tampilan Login
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                      LOGIN                                                         ");
		System.out.println("********************************************************************************************************************");
		System.out.println("Email     : ");
		System.out.println("Password  : ");
		System.out.println(" ");
	}

	public void MenuRegister(){
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
}

public class Main{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int choose;
		
		//
		Menu home = new Menu();
		home.MenuHome();
		choose = sc.nextInt();

		do{
			if (choose!=1 && choose!=2){
				System.out.println("Pilihan yang anda masukan salah!");
				System.out.println("Pilih Menu :");
				choose = sc.nextInt();
			}
		}while(choose!=1 && choose!=2);

		switch (choose) {
			case 1:{
				home.MenuLogin();
				//Login 
				break;
			}
			case 2:{
				home.MenuRegister();
				//Register 
				break;
			}
		}

		//

	}
}