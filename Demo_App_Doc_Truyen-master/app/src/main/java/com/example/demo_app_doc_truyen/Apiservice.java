package com.example.demo_app_doc_truyen;

import com.example.demo_app_doc_truyen.Model.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Apiservice {

//    Gson gson = new GsonBuilder().setDateFormat("yyyy-MM:mm:ss")
//            .create();
//    Apiservice apiservice = new Retrofit.Builder()
//            .baseUrl("http://192.168.0.109:2000/api/")
//            .addConverterFactory(GsonConverterFactory.create(gson))
//            .build()
//            .create(Apiservice.class) ;
//    @GET("/user")
//    //@GET("Comics")
//    Call<List<Login_>> getListLogin_;
}
