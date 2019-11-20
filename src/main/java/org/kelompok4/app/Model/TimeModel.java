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
}