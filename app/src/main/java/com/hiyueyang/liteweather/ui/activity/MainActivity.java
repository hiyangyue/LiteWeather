package com.hiyueyang.liteweather.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.hiyueyang.liteweather.R;
import com.hiyueyang.liteweather.entity.WeatherInfo;
import com.hiyueyang.liteweather.presenter.WeatherPresenter;
import com.hiyueyang.liteweather.ui.view.WeatherView;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements WeatherView{

    private WeatherPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        mPresenter = new WeatherPresenter(this);
        mPresenter.setWeatherInfo("南京");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }

    @Override
    public void setWeatherInfo(WeatherInfo weatherInfo) {
        Log.e("load_success...",weatherInfo.getRetData().getToday().getAqi());
    }

    @Override
    public void loadError(Throwable e) {
        Log.e("load_error",e.fillInStackTrace().toString());
    }
}
