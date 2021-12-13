package com.example.mystudy1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class WTest2Activity extends AppCompatActivity {

    EditText edTest, edCheck;
    Button btTest;
    TextView tvTest;

    EditText edNum1, edNum2;
    Button btCalcu;
    TextView tvResult;

    RadioButton rbMinus, rbMulti, rbDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wtest2);

        edTest = findViewById(R.id.edt_Test);
        edCheck = findViewById(R.id.edt_Check);
        btTest = findViewById(R.id.btn_Test);
        tvTest = findViewById(R.id.txv_Test);

        edNum1 = findViewById(R.id.edt_Num1);
        edNum2 = findViewById(R.id.edt_Num2);
        btCalcu = findViewById(R.id.btn_Calcu);
        tvResult = findViewById(R.id.txv_Result);

        rbMinus = findViewById(R.id.rb_Minus);
        rbMulti = findViewById(R.id.rb_Multi);
        rbDiv = findViewById(R.id.rb_Div);

        String sTemp = tvTest.getText().toString();
        edTest.setText(sTemp);

        rbMinus.setChecked(true);

        btTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String sText = edTest.getText().toString();
               tvTest.setText(sText);

               String sCheck = edCheck.getText().toString();
               if(sText.equals(sCheck) ){
                   Toast.makeText(getApplicationContext(), "Equal", Toast.LENGTH_SHORT).show();
                   tvTest.setText("Equal");
               }
               else{
                   Toast.makeText(getApplicationContext(), "Not", Toast.LENGTH_SHORT).show();
                   tvTest.setText("Not");
               }
            }
        });
        btCalcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sNum1 = edNum1.getText().toString();
                String sNum2 = edNum2.getText().toString();

                int nNum1 = Integer.parseInt(sNum1);
                int nNum2 = Integer.parseInt(sNum2);

                Integer nResult = 0;
                if(rbMinus.isChecked()){
                    nResult = nNum1 - nNum2;
                }
                else if(rbMulti.isChecked()){
                    nResult = nNum1 * nNum2;
                }
                else if(rbDiv.isChecked()){
                    nResult = nNum1 / nNum2;
                }

                //Integer nResult = nNum1 + nNum2;
                //tvResult.setText(nResult.toString());

                //int nResult = nNum1 + nNum2;
                tvResult.setText(nResult + "");
            }
        });
    }
}