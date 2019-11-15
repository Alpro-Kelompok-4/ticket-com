class Login{
	private String email;
	private String password;
	Login(String email,String password){
		this.email = email;
		this.password = password;
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