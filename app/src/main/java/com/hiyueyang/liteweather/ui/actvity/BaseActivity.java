package com.hiyueyang.liteweather.ui.actvity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by YueYang on 2016/3/23.
 */
public abstract class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getResourceLayout());
    }

    protected abstract int getResourceLayout();

}
