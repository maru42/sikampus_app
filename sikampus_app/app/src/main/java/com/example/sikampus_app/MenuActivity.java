package com.example.sikampus_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    // Metode untuk menangani klik pada tombol kembali
    public void onMenuBackClick(View view) {
        finish(); // Menutup MenuActivity dan kembali ke MainActivity
    }

    // Metode untuk menangani klik pada CardView Jadwal
    public void onMenuJadwalClick(View view) {
        Intent intent = new Intent(MenuActivity.this, ScheduleActivity.class);
        startActivity(intent);

    }
    // Metode untuk menangani klik pada CardView KRS
    public void onMenuKRSClick(View view) {
        showKrsAlert();  // Menampilkan dialog peringatan

    }
    // Metode untuk menampilkan dialog pemberitahuan "Pemilihan KRS belum dimulai"
    private void showKrsAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View dialogView = getLayoutInflater().inflate(R.layout.dialog_alert_krs, null);

        // Inisialisasi elemen-elemen dialog
        ImageView alertIcon = dialogView.findViewById(R.id.iv_alert_icon);
        TextView alertTitle = dialogView.findViewById(R.id.tv_alert_title);
        TextView alertMessage = dialogView.findViewById(R.id.tv_alert_message);
        Button btnOk = dialogView.findViewById(R.id.btn_alert_ok);

        // Set custom values untuk dialog
        alertIcon.setImageResource(R.drawable.ic_alert);
        alertTitle.setText(R.string.alert_title);
        alertMessage.setText(R.string.alert_message);

        builder.setView(dialogView);

        AlertDialog dialog = builder.create();

        btnOk.setOnClickListener(v -> dialog.dismiss());

        dialog.show();
    }

    // Metode untuk menangani klik dari android:onClick di XML untuk icon jadwal (ic_schedule)
    public void onMenuNewsClick(View view) {
        Intent intent = new Intent(MenuActivity.this, NewsActivity.class);
        startActivity(intent);
    }

    public void onMenuDosenClick(View view) {
        Intent intent = new Intent(MenuActivity.this, DosenActivity.class);
        startActivity(intent);
    }

    // Metode untuk menangani klik pada CardView KRS
    public void onMenuPaymentClick(View view) {
        showPaymentAlert();  // Menampilkan dialog peringatan

    }
    // Metode untuk menampilkan dialog pemberitahuan "Informasi Pembayaran Tidak Tersedia"
    private void showPaymentAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View dialogView = getLayoutInflater().inflate(R.layout.dialog_alert_payment, null);

        // Inisialisasi elemen-elemen dialog
        ImageView alertIcon = dialogView.findViewById(R.id.iv_alert_icon2);
        TextView alertTitle = dialogView.findViewById(R.id.tv_alert_title2);
        TextView alertMessage = dialogView.findViewById(R.id.tv_alert_message2);
        Button btnOk = dialogView.findViewById(R.id.btn_alert_ok2);

        // Set custom values untuk dialog
        alertIcon.setImageResource(R.drawable.ic_alert);
        alertTitle.setText(R.string.alert_title);
        alertMessage.setText(R.string.alert_message2);

        builder.setView(dialogView);

        AlertDialog dialog = builder.create();

        btnOk.setOnClickListener(v -> dialog.dismiss());

        dialog.show();
    }

    // Metode untuk menangani klik pada CardView KRS
    public void onMenuNilaiClick(View view) {
        showNilaiAlert();  // Menampilkan dialog peringatan

    }
    // Metode untuk menampilkan dialog pemberitahuan "Informasi Pembayaran Tidak Tersedia"
    private void showNilaiAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View dialogView = getLayoutInflater().inflate(R.layout.dialog_alert_nilai, null);

        // Inisialisasi elemen-elemen dialog
        ImageView alertIcon = dialogView.findViewById(R.id.iv_alert_icon3);
        TextView alertTitle = dialogView.findViewById(R.id.tv_alert_title3);
        TextView alertMessage = dialogView.findViewById(R.id.tv_alert_message3);
        Button btnOk = dialogView.findViewById(R.id.btn_alert_ok3);

        // Set custom values untuk dialog
        alertIcon.setImageResource(R.drawable.sorry_hand);
        alertTitle.setText(R.string.alert_title2);
        alertMessage.setText(R.string.alert_message3);

        builder.setView(dialogView);

        AlertDialog dialog = builder.create();

        btnOk.setOnClickListener(v -> dialog.dismiss());

        dialog.show();
    }

}
