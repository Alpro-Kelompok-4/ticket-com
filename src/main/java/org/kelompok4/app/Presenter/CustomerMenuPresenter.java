/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kelompok4.app.Presenter;

import org.kelompok4.app.Controller.MenuController;
import org.kelompok4.app.Controller.UserController;
import org.kelompok4.app.Interface.ICanRun;

public class CustomerMenuPresenter extends ContinuePresenter implements ICanRun {
    private MenuController menuController;
    private UserController userController;
    BookingPresenter bookingPresenter = new BookingPresenter();

    public CustomerMenuPresenter() {

    }

    public CustomerMenuPresenter(MenuController menuController, BookingPresenter bookingPresenter) {
        this.menuController = menuController;
        this.bookingPresenter = bookingPresenter;
    }

    public CustomerMenuPresenter(MenuController menuController, UserController userController) {
        this.menuController = menuController;
        this.userController = userController;
    }

    public UserController getUserController() {
        return userController;
    }

    public void setUserController(UserController userController) {
        this.userController = userController;
    }

    public MenuController getMenuController() {
        return menuController;
    }

    public void setMenuController(MenuController menuController) {
        this.menuController = menuController;
    }

    @Override
    public void run() {
        int menu;
        do{
            menuController.showMenuCustomer();
            menu = sc.nextInt();
            sc.nextLine();
            menu(menu);
        }while(menu!=0&&menu!=99);
    }

    private void menu(int choice) {

        if (menuController.ValidateInputMenuCustomer(choice)) {
            switch (choice) {
            case 1:
                // System.out.println("//Nyambung ke Kelola bookingPresenter.run()");
                bookingPresenter.saveCustomerEmail(userController.getUserModel().getEmail());
                bookingPresenter.run();

                break;
            case 2:// Kelola Profile
                System.out.println("//Nyambung ke Kelola Profile userPresenter.run()");
                // userPresenter.run();
                break;
            case 3:// History Pembelian
                // System.out.println("//Nyambung ke bookingPresenter.run()");
                bookingPresenter.showBookingHistory(userController.getUserModel().getEmail());
                break;
            case 0:// exit
                System.exit(0);
                break;
            }
        } else {
            menuController.resultValidateMenu();
        }
    }

}
