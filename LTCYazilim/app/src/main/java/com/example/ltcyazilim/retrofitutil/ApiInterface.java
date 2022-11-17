package com.example.ltcyazilim.retrofitutil;

import com.example.ltcyazilim.model.ApiResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {
    @FormUrlEncoded
    @POST("login.php")
    Call<ApiResponse> performUserLogin (@Field("kullanici_adi") String kullaniciAdi, @Field("sifre") String kullaniciSifre);


}

