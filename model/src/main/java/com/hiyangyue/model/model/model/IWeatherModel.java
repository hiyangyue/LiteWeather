package com.hiyangyue.model.model.model;

import com.hiyangyue.model.model.callback.GetWeatherCallBack;
import com.hiyangyue.model.model.entity.WeatherInfo;

/**
 * Created by YueYang on 2016/3/21.
 */
public interface IWeatherModel {

    WeatherInfo getWeather(String cityName,GetWeatherCallBack callBack);

    void saveWeather();
}
