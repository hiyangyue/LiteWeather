package com.hiyueyang.liteweather.ui;

import android.util.Log;

import com.hiyangyue.model.model.callback.GetWeatherLiteCallback;
import com.hiyangyue.model.model.entity.WeatherLite;
import com.hiyangyue.model.model.IWeatherLite;
import com.hiyangyue.model.model.WeatherLiteImpl;
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
                Log.e("error1",throwable.fillInStackTrace().toString());
                mWeatherLiteView.loadError(throwable);
            }

            @Override
            public void onNext(WeatherLite weatherLite) {
                Log.e("sussess1","....");
                mWeatherLiteView.setWeatherLite(weatherLite);
            }
        });
    }

    public void getWeatherLiteList(){

    }


}
