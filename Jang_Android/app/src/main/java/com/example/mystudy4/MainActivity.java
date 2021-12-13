package com.example.mystudy4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btRps, btMone;
    ImageView imvR, imvP, imvS, imvR1, imvP1, imvS1;
    CheckBox chkR, chkS, chkP;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btRps = findViewById(R.id.btn_Rps);

    }
}