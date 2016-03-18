package com.hiyueyang.liteweather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.hiyueyang.liteweather.bean.WeatherInfo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void query(String cityName){
        WeatherUtils.getWeatherInfo(cityName).enqueue(new Callback<WeatherInfo>() {
            @Override
            public void onResponse(Call<WeatherInfo> call, Response<WeatherInfo> response) {
                Log.e("success",response.body().getRetData().getToday().getAqi());
            }

            @Override
            public void onFailure(Call<WeatherInfo> call, Throwable t) {

            }
        });
    }
}
