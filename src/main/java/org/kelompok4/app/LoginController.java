package org.kelompok4.app;
import java.util.Scanner;

public class LoginController implements ICanLoginByEmail, ICanAuthByPassword, ICanValidateLogin {
	/*kelompok2.Viewlogin v = new kelompok2.Viewlogin();
	UserModel user = new UserModel();*/

	LoginModel model;
	LoginView view;
	



	
	public LoginController(LoginModel model,LoginView view){
		this.model = model;
		this.view = view;

	}

	@Override
	public String getLoginPassword() {
		return model.getPassword();
	}

	@Override
	public void setLoginPassword(String password) {
		model.setPassword(password);
	}


	@Override
	public String getLoginEmail() {
		return model.getEmail();
	}

	@Override
	public void setLoginEmail(String email) {
		model.setEmail(email);
	}

	@Override
	public boolean validateEmail() {
		return ICanValidateLogin.EMAIL_ADDRESS_REGEX.matcher(getLoginEmail()).find();
	}



	//untuk pengecekan user dan password

	public boolean auth(){
		if(getLoginEmail().equals("erwin@gmail.com") && getLoginPassword().equals("123")){
			return true;
		}else{
			return false;
		}
	}

	public void authResult() {
		if (auth()) {
			System.out.println("Login Sukses");
		}
		else {
			System.out.println("Login Gagal");
		}
	}



	public void updateView () {
		clearScreen();
		view.printLoginPage();
		view.printEmail(this.getLoginEmail());
		view.printPassword(this.getLoginPassword());
		authResult();
	}


	public void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}


}