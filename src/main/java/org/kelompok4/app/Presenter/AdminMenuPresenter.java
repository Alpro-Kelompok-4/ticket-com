package org.kelompok4.app.Presenter;

import org.kelompok4.app.Controller.MenuController;
import org.kelompok4.app.Interface.ICanRun;

public class AdminMenuPresenter extends ContinuePresenter implements ICanRun {
    MenuController menuController;

    public AdminMenuPresenter(MenuController menuController) {
        this.menuController = menuController;
    }

    public MenuController getMenuController() {
        return menuController;
    }

    public void setMenuController(MenuController menuController) {
        this.menuController = menuController;
    }

    @Override
    public void run() {
        menuController.showMenuAdmin();
        int menu = sc.nextInt();
        sc.nextLine();
        menu(menu);
    }

    private void menu(int choice) {
        if (menuController.ValidateInputMenuAdmin(choice)){
            switch (choice) {
                case 1:
                    menuController.showMenuLogin();
                    break;
                case 2:
                    menuController.showMenuRegistration();
                    break;
            }
        }else{
            menuController.resultValidateMenu();
        }

    }
}
