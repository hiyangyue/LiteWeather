package com.hiyueyang.liteweather.model.callback;

import com.hiyueyang.liteweather.model.entity.WeatherInfo;

/**
 * Created by YueYang on 2016/3/21.
 */
public interface GetWeatherCallBack {

    void loadSuccess(WeatherInfo weatherInfo);

    void loadError(Throwable e);

}
