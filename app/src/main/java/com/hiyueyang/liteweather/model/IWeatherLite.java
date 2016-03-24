package com.hiyueyang.liteweather.model;

import com.hiyueyang.liteweather.callback.GetWeatherLiteCallback;
import com.hiyueyang.liteweather.entity.WeatherLite;

/**
 * Created by YueYang on 2016/3/24.
 */
public interface IWeatherLite {

    WeatherLite getWeatherLite(String cityName,GetWeatherLiteCallback callback);

}
