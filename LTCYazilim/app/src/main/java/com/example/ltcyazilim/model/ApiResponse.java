package com.example.ltcyazilim.model;

import com.google.gson.annotations.SerializedName;

public class ApiResponse {
    @SerializedName("status") //objeyi jsondakinden farklı isimlendirmek için kullanılır.
    private  String status; //durum

    @SerializedName("result_code")
    private int resultCode; //sonuc

    @SerializedName("kullanici_adi")
    private String name;

    public String getStatus() {
        return status;
    }

    public int getResultCode() {
        return resultCode;
    }

    public String getName() {
        return name;
    }
}