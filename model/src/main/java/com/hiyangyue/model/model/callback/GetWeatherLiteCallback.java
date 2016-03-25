package com.hiyangyue.model.model.callback;

import com.hiyangyue.model.model.entity.WeatherLite;

/**
 * Created by YueYang on 2016/3/24.
 */
public interface GetWeatherLiteCallback {

    void loadError(Throwable throwable);

    void onNext(WeatherLite weatherLite);
}
