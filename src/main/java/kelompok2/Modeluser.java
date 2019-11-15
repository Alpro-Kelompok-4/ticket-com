package kelompok2;
class Modeluser{
	String email;
	String password;
	boolean isAdmin;
	String nama;
	String alamat;
	String noKTP;
	String noHP;

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
}