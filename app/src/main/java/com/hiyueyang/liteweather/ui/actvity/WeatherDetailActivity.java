package com.hiyueyang.liteweather.ui.actvity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.hiyueyang.liteweather.R;
import com.hiyueyang.liteweather.entity.WeatherInfo;
import com.hiyueyang.liteweather.presenter.WeatherPresenter;
import com.hiyueyang.liteweather.ui.view.WeatherView;

public class WeatherDetailActivity extends BaseActivity implements WeatherView{


    private String cityName;
    private WeatherPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getCityName();

        mPresenter = new WeatherPresenter(this);
        mPresenter.getWeatherInfo(cityName);
    }

    @Override
    protected int getResourceLayout() {
        return R.layout.activity_detail;
    }

    private void getCityName(){
        Intent intent = getIntent();
        cityName = intent.getStringExtra(MainActivity.START_DETAIL);
    }

    @Override
    public void setWeatherInfo(WeatherInfo weatherInfo) {

    }

    @Override
    public void loadError(Throwable e) {

    }
}

















