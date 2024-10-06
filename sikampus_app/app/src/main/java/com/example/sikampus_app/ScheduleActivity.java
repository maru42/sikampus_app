package com.example.sikampus_app;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ScheduleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule);
    }

    // Metode untuk menangani klik pada tombol kembali
    public void onJadwalBackClick(View view) {
        finish(); // Menutup ProfileActivity dan kembali ke MainActivity
    }
}
