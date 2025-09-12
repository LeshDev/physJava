package com.example.physjava;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        TextView tvBack = findViewById(R.id.tvBack);
        tvBack.setOnClickListener(v -> {
            Intent intent = new Intent(NewsActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}