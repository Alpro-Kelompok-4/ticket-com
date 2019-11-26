package org.kelompok4.app.Controller;

import org.kelompok4.app.Interface.ICanAuthByPassword;
import org.kelompok4.app.Interface.ICanLoginByEmail;
import org.kelompok4.app.Interface.ICanValidateEmail;
import org.kelompok4.app.Model.LoginModel;
import org.kelompok4.app.Model.UserModel;
import org.kelompok4.app.View.LoginView;

import java.util.ArrayList;
import org.kelompok4.app.Repo.UserRepo;

public class LoginController implements ICanLoginByEmail, ICanAuthByPassword, ICanValidateEmail {
	/*kelompok2.Viewlogin v = new kelompok2.Viewlogin();
	UserModel user = new UserModel();*/

    private LoginModel model;
    private LoginView view;
    private UserRepo userRepo = new UserRepo();


    public LoginController(LoginModel model, LoginView view) {
        this.model = model;
        this.view = view;

    }

    public LoginModel getModel() {
        return model;
    }

    public void setModel(LoginModel model) {
        this.model = model;
    }

    public LoginView getView() {
        return view;
    }

    public void setView(LoginView view) {
        this.view = view;
    }

    @Override
    public String getLoginPassword() {
        return model.getPassword();
    }

    @Override
    public void setLoginPassword(String password) {
        model.setPassword(password);
    }


    @Override
    public String getLoginEmail() {
        return model.getEmail();
    }

    @Override
    public void setLoginEmail(String email) {
        model.setEmail(email);
    }

    @Override
    public boolean validateEmail() {
        return ICanValidateEmail.EMAIL_ADDRESS_REGEX.matcher(getLoginEmail()).find();
    }


    //untuk pengecekan user dan password

    public boolean auth() {
        UserModel userModel = userRepo.getByEmail(this.getLoginEmail());
        if(userModel.getEmail() != null){
            if(this.getLoginEmail().equals(userModel.getEmail())&&this.getLoginPassword().equals(userModel.getPassword())){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public void authResult(boolean auth) {
        if (auth) {
            System.out.println("Login Sukses");
        } else {
            System.out.println("Login Gagal");
        }
    }


    public void updateView() {
        clearScreen();
        view.printLoginPage();
        view.printEmail(this.getLoginEmail());
        view.printPassword(this.getLoginPassword());
    }


    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public UserModel getUserModelByEmail(){
        return userRepo.getByEmail(this.getLoginEmail());
    }
//    public void pressAnyKey() {
//        System.out.print("\033[H\033[2J");
//        System.out.flush();
//    }


}