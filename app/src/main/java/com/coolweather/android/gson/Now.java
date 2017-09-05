package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 杨大荣 on 2017/9/4.
 */

public class Now {
    @SerializedName("tem")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
