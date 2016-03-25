package com.hiyueyang.liteweather.ui.view;

import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Created by YueYang on 2016/3/25.
 */
public class SnackUtils {

    public static void showSnackbar(View view,String message){
        Snackbar snackbar = Snackbar.make(view,message,Snackbar.LENGTH_SHORT);
        snackbar.show();
    }

}
