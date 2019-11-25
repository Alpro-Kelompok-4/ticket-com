/*
 * To change this license header, Pilih License Headers in Project Properties.
 * To change this template file, Pilih Tools | Templates
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

public class MenuView{

	public static void main(String args[]){


        public void HeaderMenu(){
        System.out.println("********************************************************************************************************************");
		System.out.println("                                                    TICKET.COM                                                      ");
		System.out.println("********************************************************************************************************************");
        }
        //Tampilan Home
		
		public void MenuHome(){
            System.out.println("1. Login");
            System.out.println("2. Register Customer");
            System.out.println(" ");
            System.out.println("Pilih Menu :");
        }
    
        public void MenuRegistration(){
            System.out.println("#REGISTER SISTEM#");
            System.out.println("Nomor KTP        :");
            System.out.println("Nama Lengkap     :");
            System.out.println("Nomor Handphone  :");
            System.out.println("Email            :");
            System.out.println("Password         :");
            System.out.println("Re-Password      :");
            System.out.println(" ");
        }

        public void MenuLogin(){
            System.out.println("#LOGIN SISTEM#");
            System.out.println("Email     : ");
		    System.out.println("Password  : ");
            System.out.println(" ");
        }

        public void MenuAdmin(){
            //Tampilan Menu Admin
            System.out.println("#MENU ADMIN#");
            System.out.println("WELCOME ........");
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
            System.out.println("#MENU CUSTOMER#");
            System.out.println("WELCOME .......");
            System.out.println("1. Booking Tiket ");
            System.out.println("2. Kelola Profile ");
            System.out.println("3. History Pembelian ");
            System.out.println("0. Logout ");
            System.out.println(" ");
        }
        
        public void MenuManageAcountAdmin(){
            System.out.println("#KELOLA AKUN BY ADMIN#");
		    System.out.println("Masukkan Nomor KTP  : ");//Inputan 
		    System.out.println(" ");
		    System.out.println(" ----------- DATA CUSTOMER ----------- ");
		    System.out.println(" ");
		    System.out.println("Nama Lengkap      :");
		    System.out.println("Nomor Handphone   :");
		    System.out.println("Email             :");
		    System.out.println("Password          :");
		    System.out.println(" ");
		    System.out.println(" --------- UBAH DATA CUSTOMER --------- ");
		    System.out.println("Nama Lengkap      :");
		    System.out.println("Nomor Handphone   :");
		    System.out.println("Email             :");
		    System.out.println("Password          :");
		    System.out.println(" ");
		    System.out.println("--------DATA BERHASIL DIUPDATE, BERIKUT DATA TERBARU------- ");
		    System.out.println("Nomor KTP  :");
		    System.out.println("Nama Lengkap      :");
		    System.out.println("Nomor Handphone   :");
		    System.out.println("Email             :");
		    System.out.println("Password          :");
		    System.out.println(" ");    
        }

        public void ManageProfil(){
            System.out.println("#KELOLA PROFILE BY PENUMPANG#");
            System.out.println(" ----------- DATA CUSTOMER ----------- ");
            System.out.println(" ");
            System.out.println("Nama Lengkap      :");
            System.out.println("Nomor Handphone   :");
            System.out.println("Email             :");
            System.out.println("Password          :");
            System.out.println(" ");
            System.out.println(" --------- UBAH DATA CUSTOMER --------- ");
            System.out.println("Nama Lengkap      :");
            System.out.println("Nomor Handphone   :");
            System.out.println("Email             :");
            System.out.println("Password          :");
            System.out.println(" ");
            System.out.println("--------DATA BERHASIL DIUPDATE, BERIKUT DATA TERBARU------- ");
            System.out.println("Nomor KTP  :");
            System.out.println("Nama Lengkap      :");
            System.out.println("Nomor Handphone   :");
            System.out.println("Email             :");
            System.out.println("Password          :");
            System.out.println(" ");
        }


}