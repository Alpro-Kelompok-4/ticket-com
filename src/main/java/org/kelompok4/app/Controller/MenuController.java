package org.kelompok4.app.Controller;
//@Author gayuh
import org.kelompok4.app.View.MenuView;

public class MenuController {
    private MenuView menuView;

    public MenuController(MenuView menuView) {
        this.menuView = menuView;
    }

    public MenuView getMenuView() {
        return menuView;
    }

    public void setMenuView(MenuView menuView) {
        this.menuView = menuView;
    }

    public void showMenuHome(){
        menuView.MenuHome();
        menuView.printChooseMenu();
    }

    public void showMenuAdmin(){
        menuView.MenuAdmin();
        menuView.printChooseMenu();
    }

    public void showMenuCustomer(){
        menuView.MenuCustomer();
        menuView.printChooseMenu();
    }

    public void showMenuLogin(){
        menuView.MenuLogin();
     }

    public void showMenuRegistration(){
        menuView.MenuRegistration();
    }

    public boolean ValidateInputMenuHome(int pilihan){
        return(pilihan>=1 && pilihan<=2);
    }

    public boolean ValidateInputMenuAdmin(int pilihan){
        return(pilihan>=0 && pilihan<=11);
    }

    public boolean ValidateInputMenuCustomer(int pilihan){
        return(pilihan>=0 && pilihan<=3);
    }

    public void resultValidateMenu(){
        menuView.failedValidateMenu();
    }
}