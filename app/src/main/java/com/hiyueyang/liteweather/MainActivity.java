package com.hiyueyang.liteweather;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.hiyueyang.liteweather.bean.WeatherInfo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        query("北京");
    }

    private void query(String cityName){
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
