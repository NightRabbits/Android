package com.example.mystudy3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;

public class TestTimeActivity extends AppCompatActivity {

    Button btDateOK;
    TimePicker tpTime;
    EditText edtTime;
    int nSelTime, nSelMin;

    public void InitFindview(){
        btDateOK = findViewById(R.id.bt_DateOK);
        tpTime = findViewById(R.id.tp_Time);
        edtTime = findViewById(R.id.edt_Time);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_time);

        InitFindview();

        tpTime.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1) {
                nSelTime = tpTime.getCurrentHour();
                nSelMin = tpTime.getCurrentMinute();

                edtTime.setText(Integer.toString(nSelTime)+ ":" + Integer.toString(nSelMin));
            }
        });
    }
    public void onTimeButtonClick(View view) {
        nSelTime = tpTime.getCurrentHour();
        nSelMin = tpTime.getCurrentMinute();

        edtTime.setText(Integer.toString(nSelTime)+ ":" + Integer.toString(nSelMin));
    }
}