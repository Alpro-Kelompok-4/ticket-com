package kelompok2;
public class Viewmain {
	public Viewmain(){

	}
	public static void main(String[] args) {
		Controllerlogin c = new Controllerlogin();
		c.run();
		System.out.println(c.auth());
	}
}
