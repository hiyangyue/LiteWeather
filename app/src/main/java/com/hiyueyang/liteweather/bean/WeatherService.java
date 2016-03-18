package com.hiyueyang.liteweather.bean;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by YueYang on 2016/3/18.
 */
public interface WeatherService {

    @GET("/apistore/weatherservice/recentweathers")
    Observable<WeatherInfo> getWeatherInfo(@Header("apikey") String apikey,@Query("cityname") String cityName);

//    @GET("/apistore/weatherservice/recentweathers")
//    Call<WeatherInfo> getWeatherInfo(@Header("apikey") String apikey,@Query("cityname") String cityName);
}
