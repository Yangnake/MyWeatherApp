package com.example.myweatherapp.gson;

/**
 * Created by yangyang on 2018/3/31.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
