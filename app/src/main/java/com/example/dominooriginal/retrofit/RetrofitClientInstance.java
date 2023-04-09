package com.example.dominooriginal.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {
    public static Retrofit retrofit;
    private static final String BASE_URL = "http://192.168.5.92";

    public static Retrofit getRetrofit(){
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
