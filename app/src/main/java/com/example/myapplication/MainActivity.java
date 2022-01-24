package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonP;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonP = findViewById(R.id.imageButtonP);

        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Passive", Toast.LENGTH_SHORT).show();

            }
        });

    }

    public void openQ(View v) {
        Intent intent = new Intent(this, MainActivityQ.class);
        startActivity(intent);
    }

    public void openW(View v) {
        Intent intent = new Intent(this, MainActivityQ.class);
        startActivity(intent);
    }

    public void openE(View v) {
        Intent intent = new Intent(this, MainActivityQ.class);
        startActivity(intent);
    }

    public void openR(View v) {
        Intent intent = new Intent(this, MainActivityQ.class);
        startActivity(intent);
    }
}