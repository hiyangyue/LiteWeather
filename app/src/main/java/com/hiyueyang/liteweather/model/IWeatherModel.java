package com.hiyueyang.liteweather.model;

import com.hiyueyang.liteweather.model.callback.GetWeatherCallBack;
import com.hiyueyang.liteweather.model.entity.WeatherInfo;

/**
 * Created by YueYang on 2016/3/21.
 */
public interface IWeatherModel {

    WeatherInfo getWeather(String cityName,GetWeatherCallBack callBack);

    void saveWeather();
}
