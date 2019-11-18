package org.kelompok4.app;

public class LoginController implements ICanLoginByEmail, ICanAuthByPassword {
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
		view.printEmailPrompt();
		System.out.println(getLoginEmail());
		view.printPasswordPrompt();
		System.out.println(getLoginPassword());
		authResult();

	}

	public void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}


}