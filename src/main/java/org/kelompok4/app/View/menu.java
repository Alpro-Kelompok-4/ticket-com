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

public class menu{

	public static void main(String args[]){


		//Tampilan Home
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                    TICKET.COM                                                      ");
		System.out.println("********************************************************************************************************************");
		System.out.println("1. Login");
		System.out.println("2. Register Customer");
		System.out.println(" ");


		//1. Tampilan Register Penumpang 
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


		//2. Tampilan Login
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                      LOGIN                                                         ");
		System.out.println("********************************************************************************************************************");
		System.out.println("Email     : ");
		System.out.println("Password  : ");
		System.out.println(" ");


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


		//3. Tampilan Manage Account
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
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


		//Tampilan Manage Profil
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
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


		//4. Tampilan Manage City
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#KELOLA KOTA#");
		System.out.println("1.  Tambah Data Kota ");
		System.out.println("2.  Lihat Data Kota ");
		System.out.println("3.  Edit Data Kota ");
		System.out.println("4.  Delete Data Kota ");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");
		//Tampilan Add City
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#TAMBAH DATA KOTA#");
		System.out.println("Tambah Kota : ");//Inputan contoh JKT Jakarta (Kode_Kota <spasi> Nama Kota)
		System.out.println("********************************************************************************************************************");
		System.out.println("Kota Berhasil Ditambahkan / Kota Gagal Ditambahkan");//Status penambahan data
		System.out.println(" ");
		System.out.println("1.  Tambah Data Kota ");
		System.out.println("2.  Lihat Data Kota ");
		System.out.println("3.  Edit Data Kota ");
		System.out.println("4.  Delete Data Kota ");
		System.out.println("99. Main Menu ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");
		//Tampilan View City
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#LIHAT DATA KOTA#");
		System.out.println("Data Lengkap Kota");
		System.out.println("********************************************************************************************************************");
		System.out.println("NO.        KODE          NAMA");
		System.out.println("1           JKT         JAKARTA");//Tampilan array of city 
		System.out.println("2           BDG         BANDUNG");//Tampilan array of city 
		System.out.println("********************************************************************************************************************");
		System.out.println(" ");
		System.out.println("1.  Tambah Data Kota ");
		System.out.println("2.  Lihat Data Kota ");
		System.out.println("3.  Edit Data Kota ");
		System.out.println("4.  Delete Data Kota ");
		System.out.println("99. Main Menu ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");
		//Tampilan Edit City
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#EDIT DATA KOTA#");
		System.out.println("Data Lengkap Kota");
		System.out.println("********************************************************************************************************************");
		System.out.println("NO.        KODE          NAMA");
		System.out.println("1           JKT         JAKARTA");//Tampilan array of city 
		System.out.println("2           BDG         BANDUNG");//Tampilan array of city 
		System.out.println("********************************************************************************************************************");
		System.out.println(" ");
		System.out.println("Edit Kota : "); //EDIT_KodeKota (Contoh:EDIT_JKT)
		System.out.println("Kode Kota      : "); //JKRT
		System.out.println("Nama Kota     : "); //JAKARTA
		System.out.println(" ");
		System.out.println("1.  Tambah Data Kota ");
		System.out.println("2.  Lihat Data Kota ");
		System.out.println("3.  Edit Data Kota ");
		System.out.println("4.  Delete Data Kota ");
		System.out.println("99. Main Menu ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");
		//Tampilan Delete City
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#DELETE DATA KOTA#");
		System.out.println("Data Lengkap Kota");
		System.out.println("********************************************************************************************************************");
		System.out.println("NO.        KODE          NAMA");
		System.out.println("1           JKT         JAKARTA");//Tampilan array of city 
		System.out.println("2           BDG         BANDUNG");//Tampilan array of city 
		System.out.println("********************************************************************************************************************");
		System.out.println(" ");
		System.out.println("Delete Data Kota : "); //DELETE_KodeKota (Contoh:DELETE_JKT)
		System.out.println(" ");
		System.out.println("1.  Tambah Data Kota ");
		System.out.println("2.  Lihat Data Kota ");
		System.out.println("3.  Edit Data Kota ");
		System.out.println("4.  Delete Data Kota ");
		System.out.println("99. Main Menu ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");


		//5. Tampilan data rute dan harga tiket 
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#KELOLA DATA RUTE#");
		System.out.println("1.  Tambah Data Rute ");
		System.out.println("2.  Lihat Data Rute ");
		System.out.println("3.  Edit Data Rute ");
		System.out.println("4.  Delete Data Rute ");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");
		//Tampilan Add Route
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#TAMBAH DATA RUTE#");
		System.out.println("Tambah Data Rute :  ");//Inputan contoh Bandung Surabaya 450000 400000
		System.out.println("Rute Berhasil Ditambahkan / Rute Gagal Ditambahkan");//Status penambahan data
		System.out.println(" ");
		System.out.println("1.  Tambah Data Rute ");
		System.out.println("2.  Lihat Data Rute ");
		System.out.println("3.  Edit Data Rute ");
		System.out.println("4.  Delete Data Rute ");
		System.out.println("99. Main Menu ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");
		//Tampilan View Route
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#LIHAT DATA RUTE#");	
		System.out.println("Data Lengkap Rute Kereta Api");	
		System.out.println("********************************************************************************************************************");
		System.out.println("NO.   KEBERANGKATAN    TUJUAN    KODE RUTE    BISNIS    PREMIUM");
		System.out.println("1        Jakarta       Bandung    JKT-BDG     150.000   100.000");//Tampilan array of route
		System.out.println("2        Jakarta       Bogor      JKT-BGR     150.000   100.000");//Tampilan array of route
		System.out.println("********************************************************************************************************************");
		System.out.println(" ");
		System.out.println("1.  Tambah Data Rute ");
		System.out.println("2.  Lihat Data Rute ");
		System.out.println("3.  Edit Data Rute ");
		System.out.println("4.  Delete Data Rute ");
		System.out.println("99. Main Menu ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");
		//Tampilan Edit Route
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#EDIT DATA RUTE#");	
		System.out.println("Data Lengkap Rute Kereta Api");	
		System.out.println("********************************************************************************************************************");
		System.out.println("NO.   KEBERANGKATAN    TUJUAN    KODE RUTE    BISNIS    PREMIUM");
		System.out.println("1        Jakarta       Bandung    JKT-BDG     150.000   100.000");//Tampilan array of route
		System.out.println("2        Jakarta       Bogor      JKT-BGR     150.000   100.000");//Tampilan array of route
		System.out.println("********************************************************************************************************************");
		System.out.println("EDIT RUTE	    : "); 
		System.out.println(" ");
		System.out.println("1.  Tambah Data Rute ");
		System.out.println("2.  Lihat Data Rute ");
		System.out.println("3.  Edit Data Rute ");
		System.out.println("4.  Delete Data Rute ");
		System.out.println("99. Main Menu ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");
		//Tampilan Delete Route
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#DELETE DATA RUTE#");	
		System.out.println("Data Lengkap Rute Kereta Api");	
		System.out.println("********************************************************************************************************************");
		System.out.println("NO.   KEBERANGKATAN    TUJUAN    KODE RUTE    BISNIS    PREMIUM");
		System.out.println("1        Jakarta       Bandung    JKT-BDG     150.000   100.000");//Tampilan array of route
		System.out.println("2        Jakarta       Bogor      JKT-BGR     150.000   100.000");//Tampilan array of route
		System.out.println("********************************************************************************************************************");
		System.out.println(" ");
		System.out.println("DELETE : "); //DELETE_KodeRute (Contoh:DELETE_JKT-BDG)
		System.out.println(" ");
		System.out.println("1.  Tambah Data Rute ");
		System.out.println("2.  Lihat Data Rute ");
		System.out.println("3.  Edit Data Rute ");
		System.out.println("4.  Delete Data Rute ");
		System.out.println("99. Main Menu ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");


		//6. Tampilan data stasiun
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#KELOLA DATA STASIUN#");
		System.out.println("1.  Tambah Data Stasiun ");
		System.out.println("2.  Lihat Data Stasiun ");
		System.out.println("3.  Edit Data Stasiun ");
		System.out.println("4.  Delete Data Stasiun ");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");
		//Tampilan Add Route
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#TAMBAH DATA STASIUN#");
		System.out.println("Tambah Data Stasiun : ");//Inputan BDG BANDUNG
		System.out.println("Stasiun Berhasil Ditambahkan / Stasiun Gagal Ditambahkan");//Status penambahan data
		System.out.println(" ");
		System.out.println("1.  Tambah Data Stasiun ");
		System.out.println("2.  Lihat Data Stasiun ");
		System.out.println("3.  Edit Data Stasiun ");
		System.out.println("4.  Delete Data Stasiun ");
		System.out.println("99. Main Menu ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");
		//Tampilan View Station
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#LIHAT DATA STASIUN#");
		System.out.println("Data Lengkap Stasiun");
		System.out.println("********************************************************************************************************************");
		System.out.println("NO.     KODE STASIUN    NAMA    ");
		System.out.println("1          BDG         Bandung  ");//Tampilan array of station
		System.out.println("2          BGR         Bogor    ");//Tampilan array of station
		System.out.println("********************************************************************************************************************");
		System.out.println(" ");
		System.out.println("1.  Tambah Data Stasiun ");
		System.out.println("2.  Lihat Data Stasiun ");
		System.out.println("3.  Edit Data Stasiun ");
		System.out.println("4.  Delete Data Stasiun ");
		System.out.println("99. Main Menu ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");
		//Tampilan Edit Station
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#EDIT DATA STASIUN#");
		System.out.println("Data Lengkap Stasiun");
		System.out.println("********************************************************************************************************************");
		System.out.println("NO.     KODE STASIUN    NAMA    ");
		System.out.println("1          BDG         Bandung  ");//Tampilan array of station
		System.out.println("2          BGR         Bogor    ");//Tampilan array of station
		System.out.println("********************************************************************************************************************");
		System.out.println("Edit Stasiun    : "); 
		System.out.println(" ");
		System.out.println("1.  Tambah Data Stasiun ");
		System.out.println("2.  Lihat Data Stasiun ");
		System.out.println("3.  Edit Data Stasiun ");
		System.out.println("4.  Delete Data Stasiun ");
		System.out.println("99. Main Menu ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");
		//Tampilan Delete Station
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#DELETE DATA STASIUN#");
		System.out.println("Data Lengkap Stasiun");
		System.out.println("********************************************************************************************************************");
		System.out.println("NO.     KODE STASIUN    NAMA    ");
		System.out.println("1          BDG         Bandung  ");//Tampilan array of station
		System.out.println("2          BGR         Bogor    ");//Tampilan array of station
		System.out.println("********************************************************************************************************************");
		System.out.println(" ");
		System.out.println("Delete Stasiun : "); //DELETE_KodeRute (Contoh:DELETE_JKT-BDG)
		System.out.println(" ");
		System.out.println("1.  Tambah Data Stasiun ");
		System.out.println("2.  Lihat Data Stasiun ");
		System.out.println("3.  Edit Data Stasiun ");
		System.out.println("4.  Delete Data Stasiun ");
		System.out.println("99. Main Menu ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");


		//7.Tampilan Mengelola stasiun yang dilewati berdasarkan rute
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#KELOLA STASIUN BERDASARKAN RUTE#");
		System.out.println("Kode Rute : ");
		System.out.println("Stasiun Awal Sampai Stasiun Akhir : ");		
		System.out.println("Jalur 1 : Gambir Jatinegara 20 ");//array
		System.out.println("Jalur 2 : Jatinegara Bekasi 40 ");//array
		System.out.println("Jalur 3 : 99 ");	
		System.out.println("********************************************************************************************************************");
		System.out.println("Jalur Stasiun Yang dilewati berdasarkan Rute Berhasil Ditambahkan");//Status penambahan data	
		System.out.println("********************************************************************************************************************");
		System.out.println(" ");
		System.out.println("1. Tambah Jalur Stasiun Pada Rute ");
		System.out.println("2. Lihat Jalur Stasiun Pada Rute ");
		System.out.println("3. Delete Jalur Stasiun Pada Rute ");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");
		//Tampilan View section stasiun yang dilewati berdasarkan rute
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#LIHAT STASIUN BERDASARKAN RUTE#");
		System.out.println("Kode Rute : ");
		System.out.println("Stasiun Awal Sampai Stasiun Akhir : ");	
		System.out.println("********************************************************************************************************************");
		System.out.println("NO    SECTION CODE    ROUTE CODE  SECTION   DURATION");	
		System.out.println("1       JL01           JKT-BKS    GBR-JTR      60");
		System.out.println("2                                 JTR-BKS        ");
		System.out.println("********************************************************************************************************************");
		System.out.println(" ");
		System.out.println("1. Tambah Jalur Stasiun Pada Rute ");
		System.out.println("2. Lihat Jalur Stasiun Pada Rute ");
		System.out.println("3. Delete Jalur Stasiun Pada Rute ");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");	
		//Tampilan Delete Station
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#LIHAT STASIUN BERDASARKAN RUTE#");
		System.out.println("Kode Rute : ");
		System.out.println("Stasiun Awal Sampai Stasiun Akhir : ");	
		System.out.println("********************************************************************************************************************");
		System.out.println("NO    SECTION CODE    ROUTE CODE  SECTION   DURATION");	
		System.out.println("1       JL01           JKT-BKS    GBR-JTR      60");
		System.out.println("2                                 JTR-BKS        ");
		System.out.println("********************************************************************************************************************");
		System.out.println(" ");
		System.out.println("Delete Rute : "); 
		System.out.println(" ");
		System.out.println("1. Tambah Jalur Stasiun Pada Rute ");
		System.out.println("2. Lihat Jalur Stasiun Pada Rute ");
		System.out.println("3. Delete Jalur Stasiun Pada Rute ");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");	

		//8.Tampilan Data Kereta Api
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#KELOLA DATA KERETA API#");
		System.out.println("1. Tambah Data Kereta Api ");
		System.out.println("2. Lihat Data Kereta Api ");
		System.out.println("3. Edit Data Kereta Api ");
		System.out.println("4. Delete Data Kereta Api ");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");
		//Tampilan Add Kereta 
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("Tambah Data Kereta Api : ");	//KAI190801 ‘Kereta Api I Bulan 8 Tahun 2019’ G6 B2 P4	
		System.out.println(" ");
		System.out.println("********************************************************************************************************************");
		System.out.println("Kereta Api Berhasil Ditambahkan / Kereta Api Gagal Ditambahkan");//Status penambahan data	
		System.out.println(" ");
		System.out.println("1. Tambah Data Kereta Api ");
		System.out.println("2. Lihat Data Kereta Api ");
		System.out.println("3. Edit Data Kereta Api ");
		System.out.println("4. Delete Data Kereta Api ");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");
		//Tampilan View Kereta 
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#LIHAT DATA KERETA API#");
		System.out.println("Data Lengkap Kereta Api");
		System.out.println("********************************************************************************************************************");
		System.out.println("NO    KODE KAI       NAMA KAI               GERBONG   BUSINESS  PREMIUM");	
		System.out.println("1     KAI190801    Kereta API I                6          2         4  ");
		System.out.println("                   Bulan 8 Tahun 2018                                  ");
		System.out.println("********************************************************************************************************************");
		System.out.println(" ");
		System.out.println("1. Tambah Data Kereta Api ");
		System.out.println("2. Lihat Data Kereta Api ");
		System.out.println("3. Edit Data Kereta Api ");
		System.out.println("4. Delete Data Kereta Api ");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");
		//Tampilan Edit Kereta 
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#EDIT DATA KERETA API#");
		System.out.println("Data Lengkap Kereta Api");
		System.out.println("********************************************************************************************************************");
		System.out.println("NO    KODE KAI       NAMA KAI               GERBONG   BUSINESS  PREMIUM");	
		System.out.println("1     KAI190801    Kereta API I                6          2         4  ");
		System.out.println("                   Bulan 8 Tahun 2018                                  ");
		System.out.println("********************************************************************************************************************");
		System.out.println(" ");
		System.out.println("Edit KAI  	    : "); 
		System.out.println(" ");
		System.out.println("1. Tambah Data Kereta Api ");
		System.out.println("2. Lihat Data Kereta Api ");
		System.out.println("3. Edit Data Kereta Api ");
		System.out.println("4. Delete Data Kereta Api ");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");
		//Tampilan Delete Kereta 
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#EDIT DATA KERETA API#");
		System.out.println("Data Lengkap Kereta Api");
		System.out.println("********************************************************************************************************************");
		System.out.println("NO    KODE KAI       NAMA KAI               GERBONG   BUSINESS  PREMIUM");	
		System.out.println("1     KAI190801    Kereta API I                6          2         4  ");
		System.out.println("                   Bulan 8 Tahun 2018                                  ");
		System.out.println("********************************************************************************************************************");
		System.out.println(" ");
		System.out.println("Delete Kerata     : "); 
		System.out.println(" ");
		System.out.println("1. Tambah Data Kereta Api ");
		System.out.println("2. Lihat Data Kereta Api ");
		System.out.println("3. Edit Data Kereta Api ");
		System.out.println("4. Delete Data Kereta Api ");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");

		//9. Tampilan Generate Data Waktu
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#GENERATE DATA WAKTU#");
		System.out.println("Apakah anda yakin untuk generate waktu (Y/N)? ");
		System.out.println("Generate Waktu Berhasil! ");
		System.out.println("********************************************************************************************************************");
		System.out.println("1. Lihat Data Waktu ");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");
		//Lihat Data Waktu
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#LIHAT DATA WAKTU#");
		System.out.println("Data Lengkap Waktu ");
		System.out.println("********************************************************************************************************************");
		System.out.println("NO    KODE WAKTU      WAKTU                 ");	
		System.out.println("1        TM1          00.00                 ");
		System.out.println("2        TM2          01.00                 ");
		System.out.println("********************************************************************************************************************");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");

		//10.Menambahkan waktu yang tersedia untuk rute kereta api
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#KELOLA WAKTU BERDASARKAN RUTE#");
		System.out.println("Kode Rute : ");
		System.out.println("Waktu Available Untuk Rute");
		System.out.println("********************************************************************************************************************");
		System.out.println("Time 1 : TM35 ");
		System.out.println("Time 2 : TM39 ");
		System.out.println("Time 3 : 99");
		System.out.println("********************************************************************************************************************");
		System.out.println("Waktu Untuk Rute Berhasil Ditambahkan");
		System.out.println("********************************************************************************************************************");
		System.out.println(" ");
		System.out.println("1. Tambah Waktu Pada Rute ");
		System.out.println("2. Lihat Waktu Pada Rute ");
		System.out.println("3. Delete Waktu Pada Rute ");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");
		//Lihat Data Waktu Berdasarkan Rute
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#LIHAT WAKTU BERDASARKAN RUTE#");
		System.out.println("Kode Rute ");
		System.out.println("Waktu Available Untuk Rute");
		System.out.println("********************************************************************************************************************");
		System.out.println("NO    KODE WAKTU    KODE RUTE   WAKTU TERSEDIA RUTE              ");	
		System.out.println("1        TM1         JKT-BDG        - 08.00                      ");
		System.out.println("		                            - 09.00                      ");
		System.out.println("********************************************************************************************************************");
		System.out.println(" ");
		System.out.println("1. Tambah Waktu Pada Rute ");
		System.out.println("2. Lihat Waktu Pada Rute ");
		System.out.println("3. Delete Waktu Pada Rute ");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");

		//11.Menambahkan kereta api untuk rute tertentu
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#KELOLA KERETA API BERDASARKAN RUTEE#");
		System.out.println("Kode Rute : ");
		System.out.println("Kereta Api Untuk Rute");
		System.out.println("********************************************************************************************************************");
		System.out.println("Kereta 1 : KAI18801 ");
		System.out.println("Kereta 2 : KAI18802 ");
		System.out.println("Kereta 3 : 99");
		System.out.println("********************************************************************************************************************");
		System.out.println("Kereta Api Untuk Rute Berhasil Ditambahkan");
		System.out.println("********************************************************************************************************************");
		System.out.println(" ");
		System.out.println("1. Tambah Kereta Pada Rute ");
		System.out.println("2. Lihat Kereta Pada Rute ");
		System.out.println("3. Delete Kereta Pada Rute ");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");
		//Lihat Data Kereta Berdasarkan Rute
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#LIHAT KERETA BERDASARKAN RUTE#");
		System.out.println("Kode Rute ");
		System.out.println("Kereta Api Berdasarkan Rute");
		System.out.println("********************************************************************************************************************");
		System.out.println("NO    KODE KERETA RUTE    KODE RUTE   KERETA TERSEDIA TERSEDIA RUTE         ");	
		System.out.println("1        KR01               JKT-BDG         - KAI18801                      ");
		System.out.println("		                                    - KAI18802                      ");
		System.out.println("********************************************************************************************************************");
		System.out.println(" ");
		System.out.println("1. Tambah Waktu Pada Rute ");
		System.out.println("2. Lihat Waktu Pada Rute ");
		System.out.println("3. Delete Waktu Pada Rute ");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");

		//12.Generate Jadwal Kereta Api
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#GENERATE JADWAL KERETA API##");
		System.out.println("Apakah anda yakin untuk generate Jadwal (Y/N)? ");
		System.out.println("Generate Jadwal Kereta Api Berhasil! ");
		System.out.println("********************************************************************************************************************");
		System.out.println("1. Lihat Jadwal Kereta Api ");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");
		//Lihat Jadwal Kereta Api
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#LIHAT JADWAL KERETA API#");
		System.out.println("********************************************************************************************************************");
		System.out.println("KODE JADWAL     TANGGAL    WAKTU KEBERANGKATAN    KEBERANGKATAN    TUJUAN   WAKTU TIBA    KAI    STATUS             ");	
		System.out.println("");
		System.out.println("");
		System.out.println("********************************************************************************************************************");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");

		//13.Melakukan pencarian jadwal
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#CARI JADWAL KERETA API#");
		System.out.println("Keberangkatan :  ");
		System.out.println("Tujuan        :  ");
		System.out.println("Tanggal       :  ");
		System.out.println(" ");
		System.out.println("********************************************************************************************************************");
		System.out.println("KODE JADWAL     TANGGAL    WAKTU KEBERANGKATAN    KEBERANGKATAN    TUJUAN   WAKTU TIBA    KAI    STATUS             ");	
		System.out.println("");//array of jadwal
		System.out.println("");//array of jadwal
		System.out.println("********************************************************************************************************************");
		System.out.println("1. Booking Tiket ");
		System.out.println("99. Main Menu ");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");

		//14.Booking Ticket dan Pemilihan Tempat Duduk
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#BOOKING TICKET#");
		System.out.println("Kode Jadwal :  ");
		System.out.println("Jumlah      :  ");
		System.out.println("*******************************");
		System.out.println("Penumpang 1 :  ");// array of isian penumpang
		System.out.println("Penumpang 2 :  ");// array of isian penumpang
		System.out.println("********************************************************************************************************************");
		System.out.println("GERBONG BUSINESS 1           ");	
		System.out.println(" ________ ");//array of gerbong Business 1
		System.out.println("|________|");//array of gerbong Business 1
		System.out.println("GERBONG BUSINESS N           ");	
		System.out.println(" ________ ");//array of gerbong Business 2
		System.out.println("|________|");//array of gerbong Business 2
		System.out.println("********************************************************************************************************************");
		System.out.println("Pilih Kursi (Dengan Tanda E/Empty) : ");
		System.out.println("Kursi 1 : ");
		System.out.println("Kursi n : ");
		System.out.println("*******************************");
		System.out.println("Total Pembayaran = ");
		System.out.println("Kode Rekening    = ");
		System.out.println("*******************************");
		System.out.println("Pembayaran : ");
		System.out.println("99. Main Menu ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");

		//15.Melakukan pembayaran
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#PEMBAYARAN TIKET KERETA API#");
		System.out.println("Kode Rekening    :  ");
		System.out.println("Total Pembayaran :  ");
		System.out.println("Apakah data pembayaran sudah benar (Y/N)?");
		System.out.println("********************************************************************************************************************");
		System.out.println("Pembayaran Berhasil!");
		System.out.println("Kode Tiket Anda :");
		System.out.println("Penumpang 1 :");
		System.out.println("Penumpang n :");
		System.out.println("********************************************************************************************************************");
		System.out.println("99. Main Menu ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");

		//16.Melihat laporan pemasukan berdasarkan tiket yang dibeli penumpang
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#LAPORAN HARIAN PEMASUKAN#");
		System.out.println(" ");
		System.out.println("Masukkan Tanggal Pencarian : ");
		System.out.println(" ");
		System.out.println("Data Pemasukan Harian");
		System.out.println("********************************************************************************************************************");
		System.out.println("No    Tanggal    KAI   Jumlah Pendapatan");
		System.out.println("ARRAY OF PEMASUKAN ");
		System.out.println("Total Masukan Harian : ");
		System.out.println("********************************************************************************************************************");
		System.out.println("1. Laporan Bulanan ");
		System.out.println("2. Laporan Tahunan ");
		System.out.println("99. Main Menu ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");

		//Laporan Bulanan Pemasukan
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#LAPORAN BULANAN PEMASUKAN#");
		System.out.println(" ");
		System.out.println("Masukkan Bulan Pencarian : ");
		System.out.println(" ");
		System.out.println("Data Pemasukan Bulanan");
		System.out.println("********************************************************************************************************************");
		System.out.println("No    Tanggal    Jumlah Pendapatan");
		System.out.println("ARRAY OF PEMASUKAN ");
		System.out.println("Total Masukan Bulanan : ");
		System.out.println("********************************************************************************************************************");
		System.out.println("1. Laporan Harian ");
		System.out.println("2. Laporan Tahunan ");
		System.out.println("99. Main Menu ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");		

		//Laporan Tahunan Pemasukan
		System.out.println("********************************************************************************************************************");
		System.out.println("                                                       TICKET.COM                                                   ");
		System.out.println("********************************************************************************************************************");
		System.out.println("#LAPORAN TAHUNAN PEMASUKAN#");
		System.out.println(" ");
		System.out.println("Masukkan Tahun Pencarian : ");
		System.out.println(" ");
		System.out.println("Data Pemasukan Tahunan");
		System.out.println("********************************************************************************************************************");
		System.out.println("No    Bulan    Jumlah Pendapatan");
		System.out.println("ARRAY OF PEMASUKAN ");
		System.out.println("Total Masukan Tahunan : ");
		System.out.println("********************************************************************************************************************");
		System.out.println("1. Laporan Harian ");
		System.out.println("2. Laporan Bulanan ");
		System.out.println("99. Main Menu ");
		System.out.println("Pilih Menu : ");
		System.out.println(" ");		


	}
}