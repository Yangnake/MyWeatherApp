package com.example.myweatherapp.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yangyang on 2018/3/31.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
