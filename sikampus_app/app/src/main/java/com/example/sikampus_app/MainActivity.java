package com.example.sikampus_app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Metode untuk menangani klik dari android:onClick di XML untuk icon jadwal (ic_schedule)
    public void onScheduleClick(View view) {
        Intent intent = new Intent(MainActivity.this, ScheduleActivity.class);
        startActivity(intent);
    }

    // Metode untuk menangani klik dari android:onClick di XML untuk icon KRS (ic_krs)
    public void onKrsClick(View view) {
        showKrsAlert();
    }

    // Method untuk menampilkan dialog pemberitahuan "Pemilihan KRS belum dimulai"
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

    // Metode untuk menangani klik pada icon profil
    public void onProfileClick(View view) {
        Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(intent);
    }

    // Metode untuk menangani klik pada icon berita (news)
    public void onNewsClick(View view) {
        Intent intent = new Intent(MainActivity.this, NewsActivity.class);
        startActivity(intent);
    }

    // Fungsi onClick untuk tombol "Check out!"
    public void onCheckOutButtonClick(View view) {
        // Membuat intent untuk memulai NewsActivity
        Intent intent = new Intent(this, NewsActivity.class);
        startActivity(intent);
    }

    // Menambahkan method untuk onClick dari iconCenter
    public void onIconCenterClick(View view) {
        Intent intent = new Intent(MainActivity.this, MenuActivity.class);
        startActivity(intent);
    }
    public void onDosenClick(View view) {
        Intent intent = new Intent(MainActivity.this, DosenActivity.class);
        startActivity(intent);
    }

    public void onPopUp1Click(View v) {
        showPopupDialog(MainActivity.this);  // Memanggil metode untuk menampilkan dialog
    }

    public void showPopupDialog(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View dialogView = inflater.inflate(R.layout.schedule_popup_1, null);

        TextView titleTextView = dialogView.findViewById(R.id.dialog_title);
        TextView creditsTextView = dialogView.findViewById(R.id.dialog_credits);
        TextView instructorTextView = dialogView.findViewById(R.id.dialog_instructor);
        TextView scheduleTextView = dialogView.findViewById(R.id.dialog_schedule);
        TextView locationTextView = dialogView.findViewById(R.id.dialog_location);
        ImageButton closeButton = dialogView.findViewById(R.id.dialog_close_button);

        titleTextView.setText("Mobile Programming");
        creditsTextView.setText("3 SKS");
        instructorTextView.setText("Dosen: Dolly Virgian Sakha, S.Kom M.Kom");
        scheduleTextView.setText("Waktu: 10.40 - 13.20");
        locationTextView.setText("Ruangan: LABKOM 11");

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(dialogView);
        AlertDialog dialog = builder.create();

        closeButton.setOnClickListener(v -> dialog.dismiss());

        dialog.show();
    }

    public void onPopUp2Click(View v) {
        showSchedulePopup2(MainActivity.this);  // Memanggil metode untuk menampilkan dialog
    }

    public void showSchedulePopup2(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View dialogView = inflater.inflate(R.layout.schedule_popup_2, null);

        TextView titleTextView = dialogView.findViewById(R.id.dialog_title2);
        TextView creditsTextView = dialogView.findViewById(R.id.dialog_credits2);
        TextView instructorTextView = dialogView.findViewById(R.id.dialog_instructor2);
        TextView locationTextView = dialogView.findViewById(R.id.dialog_location2);
        TextView scheduleTextView = dialogView.findViewById(R.id.dialog_schedule2);
        ImageButton closeButton = dialogView.findViewById(R.id.dialog_close_button2);

        titleTextView.setText("Perancangan Basis Data");
        creditsTextView.setText("3 SKS");
        instructorTextView.setText("Dosen: Lauw Lie Hin, S.Kom M.Kom");
        locationTextView.setText("Ruangan: 4.3.3");
        scheduleTextView.setText("13.20 - 16.05 WIB");

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(dialogView);
        AlertDialog dialog = builder.create();

        closeButton.setOnClickListener(v -> dialog.dismiss());

        dialog.show();
    }


}
