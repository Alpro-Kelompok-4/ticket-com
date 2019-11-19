package org.kelompok4.app;

public class CityModel {
    private String cityCode;
    private String cityName;
    public CityModel(){

    }
    public CityModel(String code, String name){
        this.cityCode = code;
        this.cityName = name;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
