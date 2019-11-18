package org.kelompok4.app;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    Scanner scanner = new Scanner(System.in);

    public Driver() {
    }

    public void login(LoginController loginController, LoginModel loginModel, LoginView loginView) throws IOException, InterruptedException {
        boolean failed = true;

        loginController.clearScreen();
        loginView.printLoginPage();
        //do while untuk regex email
        do {
            //saat pertama kali tidak muncul pesan gagal
            if (failed == false) {
                loginView.failedValidate();
            }
            loginView.printEmail();
            loginController.setLoginEmail(scanner.nextLine());
            failed = loginController.validateEmail();
        } while (failed == false);

        loginView.printPassword();
        loginController.setLoginPassword(scanner.nextLine());
        //view setelah interaksi user
        loginController.updateView();
        //mencegah leaking
        scanner.close();
    }

    public void register(RegisterController registerController, UserModel userModel, RegisterView registerView) throws IOException, InterruptedException {
        boolean failed = true;
        registerController.clearScreen();
        registerView.printRegisterPage();
        //do while untuk regex NoKTP
        do {
            //saat pertama kali tidak muncul pesan gagal
            if (failed == false) {
                registerView.failedValidateNoKTP();
            }
            registerView.printNoKTP();
            registerController.setRegisterNoKTP(scanner.nextLine());
            failed = registerController.validateNoKTP();
        } while (failed == false);

        //do while untuk regex Nama
        do {
            //saat pertama kali tidak muncul pesan gagal
            if (failed == false) {
                registerView.failedValidateNama();
            }
            registerView.printNamaLengkap();
            registerController.setRegisterName(scanner.nextLine());
            failed = registerController.validateName();
        } while (failed == false);

        //do while untuk regex NoHP
        do {
            //saat pertama kali tidak muncul pesan gagal
            if (failed == false) {
                registerView.failedValidateNoHP();
            }
            registerView.printNoHp();
            registerController.setRegisterNoHP(scanner.nextLine());
            failed = registerController.validateNoHP();
        } while (failed == false);

        //do while untuk regex email
        do {
            //saat pertama kali tidak muncul pesan gagal
            if (failed == false) {
                registerView.failedValidateEmail();
            }
            registerView.printEmail();
            registerController.setRegisterEmail(scanner.nextLine());
            failed = registerController.validateEmail();
        } while (failed == false);

        //do while untuk regex password
        boolean failed_re = true;
        do {
            //saat pertama kali tidak muncul pesan gagal
            if (failed == false) {
                registerView.failedValidatePassword();
            }
            registerView.printPassword();
            registerController.setRegisterPassword(scanner.nextLine());
            failed = registerController.validatePassword();
            if (failed == true) {
                registerView.printRePassword();
                failed_re = registerController.validateRePassword(scanner.nextLine());
                if (failed_re == false) {
                    registerView.failedValidateRePassword();
                }
            }
        } while (failed == false||failed_re == false);
        //view setelah interaksi user
        registerController.updateRegister();
        //mencegah leaking
        scanner.close();
    }

}
