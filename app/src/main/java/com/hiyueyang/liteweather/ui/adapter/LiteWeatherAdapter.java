package com.hiyueyang.liteweather.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hiyueyang.liteweather.R;
import com.hiyangyue.model.model.entity.WeatherLite;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by YueYang on 2016/3/24.
 */
public class LiteWeatherAdapter extends RecyclerView.Adapter<LiteWeatherAdapter.ViewHolder>{

    private List<WeatherLite> weatherLites;
    private Context context;
    private static OnItemClickListener listener;

    public LiteWeatherAdapter(Context context, List<WeatherLite> weatherLites) {
        this.weatherLites = weatherLites;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_lite, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        WeatherLite lite = weatherLites.get(position);
        holder.tvCity.setText(lite.getCity());
        holder.tvProvince.setText(lite.getPinyin());
        holder.tvDegree.setText(lite.getTemp());
        holder.tvTime.setText(lite.getTime());
//        holder.ivTemp.setImageDrawable(R.drawable.icon_cloudy);
    }

    @Override
    public int getItemCount() {
        return weatherLites.size();
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        this.listener = listener;
    }

    public interface OnItemClickListener{
        void onItemClicked(View view,String cityName);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        @Bind(R.id.tv_city)
        TextView tvCity;
        @Bind(R.id.tv_province)
        TextView tvProvince;
        @Bind(R.id.tv_degree)
        TextView tvDegree;
        @Bind(R.id.iv_temp)
        ImageView ivTemp;
        @Bind(R.id.tv_time)
        TextView tvTime;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (listener != null){
                listener.onItemClicked(v,tvCity.getText().toString());
            }
        }
    }
}
