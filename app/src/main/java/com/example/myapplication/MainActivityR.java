package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivityR extends AppCompatActivity {

    private Button buttonR;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_r);

        buttonR = findViewById(R.id.imageButtonR);

        buttonR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivityR.this, "Skill R", Toast.LENGTH_SHORT).show();

            }
        });

    }

    public void openP(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openQ(View v) {
        Intent intent = new Intent(this, MainActivityQ.class);
        startActivity(intent);
    }

    public void openW(View v) {
        Intent intent = new Intent(this, MainActivityW.class);
        startActivity(intent);
    }

    public void openE(View v) {
        Intent intent = new Intent(this, MainActivityE.class);
        startActivity(intent);
    }
}