package kelompok4;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public Main(){

	}
	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner scanner = new Scanner(System.in);

		//instansiasi objek objek

		LoginModel model = new LoginModel(null, null);
		LoginView view = new LoginView();
		LoginController controller = new LoginController(model, view);

		//view awal
		view.printLoginPage();
		view.printEmailPrompt();
		controller.setLoginEmail(scanner.nextLine());
		view.printPasswordPrompt();
		controller.setLoginPassword(scanner.nextLine());

		//view setelah interaksi user
		controller.updateView();

	}
}
