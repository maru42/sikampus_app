package com.example.sikampus_app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
    }

    // Metode untuk menangani klik pada tombol kembali
    public void onProfileBackClick(View view) {
        finish(); // Menutup ProfileActivity dan kembali ke MainActivity
    }
    public void onLogOutClick(View view) {
        // Hapus data login atau lakukan proses logout
        // Contoh: Hapus token dari SharedPreferences

        SharedPreferences sharedPreferences = getSharedPreferences("user_prefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove("user_token"); // Hapus token atau data login
        editor.apply();

        // Arahkan ke halaman login
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish(); // Tutup Activity saat ini
    }

}
