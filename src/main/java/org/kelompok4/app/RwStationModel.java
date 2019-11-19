package org.kelompok4.app;

public class RwStationModel {
    private String rwStationCode;
    private String rwStationName;

    public RwStationModel(String rwStationCode, String rwStationName) {
        this.rwStationCode = rwStationCode;
        this.rwStationName = rwStationName;
    }

    public RwStationModel() {
    }

    public String getRwStationCode() {
        return rwStationCode;
    }

    public void setRwStationCode(String rwStationCode) {
        this.rwStationCode = rwStationCode;
    }

    public String getRwStationName() {
        return rwStationName;
    }

    public void setRwStationName(String rwStationName) {
        this.rwStationName = rwStationName;
    }
}
