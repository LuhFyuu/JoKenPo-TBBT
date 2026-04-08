package com.example.jokenpo_thebigbangtheory;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class RegrasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regras);

        Button btnVoltar = findViewById(R.id.btnVoltarMenu);
        Button btnJogar = findViewById(R.id.btnJogar);

        btnVoltar.setOnClickListener(v -> {
            finish();
        });

        btnJogar.setOnClickListener(v -> {
            Intent intent = new Intent(RegrasActivity.this, JogarActivity.class);
            startActivity(intent);

            finish();
        });
    }
}
