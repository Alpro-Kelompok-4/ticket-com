/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kelompok4.app.Presenter;

import org.kelompok4.app.Controller.UserController;
import org.kelompok4.app.Interface.ICanRun;

/**
 *
 * @author Rewingw
 */
public class UserPresenter extends ContinuePresenter implements ICanRun{
    UserController userController;

    public UserController getUserController() {
        return userController;
    }

    public void setUserController(UserController userController) {
        this.userController = userController;
    }

    @Override
    public void run() {
        
    }
    
}
