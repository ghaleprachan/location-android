package com.anita.locationreminder.interfaces;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Url {
    private static Retrofit retrofit;
    public static String cookie = "";

    public static APIEndPoints getEndPoints(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    //.baseUrl("http://b014c778e636.ngrok.io/")
                    .baseUrl("http://7ba3b18b6512.ngrok.io/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(APIEndPoints.class);
    }
}


