package com.example.sikampus_app;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_password);
    }
    // Metode untuk menangani klik pada tombol kembali
    public void onForgotPassBackClick(View view) {
        finish(); // Menutup ForgotPassActivity dan kembali ke LoginActivity
    }
}
