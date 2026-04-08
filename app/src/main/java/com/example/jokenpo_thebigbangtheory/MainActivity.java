package com.example.jokenpo_thebigbangtheory;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRegras = findViewById(R.id.btnRegras);
        Button btnJogar = findViewById(R.id.btnJogar);

        btnRegras.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RegrasActivity.class);
            startActivity(intent);
        });

        btnJogar.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, JogarActivity.class);
            startActivity(intent);
        });
    }
}