package com.hiyueyang.liteweather.ui.view;

import com.hiyangyue.model.model.entity.WeatherInfo;

/**
 * Created by YueYang on 2016/3/21.
 */
public interface WeatherView {

    void setWeatherInfo(WeatherInfo weatherInfo);

    void loadError(Throwable e);

}
