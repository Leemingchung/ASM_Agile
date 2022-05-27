package com.example.demo_app_doc_truyen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.demo_app_doc_truyen.Model.User;
import com.google.android.material.textfield.TextInputLayout;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DangKy_Activity extends AppCompatActivity {
    TextInputLayout edtSDT, edtDC, edtHoTen, edtMk, edtMkck;
    Button btnDK, btnHuy;
    RadioButton rbNam;
    RadioGroup radioGroup;
    Intent intent;
    View loadingPB ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);
        setTitle("Dang Ky");
        setContentView(R.layout.activity_dang_ky);
        edtDC = findViewById(R.id.edtDiachi);
        edtHoTen = findViewById(R.id.edtHoTen);
        edtMk = findViewById(R.id.edtPassDk);
        edtMkck = findViewById(R.id.edtPassCk);
        edtSDT = findViewById(R.id.edtSDT);
        btnDK = findViewById(R.id.btnDangKyT);
        btnHuy = findViewById(R.id.btnHuy);
        radioGroup = findViewById(R.id.radioG);
        rbNam =findViewById(R.id.rbNam);
        rbNam=findViewById(R.id.rbNu);
        loadingPB = findViewById(R.id.idLoadingPB);
        // huy
        btnHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Login_Activity.class);
                startActivity(intent);
            }
        });
        // dk
        btnDK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
//    private void posData(String hoten ,String matkhau ,String nhaplaimk ,String sdt )
//    {
//        loadingPB.setVisibility(View.VISIBLE);
//        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://192.168.0.109:2000/api/reg")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build() ;
//        API_user api_user = retrofit.create(API_user.class);
//        User user = new User(hoten,matkhau,sdt,nhaplaimk);
//
//        Call<User> call =  api_user.createPost(user) ;
//        call.enqueue(new Callback<User>() {
//            @Override
//            public void onResponse(Call<User> call, Response<User> response) {
//
//            }
//
//            @Override
//            public void onFailure(Call<User> call, Throwable t) {
//
//            }
//        });
//
//    }
}