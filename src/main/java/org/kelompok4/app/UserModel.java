package org.kelompok4.app;
public class UserModel {
	private String email;
	private String password;
	private boolean isAdmin;
	private String nama;
	private String noKTP;
	private String noHP;
	public UserModel(String email, String password, String nama, String noKTP, String noHP){
		this.email = email;
		this.password = password;
		this.isAdmin = false;
		this.nama = nama;
		this.noHP = noHP;
		this.noKTP = noKTP;
	}

	public UserModel() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}


	public String getNoKTP() {
		return noKTP;
	}

	public void setNoKTP(String noKTP) {
		this.noKTP = noKTP;
	}

	public String getNoHP() {
		return noHP;
	}

	public void setNoHP(String noHP) {
		this.noHP = noHP;
	}

}