package org.kelompok4.app.Presenter;

import org.kelompok4.app.Controller.RegisterController;
import org.kelompok4.app.Interface.ICanRun;

public class RegisterPresenter extends ContinuePresenter implements ICanRun {
    RegisterController registerController;

    public RegisterPresenter(RegisterController registerController) {
        this.registerController = registerController;
    }

    public RegisterController getRegisterController() {
        return registerController;
    }

    public void setRegisterController(RegisterController registerController) {
        this.registerController = registerController;
    }

    @Override
    public void run() {
        boolean failed = true;
        registerController.clearScreen();
        registerController.getView().printRegisterPage();
        //do while untuk regex NoKTP
        do {
            //saat pertama kali tidak muncul pesan gagal
            if (failed == false) {
                registerController.getView().failedValidateNoKTP();
            }
            registerController.getView().printNoKTP();
            registerController.setNoKTP(sc.nextLine());
            failed = registerController.validateNoKTP();
        } while (failed == false);

        //do while untuk regex Nama
        do {
            //saat pertama kali tidak muncul pesan gagal
            if (failed == false) {
                registerController.getView().failedValidateNama();
            }
            registerController.getView().printNamaLengkap();
            registerController.setName(sc.nextLine());
            failed = registerController.validateName();
        } while (failed == false);

        //do while untuk regex NoHP
        do {
            //saat pertama kali tidak muncul pesan gagal
            if (failed == false) {
                registerController.getView().failedValidateNoHP();
            }
            registerController.getView().printNoHp();
            registerController.setNoHP(sc.nextLine());
            failed = registerController.validateNoHP();
        } while (failed == false);

        //do while untuk regex email
        do {
            //saat pertama kali tidak muncul pesan gagal
            if (failed == false) {
                registerController.getView().failedValidateEmail();
            }
            registerController.getView().printEmail();
            registerController.setEmail(sc.nextLine());
            failed = registerController.validateEmail();
        } while (failed == false);

        //do while untuk regex password
        boolean failed_re = true;
        do {
            //saat pertama kali tidak muncul pesan gagal
            if (failed == false) {
                registerController.getView().failedValidatePassword();
            }
            registerController.getView().printPassword();
            registerController.setPassword(sc.nextLine());
            failed = registerController.validatePassword();
            if (failed == true) {
                registerController.getView().printRePassword();
                failed_re = registerController.validateRePassword(sc.nextLine());
                if (failed_re == false) {
                    registerController.getView().failedValidateRePassword();
                }
            }
        } while (failed == false||failed_re == false);
        //view setelah interaksi user
        registerController.updateRegister();
        registerController.registerResult(registerController.register());
        registerController.create();
        //mencegah leaking
        pressEnterKey();
    }
}
