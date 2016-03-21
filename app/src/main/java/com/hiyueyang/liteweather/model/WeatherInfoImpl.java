package com.hiyueyang.liteweather.model;

import com.hiyueyang.liteweather.WeatherUtils;
import com.hiyueyang.liteweather.callback.GetWeatherCallBack;
import com.hiyueyang.liteweather.entity.WeatherInfo;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by YueYang on 2016/3/21.
 */
public class WeatherInfoImpl implements IWeatherModel {

    @Override
    public WeatherInfo getWeather(String cityName, final GetWeatherCallBack callBack) {
        WeatherUtils.getWeatherObservable(cityName)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Subscriber<WeatherInfo>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        callBack.loadError(e);
                    }

                    @Override
                    public void onNext(WeatherInfo weatherInfo) {
                        callBack.loadSuccess(weatherInfo);
                    }
                });

        return null;

    }

    @Override
    public void saveWeather() {

    }
}
