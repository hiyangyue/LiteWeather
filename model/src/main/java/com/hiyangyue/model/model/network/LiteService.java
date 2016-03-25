package com.hiyangyue.model.model.network;

import com.hiyangyue.model.model.entity.WeatherLite;

import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by YueYang on 2016/3/25.
 */
public interface LiteService {

    @GET("/apistore/weatherservice/cityname")
    Observable<WeatherLite> getWeatherLite(@Header("apikey") String apikey, @Query("cityname") String cityName);
}
