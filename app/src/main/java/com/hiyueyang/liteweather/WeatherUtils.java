package com.hiyueyang.liteweather;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hiyueyang.liteweather.gson.LiteDeserializer;
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

    private static Gson liteGson = new GsonBuilder()
            .registerTypeAdapter(WeatherLite.class,new LiteDeserializer())
            .create();

//    private static Gson getGson(){
//        GsonBuilder gsonBuilder = new GsonBuilder()
//                .setExclusionStrategies(new ExclusionStrategy() {
//                    @Override
//                    public boolean shouldSkipField(FieldAttributes f) {
//                        return f.getDeclaringClass().equals(RealmObject.class);
//                    }
//
//                    @Override
//                    public boolean shouldSkipClass(Class<?> clazz) {
//                        return false;
//                    }
//                });
//
//        gsonBuilder.registerTypeAdapter(WeatherLite.class, new LiteDeserializer())
//                .registerTypeAdapter(WeatherLite.class, new LiteSerializer());
//
//        try {
//            gsonBuilder.registerTypeAdapter(Class.forName("io.realm.WeatherLiteRealmProxy"), new LiteSerializer())
//                    .registerTypeAdapter(Class.forName("io.realm.WeatherLiteRealmProxy"), new LiteDeserializer());
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return gsonBuilder.create();
//    }

    private static final Retrofit retrofit = new Retrofit
            .Builder()
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(liteGson))
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
