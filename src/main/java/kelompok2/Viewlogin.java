package kelompok2;
import java.util.Scanner;
class Login{
	private String email;
	private String password;
	Login(){

	}
	public void setEmail(String email){
		this.email = email;
	}
	public void setPassword(String ps){
		this.password = ps;
	}
	public String getEmail(){
		return this.email;
	}
	public String getPassword(){
		return this.password;
	}
}
class Viewlogin extends Login{
	Scanner s = new Scanner(System.in);
	// Login login = new Login();
	Viewlogin(){

	}
	public void run() {
		System.out.println("#LOGIN SISTEM#");
		System.out.println("");
		System.out.println("");
		System.out.print("Email : ");
        System.out.flush();
        this.setEmail(s.next());
        System.out.print("Password : ");
        System.out.flush();
        this.setPassword(s.next());
        System.out.print(this.getEmail());
        System.out.print(this.getPassword());

	}
}
