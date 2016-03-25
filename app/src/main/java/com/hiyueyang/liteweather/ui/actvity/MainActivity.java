package com.hiyueyang.liteweather.ui.actvity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;

import com.hiyueyang.liteweather.R;
import com.hiyangyue.model.model.entity.WeatherLite;
import com.hiyueyang.liteweather.presenter.WeatherLitePresenter;
import com.hiyueyang.liteweather.ui.adapter.LiteWeatherAdapter;
import com.hiyueyang.liteweather.ui.view.WeatherLiteView;

import java.util.ArrayList;
import java.util.List;

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
    private LiteWeatherAdapter mLiteAdapter;
    private List<WeatherLite> weatherLiteList;
    public static final String START_DETAIL = "detail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initToolbar(toolbar);
        initRecyclerView();
        mPresenter = new WeatherLitePresenter(this);
        mPresenter.getWeatherLite("南京");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    protected void initToolbar(Toolbar toolbar) {
        super.initToolbar(toolbar);
        getSupportActionBar().setTitle(getResources().getString(R.string.toolbar_title));
    }

    @Override
    protected int getResourceLayout() {
        return R.layout.activity_main;
    }


    private void initRecyclerView(){
        weatherLiteList = new ArrayList<>();
        mLiteAdapter = new LiteWeatherAdapter(this,weatherLiteList);
        mLiteAdapter.setOnItemClickListener(new LiteWeatherAdapter.OnItemClickListener() {
            @Override
            public void onItemClicked(View view, String cityName) {
                startDetailActivity(cityName);
            }
        });
        rl.setAdapter(mLiteAdapter);
        rl.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void setWeatherLite(WeatherLite weatherLite) {
        weatherLiteList.add(weatherLite);
        mLiteAdapter.notifyItemInserted(weatherLiteList.size());
    }

    @Override
    public void loadError(Throwable throwable) {

    }

    private void startDetailActivity(String cityName){
        Intent intent = new Intent(this,WeatherDetailActivity.class);
        intent.putExtra(START_DETAIL,cityName);
        startActivity(intent);
    }




















}
