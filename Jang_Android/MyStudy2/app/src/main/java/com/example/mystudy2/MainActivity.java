package com.example.mystudy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btStudyWidget, btScrollWidget;

    private void InitFindView() {
        btStudyWidget = findViewById(R.id.btStudyWidget);
        btScrollWidget = findViewById(R.id.btScrollWidget);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitFindView();
    }

    public void onStudyWidgetClick(View view) {
        Intent myIntent = new Intent(getApplicationContext(),StudyWidgetActivity.class);
        startActivity(myIntent);
    }

    public void onScrollWidgetClick(View view) {
        Intent myIntent = new Intent(getApplicationContext(),StudyWidgetActivity.class);
        startActivity(myIntent);
    }

    public void onSlidingWidgetClick(View view) {
        Intent myIntent = new Intent(getApplicationContext(),SlidingWidgetActivity.class);
        startActivity(myIntent);
    }

    public void onFlipperWidgetClick(View view) {
        Intent myIntent = new Intent(getApplicationContext(),FlipperWidgetActivity.class);
        startActivity(myIntent);
    }
}