package com.example.skatingjudge;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @id86240433 (@Override)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button btnStart = findViewById(R.id.btnStart);
        btnStart.setOnClickListener(v -> {
            // Здесь будет переход к регистрации
        });
    }
}