package com.hiyangyue.model.model.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hiyangyue.model.model.network.gson.LiteDeserializer;
import com.hiyangyue.model.model.entity.WeatherInfo;
import com.hiyangyue.model.model.entity.WeatherLite;
import com.hiyangyue.model.model.network.gson.WeatherDeserializer;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import rx.Observable;

/**
 * Created by YueYang on 2016/3/18.
 */
public class RetrofitClient {

    public static final String BASE_URL = "http://apis.baidu.com";
    public static final String API_KEY = "9fed5dbbb6bc62adc3021773fb9069a2";

    public static Gson liteGson = new GsonBuilder()
            .registerTypeAdapter(WeatherLite.class,new LiteDeserializer())
            .create();

    public static Gson weatherGson = new GsonBuilder()
            .registerTypeAdapter(WeatherInfo.class,new WeatherDeserializer())
            .create();

    private static Retrofit getRetrofit(Gson gson){
        return new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(BASE_URL)
                .build();
    }

    private static final WeatherService service = getRetrofit(weatherGson).create(WeatherService.class);
    private static final LiteService liteService = getRetrofit(liteGson).create(LiteService.class);

    public static Observable<WeatherInfo> getWeatherObservable(String cityName){
        return service.getWeatherInfo(API_KEY,cityName);
    }

    public static Observable<WeatherLite> getWeatherLiteObser(String cityName){
        return liteService.getWeatherLite(API_KEY,cityName);
    }

}
