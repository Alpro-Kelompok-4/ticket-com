/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kelompok4.app.Presenter;

import org.kelompok4.app.Controller.MenuController;
import org.kelompok4.app.Interface.ICanRun;

import org.kelompok4.app.Presenter.LoginPresenter;
import org.kelompok4.app.Presenter.RegisterPresenter;

public class MenuPresenter extends ContinuePresenter implements ICanRun {
    MenuController menuController;
    LoginPresenter loginPresenter;
    RegisterPresenter registerPresenter;
    CustomerMenuPresenter customerMenuPresenter;
    AdminMenuPresenter adminMenuPresenter;

    public MenuPresenter(MenuController menuController, LoginPresenter loginPresenter, RegisterPresenter registerPresenter, CustomerMenuPresenter customerPresenter, AdminMenuPresenter adminMenuPresenter) {
        this.menuController = menuController;
        this.loginPresenter = loginPresenter;
        this.registerPresenter = registerPresenter;
        this.customerMenuPresenter = customerPresenter;
        this.adminMenuPresenter = adminMenuPresenter;
    }

    public CustomerMenuPresenter getCustomerMenuPresenter() {
        return customerMenuPresenter;
    }

    public void setCustomerMenuPresenter(CustomerMenuPresenter customerPresenter) {
        this.customerMenuPresenter = customerPresenter;
    }

    public AdminMenuPresenter getAdminMenuPresenter() {
        return adminMenuPresenter;
    }

    public void setAdminMenuPresenter(AdminMenuPresenter adminMenuPresenter) {
        this.adminMenuPresenter = adminMenuPresenter;
    }
    

    

    public MenuController getMenuController() {
        return menuController;
    }

    public void setMenuController(MenuController menuController) {
        this.menuController = menuController;
    }

    public LoginPresenter getLoginPresenter() {
        return loginPresenter;
    }

    public void setLoginPresenter(LoginPresenter loginPresenter) {
        this.loginPresenter = loginPresenter;
    }

    public RegisterPresenter getRegisterPresenter() {
        return registerPresenter;
    }

    public void setRegisterPresenter(RegisterPresenter registerPresenter) {
        this.registerPresenter = registerPresenter;
    }

    @Override
    public void run() {
        int menu;
        do{
            menuController.showMenuHome();
            menu = sc.nextInt();
            sc.nextLine();
            menu(menu);
            loginPresenter.getLoginController().setLoginEmail("");
            customerMenuPresenter.getUserController().setUserModel(new UserModel());
        }while(menu!=99);
    }

    private void menu(int choice) {
        if (menuController.ValidateInputMenuHome(choice)){
            switch (choice) {
                case 1:
                    loginPresenter.run();
                    if(loginPresenter.getLoginController().auth()){
                        
                        if(loginPresenter.getLoginController().getLoginEmail().equals("admin@ticket.com")){
                            adminMenuPresenter.run();
                        }else{
                            customerMenuPresenter.getUserController().setUserModel(loginPresenter.getLoginController().getUserModelByEmail());
                            customerMenuPresenter.run();
                        }
                    }else{
                        run();
                    }
                    break;
                case 2:
                    registerPresenter.run();
                    run();
                    break;
            }
        }else{
            menuController.resultValidateMenu();
        }
    }
}
