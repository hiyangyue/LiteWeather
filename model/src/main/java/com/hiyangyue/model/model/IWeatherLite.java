package com.hiyangyue.model.model;

import com.hiyangyue.model.model.callback.GetWeatherLiteCallback;
import com.hiyangyue.model.model.entity.WeatherLite;

/**
 * Created by YueYang on 2016/3/24.
 */
public interface IWeatherLite {

    WeatherLite getWeatherLite(String cityName,GetWeatherLiteCallback callback);

}
