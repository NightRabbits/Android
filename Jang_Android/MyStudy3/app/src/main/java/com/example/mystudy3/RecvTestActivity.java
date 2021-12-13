package com.example.mystudy3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class RecvTestActivity extends AppCompatActivity {

    EditText edtRName, edtRMoney;
    RadioButton rbRVal, rbRFlash;
    TextView tvScrWidth, tvScrHeight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recv_test);

        edtRName = findViewById(R.id.edt_rName);
        edtRMoney = findViewById(R.id.edt_rMoney);
        rbRVal = findViewById(R.id.rb_rVal);
        rbRFlash = findViewById(R.id.rb_rFlash);
        tvScrWidth = findViewById(R.id.tv_ScrWidth);
        tvScrHeight = findViewById(R.id.tv_ScrHeight);

        Intent TestIntent = getIntent();
        String sMyName = TestIntent.getStringExtra("mName");
        int nMyMoney = TestIntent.getIntExtra("nMoney",1);
        int nGame = TestIntent.getIntExtra("GameType",0);
        int nWidth = TestIntent.getIntExtra("nWidth", 0);
        int nHeight = TestIntent.getIntExtra("nHeight", 0);
        if(nGame == 1){
            rbRVal.setChecked(true);
        }
        else if(nGame == 2){
            rbRFlash.setChecked(true);
        }
        edtRName.setText(sMyName);
        edtRMoney.setText(nMyMoney + "");
        tvScrWidth.setText(nWidth+"");
        tvScrHeight.setText(nHeight+"");

    }
}