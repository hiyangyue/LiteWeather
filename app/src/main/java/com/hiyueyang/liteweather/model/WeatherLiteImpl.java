package com.hiyueyang.liteweather.model;

import com.hiyueyang.liteweather.network.RetrofitClient;
import com.hiyueyang.liteweather.model.callback.GetWeatherLiteCallback;
import com.hiyueyang.liteweather.model.entity.WeatherLite;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by YueYang on 2016/3/24.
 */
public class WeatherLiteImpl implements IWeatherLite {

    @Override
    public WeatherLite getWeatherLite(String cityName, final GetWeatherLiteCallback callback) {
        RetrofitClient.getWeatherLiteObser(cityName)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Subscriber<WeatherLite>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.loadError(e);
                    }

                    @Override
                    public void onNext(WeatherLite weatherLite) {
                        callback.onNext(weatherLite);
                    }
                });

        return null;
    }
}
