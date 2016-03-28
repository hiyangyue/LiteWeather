package com.hiyueyang.liteweather.ui.actvity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.hiyueyang.liteweather.R;
import com.lapism.searchview.view.SearchView;

import butterknife.Bind;

/**
 * Created by YueYang on 2016/3/23.
 */
public class SearchActivity extends BaseActivity {


    @Bind(R.id.searchView)
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initSearchView();
    }

    @Override
    protected int getResourceLayout() {
        return R.layout.fragment_search;
    }

    public void initSearchView(){
        searchView.show(true);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Intent intent = getIntent();
                intent.putExtra(MainActivity.CITY_NAME,query);
                setResult(RESULT_OK,intent);
                finish();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }

}
