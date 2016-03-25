package com.hiyueyang.liteweather.ui.actvity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.hiyueyang.liteweather.R;
import com.hiyueyang.liteweather.model.entity.WeatherInfo;
import com.hiyueyang.liteweather.presenter.WeatherPresenter;
import com.hiyueyang.liteweather.ui.view.SnackUtils;
import com.hiyueyang.liteweather.ui.view.WeatherView;

import butterknife.Bind;

public class WeatherDetailActivity extends BaseActivity implements WeatherView {


    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.collapsing_toolbar)
    CollapsingToolbarLayout collapsingToolbar;
    @Bind(R.id.iv_cloth_advice)
    TextView ivClothAdvice;
    @Bind(R.id.tv_cloth)
    TextView tvCloth;
    @Bind(R.id.iv_cloth_cold)
    TextView ivClothCold;
    @Bind(R.id.tv_cold)
    TextView tvCold;
    @Bind(R.id.iv_cloth_sport)
    TextView ivClothSport;
    @Bind(R.id.tv_sport)
    TextView tvSport;
    @Bind(R.id.tv_temp_day_1)
    TextView tvTempDay1;
    @Bind(R.id.tv_temp_detail_1)
    TextView tvTempDetail1;
    @Bind(R.id.tv_temp_day_2)
    TextView tvTempDay2;
    @Bind(R.id.tv_temp_detail_2)
    TextView tvTempDetail2;
    @Bind(R.id.tv_temp_day_3)
    TextView tvTempDay3;
    @Bind(R.id.tv_temp_detail_3)
    TextView tvTempDetail3;
    @Bind(R.id.appbar)
    AppBarLayout appbar;
    @Bind(R.id.iv_cloth)
    ImageView ivCloth;
    @Bind(R.id.iv_cold)
    ImageView ivCold;
    @Bind(R.id.iv_sport)
    ImageView ivSport;
    @Bind(R.id.iv_temp_1)
    ImageView ivTemp1;
    @Bind(R.id.tv_low_1)
    TextView tvLow1;
    @Bind(R.id.tv_high_1)
    TextView tvHigh1;
    @Bind(R.id.iv_temp_2)
    ImageView ivTemp2;
    @Bind(R.id.tv_low_2)
    TextView tvLow2;
    @Bind(R.id.tv_high_2)
    TextView tvHigh2;
    @Bind(R.id.iv_temp_3)
    ImageView ivTemp3;
    @Bind(R.id.tv_low_3)
    TextView tvLow3;
    @Bind(R.id.tv_high_3)
    TextView tvHigh3;


    private String cityName;
    private WeatherPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getCityName();
        initToolbar(toolbar);
        mPresenter = new WeatherPresenter(this);
        mPresenter.getWeatherInfo(cityName);
    }

    @Override
    protected int getResourceLayout() {
        return R.layout.activity_detail;
    }

    @Override
    protected void initToolbar(Toolbar toolbar) {
        super.initToolbar(toolbar);
        getSupportActionBar().setTitle(cityName);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void getCityName() {
        Intent intent = getIntent();
        cityName = intent.getStringExtra(MainActivity.START_DETAIL);
    }

    @Override
    public void setWeatherInfo(WeatherInfo weatherInfo) {
        tvCloth.setText(weatherInfo.getToday().getIndex().get(2).getDetails());
        tvCold.setText(weatherInfo.getToday().getIndex().get(1).getDetails());
        tvSport.setText(weatherInfo.getToday().getIndex().get(3).getDetails());

        tvTempDay1.setText(weatherInfo.getForecast().get(0).getWeek());
        tvTempDay2.setText(weatherInfo.getForecast().get(1).getWeek());
        tvTempDay3.setText(weatherInfo.getForecast().get(2).getWeek());

        tvTempDetail1.setText(weatherInfo.getForecast().get(0).getFengli());
        tvTempDetail2.setText(weatherInfo.getForecast().get(1).getFengli());
        tvTempDetail3.setText(weatherInfo.getForecast().get(2).getFengli());

        tvLow1.setText(weatherInfo.getForecast().get(0).getLowtemp());
        tvLow2.setText(weatherInfo.getForecast().get(1).getLowtemp());
        tvLow3.setText(weatherInfo.getForecast().get(2).getLowtemp());

        tvHigh1.setText(weatherInfo.getForecast().get(0).getHightemp());
        tvHigh2.setText(weatherInfo.getForecast().get(1).getHightemp());
        tvHigh3.setText(weatherInfo.getForecast().get(2).getHightemp());

    }

    @Override
    public void loadError(Throwable e) {
        SnackUtils.showSnackbar(toolbar, getString(R.string.load_error));
    }
}

















