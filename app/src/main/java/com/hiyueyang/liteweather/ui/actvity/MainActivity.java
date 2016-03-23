package com.hiyueyang.liteweather.ui.actvity;

import android.os.Bundle;
import android.util.Log;

import com.hiyueyang.liteweather.R;
import com.hiyueyang.liteweather.entity.WeatherInfo;
import com.hiyueyang.liteweather.presenter.WeatherPresenter;
import com.hiyueyang.liteweather.ui.view.WeatherView;

/**
 * Created by YueYang on 2016/3/23.
 */
public class MainActivity extends BaseActivity implements WeatherView{

    private WeatherPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mPresenter = new WeatherPresenter(this);
        mPresenter.setWeatherInfo("南京");
    }

    @Override
    protected int getResourceLayout() {
        return R.layout.activity_detail;
    }

    @Override
    public void setWeatherInfo(WeatherInfo weatherInfo) {
        Log.e(".....",weatherInfo.getRetData().getToday().getAqi());
    }

    @Override
    public void loadError(Throwable e) {
        Log.e("error..",e.fillInStackTrace().toString());
    }
}
