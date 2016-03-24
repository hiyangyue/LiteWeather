package com.hiyueyang.liteweather;

import com.hiyueyang.liteweather.entity.WeatherInfo;
import com.hiyueyang.liteweather.entity.WeatherLite;
import com.hiyueyang.liteweather.entity.WeatherService;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import rx.Observable;

/**
 * Created by YueYang on 2016/3/18.
 */
public class WeatherUtils {

    public static final String BASE_URL = "http://apis.baidu.com";
    public static final String API_KEY = "9fed5dbbb6bc62adc3021773fb9069a2";

    private static final Retrofit retrofit = new Retrofit
            .Builder()
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())   //解析方法
            .baseUrl(BASE_URL)
            .build();

    private static final WeatherService service = retrofit.create(WeatherService.class);

    public static Observable<WeatherInfo> getWeatherObservable(String cityName){
        return service.getWeatherInfo(API_KEY,cityName);
    }

    public static Observable<WeatherLite> getWeatherLiteObser(String cityName){
        return service.getWeatherLite(API_KEY,cityName);
    }

//    public static void getWeatherObser(String cityName, final ObserableCallback callback){
//        Observable<WeatherInfo> weatherObser = service.getWeatherInfo(API_KEY,cityName);
//        weatherObser.observeOn(AndroidSchedulers.mainThread())
//                .subscribeOn(Schedulers.io())
//                .subscribe(new Subscriber<WeatherInfo>() {
//                    @Override
//                    public void onCompleted() {
//
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        callback.onError(e);
//                    }
//
//                    @Override
//                    public void onNext(WeatherInfo weatherInfo) {
//                        callback.onNext(weatherInfo);
//                    }
//                });
//
//    }
//
//    public static void getWeatherLite(String cityName,final WeatherLiteCallback callback){
//        Observable<WeatherLite> liteObservable = service.getWeatherLite(API_KEY,cityName);
//        liteObservable.observeOn(AndroidSchedulers.mainThread())
//                .subscribeOn(Schedulers.io())
//                .subscribe(new Subscriber<WeatherLite>() {
//                    @Override
//                    public void onCompleted() {
//
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        callback.onError(e);
//                    }
//
//                    @Override
//                    public void onNext(WeatherLite weatherLite) {
//                        callback.onNext(weatherLite);
//                    }
//                });
//    }

    public interface ObserableCallback{
        void onError(Throwable throwable);

        void onNext(WeatherInfo weatherInfo);
    }

    public interface WeatherLiteCallback{
        void onError(Throwable throwable);

        void onNext(WeatherLite weatherLite);
    }

}
