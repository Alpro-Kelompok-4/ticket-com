package org.kelompok4.app;

public class RegisterView {

    public RegisterView() {

    }

    public void printRegisterPage() {
        System.out.println("#REGISTER SISTEM#");
        System.out.println("");
        System.out.println("");

    }

    public void printNoKTP() {
        System.out.print("Nomor KTP : ");
        System.out.flush();
    }

    public void printNoKTP(String noKTP) {
        System.out.print("Nomor KTP : " + noKTP);
        System.out.println("");
        System.out.flush();
    }

    public void printNamaLengkap() {
        System.out.print("Nama Lengkap : ");
        System.out.flush();
    }

    public void printNamaLengkap(String namaCustomer) {
        System.out.print("Nama Lengkap : " + namaCustomer);
        System.out.println("");
        System.out.flush();
    }

    public void printNoHp() {
        System.out.print("Nomor Handphone : ");
        System.out.flush();
    }

    public void printNoHp(String noHP) {
        System.out.print("Nomor Handphone : " + noHP);
        System.out.println("");
        System.out.flush();
    }

    public void printEmail() {
        System.out.print("Email : ");
        System.out.flush();
    }

    public void printEmail(String email) {
        System.out.print("Email : " + email);
        System.out.println("");
        System.out.flush();
    }

    public void printPassword() {
        System.out.print("Password : ");
        System.out.flush();
    }

    public void printPassword(String password) {
        System.out.print("Password : " + password);
        System.out.println("");
        System.out.flush();
    }

    public void printRePassword() {
        System.out.print("Re-Password : ");
        System.out.flush();
    }

    public void printRePassword(String Password) {
        System.out.print("Re-Password : " + Password);
        System.out.println("");
        System.out.flush();
    }

    public void failedValidateNoKTP() {
        System.out.println("Nomor KTP yang Anda masukan salah!");
        System.out.flush();
    }

    public void failedValidateEmail() {
        System.out.println("E-mail yang Anda masukan salah!");
        System.out.flush();
    }

    public void failedValidateNama() {
        System.out.println("Nama yang Anda masukan salah!");
        System.out.flush();
    }

    public void failedValidateNoHP() {
        System.out.println("Nomor Handphone yang Anda masukan salah!");
        System.out.flush();
    }

    public void failedValidatePassword() {
        System.out.println("Password yang Anda masukan salah!");
        System.out.flush();
    }

    public void failedValidateRePassword() {
        System.out.println("Password yang Anda masukan tidak cocok!");
        System.out.flush();
    }

    public void successRegister() {
        System.out.println("Selamat Akun Anda telah terdaftar. Silakan Login!");
        System.out.flush();
    }

    public void failedRegister() {
        System.out.println("Register gagal, Akun e-mail Anda sudah terdaftar!");
        System.out.flush();
    }
}

