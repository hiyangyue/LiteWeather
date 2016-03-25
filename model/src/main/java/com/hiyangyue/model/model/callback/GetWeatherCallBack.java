package com.hiyangyue.model.model.callback;

import com.hiyangyue.model.model.entity.WeatherInfo;

/**
 * Created by YueYang on 2016/3/21.
 */
public interface GetWeatherCallBack {

    void loadSuccess(WeatherInfo weatherInfo);

    void loadError(Throwable e);

}
