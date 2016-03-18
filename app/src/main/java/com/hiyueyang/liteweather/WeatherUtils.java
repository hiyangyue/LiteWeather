package com.hiyueyang.liteweather;

import com.hiyueyang.liteweather.bean.WeatherInfo;
import com.hiyueyang.liteweather.bean.WeatherService;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by YueYang on 2016/3/18.
 */
public class WeatherUtils {

    public static final String BASE_URL = "http://apis.baidu.com";
    public static final String API_KEY = "9fed5dbbb6bc62adc3021773fb9069a2";

    private static final Retrofit retrofit = new Retrofit
            .Builder()
            .addConverterFactory(GsonConverterFactory.create())   //解析方法
            .baseUrl(BASE_URL)
            .build();

    private static final WeatherService WEATHER_SERVICE = retrofit.create(WeatherService.class);

    public static Call<WeatherInfo> getWeatherInfo(String cityName){
        return WEATHER_SERVICE.getWeatherInfo(API_KEY,cityName);
    }








}
