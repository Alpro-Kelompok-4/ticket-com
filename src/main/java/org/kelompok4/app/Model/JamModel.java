package org.kelompok4.app.Model;

public class JamModel {
    private int HH;
    private int MM;

    public JamModel(int HH, int MM) {
        this.HH = HH;
        this.MM = MM;
    }
    public JamModel() {
    }

    public int getHH() {
        return HH;
    }

    public void setHH(int HH) {
        this.HH = HH;
    }

    public int getMM() {
        return MM;
    }

    public void setMM(int MM) {
        this.MM = MM;
    }
}
