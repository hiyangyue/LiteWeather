package com.hiyangyue.model.model.network.gson;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.hiyangyue.model.model.entity.WeatherLite;

import java.lang.reflect.Type;

/**
 * Created by YueYang on 2016/3/24.
 */
public class LiteSerializer implements JsonSerializer<WeatherLite> {
    @Override
    public JsonElement serialize(WeatherLite src, Type typeOfSrc, JsonSerializationContext context) {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("city",src.getCity());
        jsonObject.addProperty("pinyin",src.getPinyin());
        jsonObject.addProperty("time",src.getTime());
        jsonObject.addProperty("temp",src.getTemp());
        return jsonObject;
    }
}
