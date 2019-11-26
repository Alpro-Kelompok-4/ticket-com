package org.kelompok4.app.Controller;

import org.kelompok4.app.Interface.*;
import org.kelompok4.app.Interface.ICanInputUser;
import org.kelompok4.app.Model.UserModel;
import org.kelompok4.app.View.RegisterView;

public class RegisterController implements ICanInputUser, ICanValidateEmail, ICanValidateName, ICanValidateNoHP, ICanValidateNoKTP, ICanValidatePassword {
    private UserModel model;
    private RegisterView view;
    public RegisterController(UserModel model, RegisterView view){
        this.model = model;
        this.view = view;
    }

    public RegisterView getView() {
        return view;
    }

    public void setView(RegisterView view) {
        this.view = view;
    }

    public UserModel getModel() {
        return model;
    }

    public void setModel(UserModel model) {
        this.model = model;
    }


    @Override
    public String getEmail() {
        return model.getEmail();
    }

    @Override
    public void setEmail(String email) {
        model.setEmail(email);
    }

    @Override
    public String getName() {
        return model.getName();
    }

    @Override
    public void setName(String name) {
        model.setName(name);
    }

    @Override
    public String getNoHP() {
        return model.getNoHP();
    }

    @Override
    public void setNoHP(String noHP) {
        model.setNoHP(noHP);
    }

    @Override
    public String getNoKTP() {
        return model.getId();
    }

    @Override
    public void setNoKTP(String noKTP) {
        model.setId(noKTP);
    }

    @Override
    public String getPassword() {
        return model.getPassword();
    }

    @Override
    public void setPassword(String password) {
        model.setPassword(password);
    }

    public void updateRegister(){
        clearScreen();
        view.printRegisterPage();
        view.printNoKTP(this.getNoKTP());
        view.printNamaLengkap(this.getName());
        view.printNoHp(this.getNoHP());
        view.printEmail(this.getEmail());
        view.printPassword(this.getPassword());
        view.printRePassword(this.getPassword());
    }
    public void registerResult(boolean result){
        if(result){
            view.successRegister();
        }else {
            view.failedRegister();
        }
    }
    public boolean register() {
        return true;
        //input kejson, cek username udah ada atau belum
    }
    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
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

    public boolean validateRePassword(String rePassword) {
        return getPassword().equals(rePassword);
    }
}
