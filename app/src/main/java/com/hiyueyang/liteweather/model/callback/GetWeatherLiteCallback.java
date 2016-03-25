package com.hiyueyang.liteweather.model.callback;

import com.hiyueyang.liteweather.model.entity.WeatherLite;

/**
 * Created by YueYang on 2016/3/24.
 */
public interface GetWeatherLiteCallback {

    void loadError(Throwable throwable);

    void onNext(WeatherLite weatherLite);
}
