package com.example.demo_app_doc_truyen;

import com.example.demo_app_doc_truyen.Model.Login_;
import com.example.demo_app_doc_truyen.Model.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface API_user {
    @POST("login")
    Call<Login_> posLogin(@Body Login_ login_);
//    @POST("reg")
//    Call<List<Login_>> postReg(@Body Users users);
}
