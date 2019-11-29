/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kelompok4.app.Controller;

import org.kelompok4.app.Interface.*;
import org.kelompok4.app.Model.UserModel;
import org.kelompok4.app.View.UserView;

public class UserController implements ICanRead, ICanUpdate, ICanValidateNoKTP, ICanValidateEmail, ICanValidateName, ICanValidatePassword {
    private UserModel userModel;
    private UserView userView;

    public UserController(UserModel userModel, UserView userView) {
        this.userModel = userModel;
        this.userView = userView;
    }

    

    @Override
    public void read() {


    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public UserView getUserView() {
        return userView;
    }

    public void setUserView(UserView userView) {
        this.userView = userView;
    }
    
    @Override
    public void update() {

    }

    public void manageByUser() {
        userView.printUpdatePageCustomer();
    }

    public void manageByAdmin() {
        userView.printUpdatePageAdmin();
    }


    @Override
    public boolean validateNoKTP() {
        return ICanValidateNoKTP.NoKTP_REGEX.matcher(userModel.getNoKTP()).find();
    }

    @Override
    public boolean validateEmail() {
        return ICanValidateEmail.EMAIL_ADDRESS_REGEX.matcher(userModel.getEmail()).find();
    }

    @Override
    public boolean validateName() {
        return ICanValidateName.NAME_REGEX.matcher(userModel.getNama()).find();
    }

    @Override
    public boolean validatePassword() {
        return ICanValidatePassword.PASSWORD_REGEX.matcher(userModel.getPassword()).find();
    }

    public boolean validateRePassword(String password) {
        return userModel.getPassword().equals(password);
    }

    public void updateUser() {
        userView.successUpdateInfoUser();
        userView.printNoKTP(userModel.getNoKTP());
        userView.printNamaLengkap(userModel.getNama());
        userView.printNoKTP(userModel.getNoKTP());
        userView.printPassword(userModel.getPassword());
    }

    public void updateUserResult(boolean result) {
        if (result) {
            userView.successUpdateInfoUser();
        } else {
            userView.failedUpdateInfoUser();
        }
    }
}

