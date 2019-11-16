package org.kelompok4.app;

public class LoginModel {
	private String email;
	private String password;

	public LoginModel(String email, String password){
		this.email = email;
		this.password = password;
	}

	public LoginModel() {

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