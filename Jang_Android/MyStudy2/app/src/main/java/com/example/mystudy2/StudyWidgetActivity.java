package com.example.mystudy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudyWidgetActivity extends AppCompatActivity {

    Button btnTimeTest;

    private void InitFindView() {
        btnTimeTest = findViewById(R.id.btnTimeTest);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_widget);

        InitFindView();
    }

    public void onTimeTestClick(View view) {
        Intent myIntent = new Intent(getApplicationContext(),TimeTestActivity.class);
        startActivity(myIntent);
    }
}