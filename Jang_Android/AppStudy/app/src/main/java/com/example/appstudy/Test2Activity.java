package com.example.appstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class Test2Activity extends AppCompatActivity {
    ImageView Rock,Paper,Scissor;
    CheckBox cbRock,cbPaper,cbScissor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        Rock = findViewById(R.id.imgRock);
        Paper = findViewById(R.id.imgPaper);
        Scissor = findViewById(R.id.imgScissor);

        cbRock = findViewById(R.id.cbRock);
        cbPaper = findViewById(R.id.cbPaper);
        cbScissor = findViewById(R.id.cbScissor);

        Rock.setVisibility(View.INVISIBLE);
        Paper.setVisibility(View.INVISIBLE);
        Scissor.setVisibility(View.INVISIBLE);

        cbRock.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (cbRock.isChecked()) {
                    Rock.setVisibility(View.VISIBLE);
                } else {
                    Rock.setVisibility(View.GONE);
                }
            }
        });

        cbPaper.setOnCheckedChangeListener((compoundButton, b) -> {
            if (cbPaper.isChecked()) {
                Paper.setVisibility(View.VISIBLE);
            } else {
                Paper.setVisibility(View.GONE);
            }
        });

        cbScissor.setOnCheckedChangeListener((compoundButton, b) -> {
            if (cbScissor.isChecked()) {
                Scissor.setVisibility(View.VISIBLE);
            } else {
                Scissor.setVisibility(View.GONE);
            }
        });
    }
}