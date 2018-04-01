package com.example.myweatherapp.gson;


import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by yangyang on 2018/3/31.
 */

public class Weather {
    //返回的天气数据包含一个status，成功则ok ,失败则返回失败原因，
    //此处添加对应字段接收
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast>forecastList;
}
