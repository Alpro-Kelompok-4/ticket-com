package org.kelompok4.app;


import org.kelompok4.app.Controller.CustomerController;
import org.kelompok4.app.Controller.LoginController;
import org.kelompok4.app.Controller.RegisterController;
import org.kelompok4.app.Model.UserModel;
import org.kelompok4.app.View.RegisterView;

import java.io.IOException;
import java.util.Scanner;

public class Driver {
    Scanner scanner = new Scanner(System.in);

    public Driver() {
    }

    public boolean login(LoginController loginController) throws IOException, InterruptedException {
        boolean failed = true;

        loginController.clearScreen();
        loginController.getView().printLoginPage();
        //do while untuk regex email
        do {
            //saat pertama kali tidak muncul pesan gagal
            if (failed == false) {
                loginController.getView().failedValidate();
            }
            loginController.getView().printEmail();
            loginController.setLoginEmail(scanner.nextLine());
            failed = loginController.validateEmail();
        } while (failed == false);

        loginController.getView().printPassword();
        loginController.setLoginPassword(scanner.nextLine());
        //view setelah interaksi user
        loginController.updateView();
        
        //mencegah leaking
        scanner.close();

        return loginController.auth();
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
            registerController.setNoKTP(scanner.nextLine());
            failed = registerController.validateNoKTP();
        } while (failed == false);

        //do while untuk regex Nama
        do {
            //saat pertama kali tidak muncul pesan gagal
            if (failed == false) {
                registerView.failedValidateNama();
            }
            registerView.printNamaLengkap();
            registerController.setName(scanner.nextLine());
            failed = registerController.validateName();
        } while (failed == false);

        //do while untuk regex NoHP
        do {
            //saat pertama kali tidak muncul pesan gagal
            if (failed == false) {
                registerView.failedValidateNoHP();
            }
            registerView.printNoHp();
            registerController.setNoHP(scanner.nextLine());
            failed = registerController.validateNoHP();
        } while (failed == false);

        //do while untuk regex email
        do {
            //saat pertama kali tidak muncul pesan gagal
            if (failed == false) {
                registerView.failedValidateEmail();
            }
            registerView.printEmail();
            registerController.setEmail(scanner.nextLine());
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
            registerController.setPassword(scanner.nextLine());
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
    public void updateinfouser(CustomerController customerController, UserModel userModel, RegisterView registerView) throws IOException, InterruptedException {
        boolean failed = true;
//        customerController.clearScreen();
        registerView.printUpdatePageCustomer();
        customerController.showInfoUser();
        //do while untuk regex NoKTP
        registerView.printChangeInfoUser();

        //do while untuk regex Nama
        do {
            //saat pertama kali tidak muncul pesan gagal
            if (failed == false) {
                registerView.failedValidateNama();
            }
            registerView.printNamaLengkap();
            customerController.setName(scanner.nextLine());
            failed = customerController.validateName();
        } while (failed == false);

        //do while untuk regex NoHP
        do {
            //saat pertama kali tidak muncul pesan gagal
            if (failed == false) {
                registerView.failedValidateNoHP();
            }
            registerView.printNoHp();
            customerController.setNoHP(scanner.nextLine());
            failed = customerController.validateNoHP();
        } while (failed == false);

        //do while untuk regex email
        do {
            //saat pertama kali tidak muncul pesan gagal
            if (failed == false) {
                registerView.failedValidateEmail();
            }
            registerView.printEmail();
            customerController.setEmail(scanner.nextLine());
            failed = customerController.validateEmail();
        } while (failed == false);

        //do while untuk regex password
        do {
            //saat pertama kali tidak muncul pesan gagal
            if (failed == false) {
                registerView.failedValidatePassword();
            }
            registerView.printPassword();
            customerController.setPassword(scanner.nextLine());
            failed = customerController.validatePassword();
        } while (failed == false);
        //view setelah interaksi user
        customerController.updateInfoUserResult();
        //mencegah leaking
        scanner.close();
    }

}
