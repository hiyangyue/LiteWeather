package com.hiyueyang.liteweather.ui.actvity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.View;

import com.hiyangyue.model.model.entity.WeatherLite;
import com.hiyueyang.liteweather.R;
import com.hiyueyang.liteweather.ui.WeatherLitePresenter;
import com.hiyueyang.liteweather.ui.adapter.LiteWeatherAdapter;
import com.hiyueyang.liteweather.ui.view.SnackUtils;
import com.hiyueyang.liteweather.ui.view.WeatherLiteView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by YueYang on 2016/3/23.
 */
public class MainActivity extends BaseActivity implements WeatherLiteView {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.rl)
    RecyclerView rl;
    @Bind(R.id.fab)
    FloatingActionButton fab;

    private WeatherLitePresenter mPresenter;
    private LiteWeatherAdapter mLiteAdapter;
    private List<WeatherLite> weatherLiteList;
    public static final String START_DETAIL = "detail";
    public static final int FAB_REQUEST = 101;
    public static final String CITY_NAME = "city_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initToolbar(toolbar);
        initRecyclerView();
        mPresenter = new WeatherLitePresenter(this);
        mPresenter.getWeatherLite("南京");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == FAB_REQUEST && resultCode == RESULT_OK){
//            Log.e("onActivityResult",data.getStringExtra(CITY_NAME));
            mPresenter.getWeatherLite(data.getStringExtra(CITY_NAME));
        }
        super.onActivityResult(requestCode, resultCode, data);
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


    private void initRecyclerView() {
        weatherLiteList = new ArrayList<>();
        mLiteAdapter = new LiteWeatherAdapter(this, weatherLiteList);
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
        SnackUtils.showSnackbar(rl,"May be cityName not true");
    }

    public void startSearchView(View view){
        startActivityForResult(new Intent(this,SearchActivity.class),FAB_REQUEST);
    }

    private void startDetailActivity(String cityName) {
        Intent intent = new Intent(this, WeatherDetailActivity.class);
        intent.putExtra(START_DETAIL, cityName);
        startActivity(intent);
    }

}














