package com.example.mystudy3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class IntentTestActivity extends AppCompatActivity {

    EditText edtName, edtGameMoney;
    RadioButton rbVal, rbFlash;
    Button btSend;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_test);

        edtName = findViewById(R.id.edt_Name);
        edtGameMoney = findViewById(R.id.edt_GameMoney);
        rbVal  = findViewById(R.id.rb_Val);
        rbFlash = findViewById(R.id.rb_Flash);
        btSend = findViewById(R.id.bt_Send);
        tvResult = findViewById(R.id.tv_Result);

        btSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DisplayMetrics displayMetrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                int nDeviceWidth = displayMetrics.widthPixels;
                int nDeviceHeight = displayMetrics.heightPixels;

                String sName = edtName.getText().toString();
                String sMoney = edtGameMoney.getText().toString();

                int nMoney = Integer.parseInt(sMoney);
                int nGame = 0;
                if(rbVal.isChecked()){
                    nGame = 1;
                }
                else if (rbFlash.isChecked()){
                    nGame = 2;
                }
                tvResult.setText(sName + "," + sMoney + "," + nGame);

                Intent mInent = new Intent(IntentTestActivity.this, RecvTestActivity.class);
                mInent.putExtra("mName", sName);
                mInent.putExtra("GameMoney", sMoney);
                mInent.putExtra("GameType", nGame);
                mInent.putExtra("nWidth", nDeviceWidth);
                mInent.putExtra("nHeight", nDeviceHeight);
                startActivity(mInent);
            }
        });
    }
}