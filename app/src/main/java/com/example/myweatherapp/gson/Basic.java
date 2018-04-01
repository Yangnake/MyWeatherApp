package com.example.myweatherapp.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yangyang on 2018/3/31.
 */

public class Basic {
    //JSON中的字段不太适合java字段的命名,因此这里使用了@Se..来让JSON字段和JAVA字段之间建立映射关系
    //为每一个变量添加 @SerializedName 注解，这样在解析的时候就能转换成注解标示的字段名
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
