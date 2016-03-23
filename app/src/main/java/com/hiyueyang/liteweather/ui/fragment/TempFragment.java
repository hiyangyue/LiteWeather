package com.hiyueyang.liteweather.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hiyueyang.liteweather.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by YueYang on 2016/3/22.
 */
public class TempFragment extends BaseFragment {


    @Bind(R.id.container)
    RecyclerView mRecyclerView;

    @Override
    public int getLayoutResource() {
        return R.layout.base_container;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
