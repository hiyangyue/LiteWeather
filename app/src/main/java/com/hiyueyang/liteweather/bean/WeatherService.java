package com.hiyueyang.liteweather.bean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * Created by YueYang on 2016/3/18.
 */
public interface WeatherService {

    @GET("/apistore/weatherservice/recentweathers")
    Call<WeatherInfo> getWeatherInfo(@Header("apikey") String apikey,@Query("cityname") String cityName);
}
