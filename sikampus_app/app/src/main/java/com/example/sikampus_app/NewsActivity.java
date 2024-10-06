package com.example.sikampus_app;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewsActivity extends AppCompatActivity {

    // Deklarasi variabel untuk komponen view
    private EditText searchBar;
    private LinearLayout newsLayout1, newsLayout2;
    private TextView newsTitle1, newsTitle2, newsSummary1, newsSummary2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news);

        // Inisialisasi view dari layout XML
        searchBar = findViewById(R.id.search_bar);
        newsLayout1 = findViewById(R.id.news_layout1);
        newsLayout2 = findViewById(R.id.news_layout2);
        newsTitle1 = findViewById(R.id.news_title1);
        newsTitle2 = findViewById(R.id.news_title2);
        newsSummary1 = findViewById(R.id.news_summary1);
        newsSummary2 = findViewById(R.id.news_summary2);

        // Menambahkan TextWatcher untuk search bar
        searchBar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Tidak digunakan
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Memanggil metode untuk melakukan filter
                filterNews(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                // Tidak digunakan
            }
        });
    }

    private void filterNews(String query) {
        // Mengambil teks dari search bar dan melakukan filter berita
        String lowerCaseQuery = query.toLowerCase();

        // Memeriksa judul dan ringkasan berita pertama
        if (newsTitle1.getText().toString().toLowerCase().contains(lowerCaseQuery) ||
                newsSummary1.getText().toString().toLowerCase().contains(lowerCaseQuery)) {
            newsLayout1.setVisibility(View.VISIBLE);
        } else {
            newsLayout1.setVisibility(View.GONE);
        }

        // Memeriksa judul dan ringkasan berita kedua
        if (newsTitle2.getText().toString().toLowerCase().contains(lowerCaseQuery) ||
                newsSummary2.getText().toString().toLowerCase().contains(lowerCaseQuery)) {
            newsLayout2.setVisibility(View.VISIBLE);
        } else {
            newsLayout2.setVisibility(View.GONE);
        }
    }

    // Metode onClick untuk tombol kembali
    public void onNewsBackClick(View view) {
        onBackPressed();
    }
}
