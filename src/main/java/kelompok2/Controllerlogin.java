package kelompok2;
import java.util.Scanner;
class Controllerlogin {
	Viewlogin v = new Viewlogin();
	Modeluser user = new Modeluser();
	
	Controllerlogin(){
		// v.run();
	}
	public void run(){
		v.run();
	}
	//untuk pengecekan user dan password
	public boolean auth(){
		if(v.getEmail().equals("erwin@gmail.com") && v.getEmail().equals("123")){
			return true;
		}else{
			return false;
		}
	}
}