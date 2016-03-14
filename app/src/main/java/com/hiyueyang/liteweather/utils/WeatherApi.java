package com.hiyueyang.liteweather.utils;

/**
 * Created by YueYang on 2016/3/14.
 */
public class WeatherApi {

    private static String MY_KEY = "6904bdb604714311b060da16fa9195ab";

    public static String getWeatherById(String cityId) {
        return "https://api.heweather.com/x3/weather?cityid=" + cityId + "&key=" + MY_KEY;
    }

    public static String getWeatherByName(String cityName){
        return "https://api.heweather.com/x3/weather?city=" + cityName +  "&key=" + MY_KEY;
    }

}
