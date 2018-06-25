package com.example.sweetlife.sunshine.util;

import android.nfc.Tag;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WeatherDataParser {

    static final  String TAG = "WeatherDataParser";

    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {

        JSONObject weather = new JSONObject(weatherJsonStr);
        JSONArray days = weather.getJSONArray("list");
        JSONObject dayInfo = days.getJSONObject(dayIndex);
        JSONObject temperatureInfo = dayInfo.getJSONObject("temp");


        Log.d(TAG, temperatureInfo.getDouble("max")+"@@");

        return temperatureInfo.getDouble("max");
    }
}
