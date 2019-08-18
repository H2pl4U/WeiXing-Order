package com.weixin.order.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author ilovejava1314
 * @date 2019/8/12 22:57
 */
public class JsonUtil {
    public static String toJson(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
