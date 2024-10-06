package com.example.sikampus_app;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {

    private static final long SPLASH_DISPLAY_LENGTH = 1000; // Waktu tampilan splash screen (ms)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Handler untuk memulai LoginActivity setelah waktu SPLASH_DISPLAY_LENGTH
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                // Buat intent untuk LoginActivity
                Intent loginIntent = new Intent(SplashScreenActivity.this, LoginActivity.class);
                startActivity(loginIntent);

                // Tutup SplashScreenActivity agar tidak dapat dikembalikan dengan tombol back
                finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}