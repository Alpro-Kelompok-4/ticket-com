package org.kelompok4.app.Model;

public class TimeModel {
    private String timeCode;
    private JamModel jam;

    public TimeModel() {
    }

    public TimeModel(String timeCode, JamModel jam) {
        this.timeCode = timeCode;
        this.jam = jam;
    }

    public String getTimeCode() {
        return timeCode;
    }

    public void setTimeCode(String timeCode) {
        this.timeCode = timeCode;
    }

    public JamModel getJam() {
        return jam;
    }

    public void setJam(JamModel jam) {
        this.jam = jam;
    }
    public String printJam(){
        String HH;
        String MM;
        if(jam.getHH()<10){
            HH = "0" +jam.getHH();
        }else{
            HH = String.valueOf(jam.getHH());
        }
        if(jam.getMM()<10){
            MM = "0" +jam.getMM();
        }else{
            MM = String.valueOf(jam.getMM());
        }
        return new String(HH+":"+MM);
    }
}