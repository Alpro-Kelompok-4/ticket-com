package kelompok2;
import java.util.Scanner;
class Viewregister{
	Modeluser user = new Modeluser();
	private String repassword;
	Viewregister(){

	}
	public void run() {
		Scanner s = new Scanner(System.in);
		System.out.println("#REGISTER SISTEM#");
		System.out.println("");
		System.out.println("");
		System.out.print("Nomor KTP : ");
        this.user.setNoKTP(s.next());
        System.out.flush();
        System.out.print("Nama Lengkap : ");
        this.user.setNama(s.next());
        // this.user.setPassword(s.next());
        System.out.flush();
        System.out.print("Nomor Handphone : ");
        this.user.setNoHP(s.next());
        System.out.flush();
        System.out.print("Email : ");
        this.user.setEmail(s.next());
        System.out.flush();
        System.out.print("Password : ");
        this.user.setPassword(s.next());
        System.out.flush();
        System.out.print("Re-Password : ");
        System.out.flush();
        this.setRepassword(s.next());
	}
	public Modeluser getUser(){
		return this.user;
	}
	public getRepassword(){
		return this.repassword;
	}
	public setRepassword(String repassword){
		this.repassword = repassword;
	}
}
