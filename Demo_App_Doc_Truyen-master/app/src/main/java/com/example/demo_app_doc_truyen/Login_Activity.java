package com.example.demo_app_doc_truyen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.demo_app_doc_truyen.Model.Login_;
import com.google.android.material.textfield.TextInputLayout;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Login_Activity extends AppCompatActivity {
    private TextInputLayout txtUsername;
    private TextInputLayout txtPassword;
    private CheckBox checkRemeber;
    private Button btnDangnhap;
    private Button btnDangky;
    String token = null;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("ĐĂNG NHẬP");
        txtUsername = (TextInputLayout) findViewById(R.id.edtUser);
        txtPassword = (TextInputLayout) findViewById(R.id.edtPass);
        btnDangnhap = (Button) findViewById(R.id.btnDangNhap);
        checkRemeber = (CheckBox) findViewById(R.id.checkRemeber);
        btnDangky = (Button) findViewById(R.id.btnDangKy);


        btnDangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                postLogin(txtUsername.getEditText().toString() , txtPassword.getEditText().toString());
            }
        });
        btnDangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DangKy_Activity.class);
                startActivity(intent);
            }
        });

        //

    }

    void postLogin(String Email, String Password) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.0.109:2000/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        API_user api_user = retrofit.create(API_user.class);
        Login_ login_ = new Login_(Email , Password) ;
        Call<Login_> call = api_user.posLogin(login_);
        call.enqueue(new Callback<Login_>() {
            @Override
            public void onResponse(Call<Login_> call, Response<Login_> response) {
                try {
                    Login_ login = response.body();
                    token= login.gettoken();
                    Log.e("TAG", "onResponse: "+ token );
                    if (token!= null)
                    {
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(Login_Activity.this , " Login không thành công ", Toast.LENGTH_LONG).show(); ;

                    }
                }
                catch (Exception e)
                {
                    Log.e("TAG1", "onResponse: "+e);
                    Toast.makeText(Login_Activity.this, "Login failed , Please check email or password", Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onFailure(Call<Login_> call, Throwable t) {

            }
        });
    }
}