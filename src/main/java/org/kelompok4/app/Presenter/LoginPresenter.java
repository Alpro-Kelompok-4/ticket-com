package org.kelompok4.app.Presenter;

import org.kelompok4.app.Controller.LoginController;
import org.kelompok4.app.Interface.ICanRun;

public class LoginPresenter extends ContinuePresenter implements ICanRun {
    private LoginController loginController;

    public LoginPresenter(LoginController loginController) {
        this.loginController = loginController;
    }

    public LoginController getLoginController() {
        return loginController;
    }

    public void setLoginController(LoginController loginController) {
        this.loginController = loginController;
    }


    @Override
    public void run() {
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
            loginController.setLoginEmail(sc.nextLine());
            failed = loginController.validateEmail();
        } while (failed == false);

        loginController.getView().printPassword();
        loginController.setLoginPassword(sc.nextLine());
        loginController.updateView();
        loginController.authResult(loginController.auth());
    }
    
}
