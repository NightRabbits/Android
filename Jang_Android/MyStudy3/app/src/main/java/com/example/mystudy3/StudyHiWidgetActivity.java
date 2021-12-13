package com.example.mystudy3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class StudyHiWidgetActivity extends AppCompatActivity {
    Button btTestTime, btTestSv, btTestSDraw;

    public void InitFindview() {
        btTestTime = findViewById(R.id.bt_TsetTime);
        btTestSv = findViewById(R.id.bt_TestSv);
        btTestSDraw = findViewById(R.id.bt_TestSDraw);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_hi_widget);

        InitFindview();

    }
    public void onTestTimeClick(View view){
        Intent mInent = new Intent(StudyHiWidgetActivity.this, TestTimeActivity.class);
        startActivity(mInent);
    }
    public void onTestSvClick(View view){
        Intent mInent = new Intent(StudyHiWidgetActivity.this, TestSVActivity.class);
        startActivity(mInent);
    }
    public void onTestSDrawClick(View view){
        Intent mInent = new Intent(StudyHiWidgetActivity.this, TestSDrawActivity.class);
        startActivity(mInent);
    }
    public void onTestFlipperClick(View view){
        Intent mInent = new Intent(StudyHiWidgetActivity.this, TestFlipperActivity.class);
        startActivity(mInent);
    }
}