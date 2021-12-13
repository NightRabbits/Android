package com.example.appstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Test1Activity extends AppCompatActivity {
    Button btnTest;
    TextView tvTest;
    EditText edText1, edText2;
    RadioButton rbMinus, rbMulti, rbDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        btnTest = findViewById(R.id.btn_test);
        tvTest = findViewById(R.id.tvTest);
        edText1 = findViewById(R.id.ed_Test1);
        edText2 = findViewById(R.id.ed_Test2);
        rbMinus = findViewById(R.id.rb_Minus);
        rbMulti = findViewById(R.id.rb_Multi);
        rbDiv = findViewById(R.id.rb_Div);

        rbMinus.setChecked(false);

        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stest1 = edText1.getText().toString();
                String stest2 = edText2.getText().toString();

                int nNo1 = Integer.parseInt(stest1);
                int nNo2 = Integer.parseInt(stest2);
                int nResult = 0;

                if (rbMinus.isChecked()) {
                    nResult = nNo1 - nNo2;
                } else if (rbMulti.isChecked()) {
                    nResult = nNo1 * nNo2;
                } else if (rbDiv.isChecked()) {
                    if (nNo2 != 0) nResult = nNo1 / nNo2;
                }

                tvTest.setText(String.valueOf(nResult));

            }
        });
    }
}