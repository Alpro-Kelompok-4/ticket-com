package kelompok2;
class Modeluser{
	private String email;
	private String password;
	private boolean isAdmin;
	private String nama;
	private String alamat;
	private String noKTP;
	private String noHP;

	Modeluser(String email,String password,String nama,String alamat,String noKTP,String noHP){
		this.email = email;
		this.password = password;
		this.isAdmin = false;
		this.nama = nama;
		this.alamat = alamat;
		this.noHP = noHP;
		this.noKTP = noKTP;
	}
	Modeluser(){
		
	}
	public void setEmail(String email){
		this.email = email;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public void setIsAdmin(boolean isAdmin){
		this.isAdmin = isAdmin;
	}
	public void setNama(String nama){
		this.nama = nama;
	}
	public void setAlamat(String alamat){
		this.alamat = alamat;
	}
	public void setNoKTP(String noKTP){
		this.noKTP = noKTP;
	}
	public void setNoHP(String noHP){
		this.noHP = noHP;
	}

	public String getEmail(){
		return this.email;
	}
	public String getPassword(){
		return this.password;
	}
	public String getNama(){
		return this.nama;
	}
	public boolean getIsAdmin(){
		return this.isAdmin;
	}
	public String getAlamat(){
		return this.alamat;
	}
	public String getNoKTP(){
		return this.noKTP;
	}
	public String getNoHP(){
		return this.noHP;
	}
}