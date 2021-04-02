package com.anita.locationreminder.interfaces;

import com.anita.locationreminder.models.LongLat;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface APIEndPoints {
    @FormUrlEncoded

    @GET("users/logout")
    Call<Void> logout(@Header("Cookie") String cookie);

    @GET("api/")
    Call<List<LongLat>> getlonglat(@Header("Cookie") String cookie);

    @POST("api/create/")
    Call<ResponseBody> postlonglat(/*@Header("Cookie") String cookie, */@Body LongLat longLat);

    @PUT("api/{id}/edit/")//longlatId
    Call<Void> updatelonglat(/*@Header("Cookie") String cookie, */@Path("id") String id, @Body LongLat longLat);

    @DELETE("api/{id}/delete/")
    Call<Void> deletelonglat(/*@Header("Cookie") String cookie, */@Path("id") String id);
}


