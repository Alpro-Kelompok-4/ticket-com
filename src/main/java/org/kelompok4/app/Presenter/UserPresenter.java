/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kelompok4.app.Presenter;

import org.kelompok4.app.Controller.UserController;
import org.kelompok4.app.Interface.ICanRun;

/**
 *
 * @author Rewingw
 */
public class UserPresenter extends ContinuePresenter implements ICanRun{
    UserController userController;

    public UserPresenter(UserController userController) {
        this.userController = userController;
    }
    
    public UserController getUserController() {
        return userController;
    }

    public void setUserController(UserController userController) {
        this.userController = userController;
    }

    @Override
    public void run() {
        boolean failed = true;
//        customerController.clearScreen();
        userController.getUserView().printUpdatePageCustomer();
        userController.showInfoUser();
        //do while untuk regex NoKTP
        userController.getUserView().printChangeInfoUser();

        //do while untuk regex Nama
        do {
            //saat pertama kali tidak muncul pesan gagal
            if (failed == false) {
                userController.getUserView().failedValidateNama();
            }
            userController.getUserView().printNamaLengkap();
            userController.setName(sc.nextLine());
            failed = userController.validateName();
        } while (failed == false);

        //do while untuk regex NoHP
        do {
            //saat pertama kali tidak muncul pesan gagal
            if (failed == false) {
                userController.getUserView().failedValidateNoHP();
            }
            userController.getUserView().printNoHp();
            userController.setNoHP(sc.nextLine());
            failed = userController.validateNoHP();
        } while (failed == false);

        //do while untuk regex email
        do {
            //saat pertama kali tidak muncul pesan gagal
            if (failed == false) {
                userController.getUserView().failedValidateEmail();
            }
            userController.getUserView().printEmail();
            userController.setEmail(sc.nextLine());
            failed = userController.validateEmail();
        } while (failed == false);

        //do while untuk regex password
        do {
            //saat pertama kali tidak muncul pesan gagal
            if (failed == false) {
                userController.getUserView().failedValidatePassword();
            }
            userController.getUserView().printPassword();
            userController.setPassword(sc.nextLine());
            failed = userController.validatePassword();
        } while (failed == false);
        //view setelah interaksi user
        userController.updateInfoUserResult();
    }
    
}
