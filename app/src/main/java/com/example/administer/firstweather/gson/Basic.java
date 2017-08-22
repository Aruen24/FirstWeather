package com.example.administer.firstweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by administer on 2017/8/21.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}
