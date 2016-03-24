package com.hiyueyang.liteweather.presenter;

import com.hiyueyang.liteweather.callback.GetWeatherLiteCallback;
import com.hiyueyang.liteweather.entity.WeatherLite;
import com.hiyueyang.liteweather.model.IWeatherLite;
import com.hiyueyang.liteweather.model.WeatherLiteImpl;
import com.hiyueyang.liteweather.ui.view.WeatherLiteView;

/**
 * Created by YueYang on 2016/3/24.
 */
public class WeatherLitePresenter {

    private WeatherLiteView mWeatherLiteView;
    private IWeatherLite mWeatherLiteModel;

    public WeatherLitePresenter(WeatherLiteView weatherLiteView){
        this.mWeatherLiteView = weatherLiteView;
        mWeatherLiteModel = new WeatherLiteImpl();
    }

    public void getWeatherLite(String cityName){
        mWeatherLiteModel.getWeatherLite(cityName, new GetWeatherLiteCallback() {
            @Override
            public void loadError(Throwable throwable) {
                mWeatherLiteView.loadError(throwable);
            }

            @Override
            public void onNext(WeatherLite weatherLite) {
                mWeatherLiteView.setWeatherLite(weatherLite);
            }
        });
    }

}