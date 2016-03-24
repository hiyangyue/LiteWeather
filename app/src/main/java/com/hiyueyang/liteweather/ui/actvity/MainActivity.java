package com.hiyueyang.liteweather.ui.actvity;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;

import com.hiyueyang.liteweather.R;
import com.hiyueyang.liteweather.entity.WeatherLite;
import com.hiyueyang.liteweather.presenter.WeatherLitePresenter;
import com.hiyueyang.liteweather.ui.view.WeatherLiteView;

import butterknife.Bind;

/**
 * Created by YueYang on 2016/3/23.
 */
public class MainActivity extends BaseActivity implements WeatherLiteView{

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.rl)
    RecyclerView rl;

    private WeatherLitePresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initToolbar(toolbar);
        mPresenter = new WeatherLitePresenter(this);
        mPresenter.getWeatherLite("南京");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    protected int getResourceLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void setWeatherLite(WeatherLite weatherLite) {
        Log.e("success",weatherLite.getRetData().getCity());
    }

    @Override
    public void loadError(Throwable throwable) {
        Log.e("error","..." + throwable.fillInStackTrace().toString());
    }
}
