package com.example.camera;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {

    @FormUrlEncoded
    @POST("upload")
    Call<MyResponse>uploadImage(@Field("image")String image);
}