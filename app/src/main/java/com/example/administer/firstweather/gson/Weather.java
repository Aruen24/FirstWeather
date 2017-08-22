package com.example.administer.firstweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by administer on 2017/8/21.
 */

public class Weather {
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
