package org.kelompok4.app.Presenter;

import org.kelompok4.app.Controller.MenuController;
import org.kelompok4.app.Interface.ICanRun;
import org.kelompok4.app.Presenter.LoginPresenter;
import org.kelompok4.app.Presenter.RegisterPresenter;

public class MenuPresenter extends ContinuePresenter implements ICanRun {
    MenuController menuController;
    LoginPresenter loginPresenter;
    RegisterPresenter registerPresenter;

    public MenuPresenter(MenuController menuController, LoginPresenter loginPresenter,RegisterPresenter registerPresenter) {
        this.menuController = menuController;
        this.loginPresenter= loginPresenter;
        this.registerPresenter= registerPresenter;
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
        menuController.showMenuHome();
        int menu = sc.nextInt();
        sc.nextLine();
        menu(menu);
    }

    private void menu(int choice) {
        if (menuController.ValidateInputMenuHome(choice)){
            switch (choice) {
                case 1:
                    loginPresenter.run();
                    break;
                case 2:
                    registerPresenter.run();
                    break;
            }
        }else{
            menuController.resultValidateMenu();
        }
    }
}
