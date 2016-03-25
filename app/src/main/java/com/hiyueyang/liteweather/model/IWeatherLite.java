package com.hiyueyang.liteweather.model;

import com.hiyueyang.liteweather.model.callback.GetWeatherLiteCallback;
import com.hiyueyang.liteweather.model.entity.WeatherLite;

/**
 * Created by YueYang on 2016/3/24.
 */
public interface IWeatherLite {

    WeatherLite getWeatherLite(String cityName,GetWeatherLiteCallback callback);

}
