package com.example.mystudy2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

public class TimeTestActivity extends AppCompatActivity {

    Button btTimeOK;
    TimePicker tpTime;
    EditText edTime;
    int nSelHour, nSelMin;

    private void InitFindView() {
        btTimeOK = findViewById(R.id.btTimeOK);
        tpTime = findViewById(R.id.tpTime);
        edTime = findViewById(R.id.edTime);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_test);

        InitFindView();
    }

    @SuppressLint("SetTextI18n")
    public void onTimeOKClick(View view) {
        nSelHour = tpTime.getCurrentHour();
        nSelMin = tpTime.getCurrentMinute();
        edTime.setText(nSelHour + ":" + nSelMin);
    }
}