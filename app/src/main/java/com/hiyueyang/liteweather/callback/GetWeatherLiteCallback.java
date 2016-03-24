package com.hiyueyang.liteweather.callback;

import com.hiyueyang.liteweather.entity.WeatherLite;

/**
 * Created by YueYang on 2016/3/24.
 */
public interface GetWeatherLiteCallback {

    void loadError(Throwable throwable);

    void onNext(WeatherLite weatherLite);
}
