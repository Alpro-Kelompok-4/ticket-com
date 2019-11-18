package org.kelompok4.app;
public class LoginView {

	public LoginView(){

	}
	public void printLoginPage() {
		System.out.println("#LOGIN SISTEM#");
		System.out.println("");
		System.out.println("");

	}

	public void printEmail() {
		System.out.print("Email : ");
		System.out.flush();
	}

	public void printEmail(String email) {
		System.out.print("Email : " + email);
		System.out.println("");
		System.out.flush();
	}

	public void printPassword() {
		System.out.print("Password : ");
		System.out.flush();
	}

	public void printPassword(String password) {
		System.out.print("Password : " + password);
		System.out.println("");
		System.out.flush();
	}

	public void failedValidate(){
		System.out.println("Email yang Anda masukan salah!");
		System.out.flush();
	}
}
