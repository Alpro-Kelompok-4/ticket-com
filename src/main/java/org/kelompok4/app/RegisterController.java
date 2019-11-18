package org.kelompok4.app;

public class RegisterController implements ICanRegisterByForm,ICanValidateEmail,ICanValidateName,ICanValidateNoHP,ICanValidateNoKTP,ICanValidatePassword {
    UserModel model;
    RegisterView view;
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
    public String getRegisterEmail() {
        return model.getEmail();
    }

    @Override
    public void setRegisterEmail(String email) {
        model.setEmail(email);
    }

    @Override
    public String getRegisterName() {
        return model.getNama();
    }

    @Override
    public void setRegisterName(String name) {
        model.setNama(name);
    }

    @Override
    public String getRegisterNoHP() {
        return model.getNoHP();
    }

    @Override
    public void setRegisterNoHP(String noHP) {
        model.setNoHP(noHP);
    }

    @Override
    public String getRegisterNoKTP() {
        return model.getNoKTP();
    }

    @Override
    public void setRegisterNoKTP(String noKTP) {
        model.setNoKTP(noKTP);
    }

    @Override
    public String getRegisterPassword() {
        return model.getPassword();
    }

    @Override
    public void setRegisterPassword(String password) {
        model.setPassword(password);
    }

    public void updateRegister(){
        clearScreen();
        view.printRegisterPage();
        view.printNoKTP(this.getRegisterNoKTP());
        view.printNamaLengkap(this.getRegisterName());
        view.printNoHp(this.getRegisterNoHP());
        view.printEmail(this.getRegisterEmail());
        view.printPassword(this.getRegisterPassword());
        view.printRePassword(this.getRegisterPassword());
        registerResult();
    }
    public void registerResult(){
        if(this.register()){
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
        return ICanValidateEmail.EMAIL_ADDRESS_REGEX.matcher(getRegisterEmail()).find();
    }

    @Override
    public boolean validateName() {
        return ICanValidateName.NAME_REGEX.matcher(getRegisterName()).find();
    }

    @Override
    public boolean validateNoHP() {
        return ICanValidateNoHP.NoHP_REGEX.matcher(getRegisterNoHP()).find();
    }

    @Override
    public boolean validateNoKTP() {
        return ICanValidateNoKTP.NoKTP_REGEX.matcher(getRegisterNoKTP()).find();
    }

    @Override
    public boolean validatePassword() {
        return ICanValidatePassword.PASSWORD_REGEX.matcher(getRegisterPassword()).find();
    }

    @Override
    public boolean validateRePassword(String rePassword) {
        return getRegisterPassword().equals(rePassword);
    }
}
