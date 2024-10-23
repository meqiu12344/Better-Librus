package com.example.mobilna.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static final String BASE_URL = "http://10.25.250.184:8000/api/";
    private static Retrofit retofit;

    public static Retrofit getRetrofitInstance(){
        if (retofit == null) {
            retofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retofit;
    }


}
