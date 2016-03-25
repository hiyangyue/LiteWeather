package com.hiyueyang.liteweather.ui.view;

import com.hiyangyue.model.model.entity.WeatherLite;

/**
 * Created by YueYang on 2016/3/24.
 */
public interface WeatherLiteView {

    void setWeatherLite(WeatherLite weatherLite);

    void loadError(Throwable throwable);

}
