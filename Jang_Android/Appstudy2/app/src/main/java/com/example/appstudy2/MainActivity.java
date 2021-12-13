package com.example.appstudy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btStudyDraw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btStudyDraw = findViewById(R.id.btStudyDraw);

        btStudyDraw.setOnClickListener(view -> {
            Intent myIntent = new Intent(this, DrawActivity.class);
            startActivity(myIntent);
        });
    }
}