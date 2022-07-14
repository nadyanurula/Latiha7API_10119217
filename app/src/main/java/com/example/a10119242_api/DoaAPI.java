package com.example.a10119242_api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DoaAPI   {
    @GET("/api")
    Call<List<Post>> getPost();
}