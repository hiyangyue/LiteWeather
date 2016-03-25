package com.hiyueyang.liteweather.presenter;

import com.hiyueyang.liteweather.model.callback.GetWeatherCallBack;
import com.hiyueyang.liteweather.model.entity.WeatherInfo;
import com.hiyueyang.liteweather.model.IWeatherModel;
import com.hiyueyang.liteweather.model.WeatherInfoImpl;
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
