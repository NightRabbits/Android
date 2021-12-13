package com.example.mystudy3;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btDrawTest, btIntentTest, btFileRWTest, btHiWidget, btWebTest, btTouchTest;

    public void InitFindview(){

        btDrawTest = findViewById(R.id.bt_DrawTest);
        btIntentTest = findViewById(R.id.bt_IntentTest);
        btFileRWTest = findViewById(R.id.bt_FileRwTest);
        btHiWidget = findViewById(R.id.bt_HiWidget);
        btWebTest = findViewById(R.id.bt_WebTest);
        btTouchTest = findViewById(R.id.bt_TouchTest);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitFindview();

        btDrawTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mInent = new Intent(MainActivity.this, DrawTestActivity.class);
                startActivity(mInent);
            }
        });
        btIntentTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mInent = new Intent(MainActivity.this, IntentTestActivity.class);
                startActivity(mInent);
            }
        });
        btFileRWTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mInent = new Intent(MainActivity.this, FileRWTestActivity.class);
                startActivity(mInent);
            }
        });
        btHiWidget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mInent = new Intent(MainActivity.this, StudyHiWidgetActivity.class);
                startActivity(mInent);
            }
        });
        btWebTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mInent = new Intent(MainActivity.this, WebTestActivity.class);
                startActivity(mInent);
            }
        });
        btTouchTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mInent = new Intent(MainActivity.this, TouchTestActivity.class);
                startActivity(mInent);
            }
        });
    }
}