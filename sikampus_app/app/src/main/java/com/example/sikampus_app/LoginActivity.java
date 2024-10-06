package com.example.sikampus_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextUsername, editTextPassword;
    private Button loginButton;
    private TextView forgotPasswordText;
    private ProgressBar progressBar;

    // Data dummy untuk validasi username dan password
    private static final String VALID_USERNAME = "123456"; // Ganti dengan username yang valid
    private static final String VALID_PASSWORD = "password"; // Ganti dengan password yang valid

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);

        // Inisialisasi views
        editTextUsername = findViewById(R.id.et_nim);
        editTextPassword = findViewById(R.id.et_password);
        loginButton = findViewById(R.id.btn_login);
        progressBar = findViewById(R.id.loading);
        forgotPasswordText = findViewById(R.id.tv_forgot_password);

        // Set listener untuk tombol login
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                // Validasi jika username dan password kosong
                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Username or Password cannot be empty", Toast.LENGTH_SHORT).show();
                } else {
                    progressBar.setVisibility(View.VISIBLE);

                    // Cek username dan password
                    if (username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
                        Toast.makeText(LoginActivity.this, "Login success", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(intent);
                        finish(); // Menutup LoginActivity agar tidak bisa kembali dengan tombol back
                    } else {
                        Toast.makeText(LoginActivity.this, "Username or password is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    progressBar.setVisibility(View.GONE);
                }
            }
        });

        // Set listener untuk teks Forgot Password
        forgotPasswordText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuka ForgotPasswordActivity
                Intent intent = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
                startActivity(intent);            }
        });
    }
}
