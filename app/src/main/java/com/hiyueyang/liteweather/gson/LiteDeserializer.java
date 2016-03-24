package com.hiyueyang.liteweather.gson;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.hiyueyang.liteweather.entity.WeatherLite;

import java.lang.reflect.Type;

/**
 * Created by YueYang on 2016/3/24.
 */
public class LiteDeserializer implements JsonDeserializer<WeatherLite> {

    @Override
    public WeatherLite deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonElement weatherLite = json.getAsJsonObject().get("retData");
        return new Gson().fromJson(weatherLite,WeatherLite.class);
    }


}
