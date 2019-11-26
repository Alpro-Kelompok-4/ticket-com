package org.kelompok4.app.Controller;

import org.kelompok4.app.Interface.*;
import org.kelompok4.app.Interface.ICanInputUser;
import org.kelompok4.app.Model.UserModel;
import org.kelompok4.app.View.RegisterView;

public class CustomerController implements ICanInputUser, ICanValidateEmail, ICanValidateName, ICanValidateNoHP, ICanValidateNoKTP, ICanValidatePassword {
    UserModel userModel;
    RegisterView registerView;

    public CustomerController(UserModel userModel, RegisterView registerView) {
        this.userModel = userModel;
        this.registerView = registerView;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public RegisterView getRegisterView() {
        return registerView;
    }

    public void setRegisterView(RegisterView registerView) {
        this.registerView = registerView;
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
        return userModel.getName();
    }

    @Override
    public void setName(String name) {
        userModel.setName(name);
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
    public boolean validateEmail() {
        return ICanValidateEmail.EMAIL_ADDRESS_REGEX.matcher(getEmail()).find();
    }

    @Override
    public boolean validateName() {
        return ICanValidateName.NAME_REGEX.matcher(getName()).find();
    }

    @Override
    public boolean validateNoHP() {
        return ICanValidateNoHP.NoHP_REGEX.matcher(getNoHP()).find();
    }

    @Override
    public boolean validateNoKTP() {
        return ICanValidateNoKTP.NoKTP_REGEX.matcher(getNoKTP()).find();
    }

    @Override
    public boolean validatePassword() {
        return ICanValidatePassword.PASSWORD_REGEX.matcher(getPassword()).find();
    }

    public void showInfoUser() {
        registerView.printNamaLengkap(this.getName());
        registerView.printNoHp(this.getNoHP());
        registerView.printEmail(this.getEmail());
        registerView.printPassword(this.getPassword());
    }

    public boolean updateInfoUser() {
        //edit di json
        return true;
    }

    public void updateInfoUserResult() {
        if (this.updateInfoUser()) {
            registerView.successUpdateInfoUser();
            registerView.printNoKTP(this.getNoKTP());
            showInfoUser();
        } else {
            registerView.failedUpdateInfoUser();
        }
    }
}
