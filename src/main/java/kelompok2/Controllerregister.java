package kelompok2;
import java.util.Scanner;
class Controllerregister {
	Viewlogin v = new Viewlogin();
	Modeluser user = new Modeluser();
	
	Controllerregister(){
		// v.run();
	}
	public void run(){
		v.run();
	}
	//untuk pengecekan user dan password
	public boolean register(){
		if(v.getEmail().equals("erwin@gmail.com") && v.getEmail().equals("123")){
			return true;
		}else{
			return false;
		}
	}
}