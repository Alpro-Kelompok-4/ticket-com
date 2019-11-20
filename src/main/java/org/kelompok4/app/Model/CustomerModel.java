package org.kelompok4.app.Model;

public class CustomerModel {
    UserModel userModel;
    CustomerModel(UserModel userModel){
        this.userModel = userModel;
    }
    public UserModel getUserModel() {
        return userModel;
    }
    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }
}
