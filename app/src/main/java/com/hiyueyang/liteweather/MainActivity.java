package com.hiyueyang.liteweather;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.hiyueyang.liteweather.bean.WeatherInfo;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    private void query(String cityName) {
        WeatherUtils.getWeatherObser(cityName, new WeatherUtils.ObserableCallback() {

            @Override
            public void onError(Throwable throwable) {
                Log.e("compete", throwable.fillInStackTrace().toString());
            }

            @Override
            public void onNext(WeatherInfo weatherInfo) {
                Log.e("next", "..." + weatherInfo.getRetData().getToday().getCurTemp());
            }
        });
    }

}
