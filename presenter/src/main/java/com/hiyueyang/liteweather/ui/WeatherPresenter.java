package com.hiyueyang.liteweather.ui;

import com.hiyangyue.model.model.callback.GetWeatherCallBack;
import com.hiyangyue.model.model.entity.WeatherInfo;
import com.hiyangyue.model.model.model.IWeatherModel;
import com.hiyangyue.model.model.impl.WeatherInfoImpl;
import com.hiyueyang.liteweather.ui.view.WeatherView;

/**
 * Created by YueYang on 2016/3/21.
 */
public class WeatherPresenter {

    private WeatherView mWeatherView;
    private IWeatherModel mWeatherModel;

    public WeatherPresenter(WeatherView weatherView){
        mWeatherView = weatherView;
        mWeatherModel = new WeatherInfoImpl();
    }

    public void getWeatherInfo(String cityName){

        mWeatherModel.getWeather(cityName, new GetWeatherCallBack() {
            @Override
            public void loadSuccess(WeatherInfo weatherInfo) {
                mWeatherView.setWeatherInfo(weatherInfo);
            }

            @Override
            public void loadError(Throwable e) {
                mWeatherView.loadError(e);
            }
        });

    }

}
