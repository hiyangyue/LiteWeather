package com.hiyueyang.liteweather.network.gson;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.hiyueyang.liteweather.model.entity.WeatherInfo;

import java.lang.reflect.Type;

/**
 * Created by YueYang on 2016/3/25.
 */
public class WeatherDeserializer implements JsonDeserializer<WeatherInfo> {

    @Override
    public WeatherInfo deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonElement jsonElement = json.getAsJsonObject().get("retData");
        return new Gson().fromJson(jsonElement,WeatherInfo.class);
    }
}
