package com.hiyangyue.model.model.entity;


/**
 * Created by YueYang on 2016/3/24.
 */
public class WeatherLite{

    private String city;
    private String pinyin;
    private String time;
    private String weather;
    private String temp;
//    private String l_tmp;
//    private String h_tmp;
//    private String WD;  // "无持续风向"
//    private String WS;  // "微风"

    public void setCity(String city) {
        this.city = city;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getCity() {
        return city;
    }

    public String getPinyin() {
        return pinyin;
    }

    public String getTime() {
        return time;
    }

    public String getWeather() {
        return weather;
    }

    public String getTemp() {
        return temp;
    }

}