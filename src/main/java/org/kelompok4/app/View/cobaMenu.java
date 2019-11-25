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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;
// import static org.apache.commons.lang3.time.DateUtils.addDays;

public class cobaMenu{
	Scanner s = new Scanner(System.in);

	public void mainDisplay() throws IOException, ParseException{ 

		//Tampilan Home
		System.out.println("********************************************************************************************************************");
		System.out.println("                                           SYSTEM TRAIN TICKET BOOKING                                              ");
		System.out.println("********************************************************************************************************************");
		System.out.println("1. Login");
		System.out.println("2. Register Customer");
		System.out.println(" ");
		System.out.println("Pilih Menu : ");

		int input=s.nextInt();
		if (input!=1 && input!=2){
            System.out.println("Pilihan Menu Salah. Silakan Ulang Kembali");
            this.mainDisplay();
        }
        if (input==0){
            System.exit(0);
        } else {
            this.Login();
        }
	}



}