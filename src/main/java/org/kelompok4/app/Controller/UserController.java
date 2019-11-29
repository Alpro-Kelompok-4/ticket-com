/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kelompok4.app.Controller;

import org.kelompok4.app.Interface.*;
import org.kelompok4.app.Model.UserModel;
import org.kelompok4.app.Repo.UserRepo;
import org.kelompok4.app.View.UserView;

public class UserController implements ICanInputUser,ICanRead, ICanUpdate, ICanValidateNoKTP, ICanValidateEmail, ICanValidateName, ICanValidatePassword, ICanValidateNoHP {
    private UserModel userModel;
    private UserView userView;
    private UserRepo userRepo;

    public UserController(UserModel userModel, UserView userView) {
        this.userModel = userModel;
        this.userView = userView;
    }

     @Override
    public String getEmail() {
        return userModel.getEmail();
    }

    @Override
    public void setEmail(String email) {
        userModel.setEmail(email);
    }

    @Override
    public String getName() {
        return userModel.getNama();
    }

    @Override
    public void setName(String name) {
        userModel.setNama(name);
    }

    @Override
    public String getNoHP() {
        return userModel.getNoHP();
    }

    @Override
    public void setNoHP(String noHP) {
        userModel.setNoHP(noHP);
    }

    @Override
    public String getNoKTP() {
        return userModel.getNoKTP();
    }

    @Override
    public void setNoKTP(String noKTP) {
        userModel.setNoKTP(noKTP);
    }

    @Override
    public String getPassword() {
        return userModel.getPassword();
    }

    @Override
    public void setPassword(String password) {
        userModel.setPassword(password);
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
        userRepo.update(userModel);
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
    public void showInfoUser() {
        userView.printNamaLengkap(this.getName());
        userView.printNoHp(this.getNoHP());
        userView.printEmail(this.getEmail());
        userView.printPassword(this.getPassword());
    }

    @Override
    public boolean validateNoHP() {
        return ICanValidateNoHP.NoHP_REGEX.matcher(getNoHP()).find();
    }
    public boolean updateInfoUser() {
        if(userRepo.get(getNoKTP()).getNoKTP()!=null){
            update();
            
            return true;
        }else{
            return false;
        }
    }

    public void updateInfoUserResult() {
        if (this.updateInfoUser()) {
            userView.successUpdateInfoUser();
            userView.printNoKTP(this.getNoKTP());
            showInfoUser();
        } else {
            userView.failedUpdateInfoUser();
        }
    }
}

