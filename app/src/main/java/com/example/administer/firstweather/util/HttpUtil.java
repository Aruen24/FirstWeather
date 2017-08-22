package com.example.administer.firstweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by administer on 2017/8/21.
 * 和服务器进行交互
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
