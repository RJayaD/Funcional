package com.example.funcional;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    public static final String BASE_URL = "https://api.jsonbin.io/b/";
    @GET("5efe857d0bab551d2b6af8b1")
    Call<List<Datum>> getDatos();
}

