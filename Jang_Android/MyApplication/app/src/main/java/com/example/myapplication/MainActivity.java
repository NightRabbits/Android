package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox chkPhone, chkNoteBook, chkResult;
    EditText edtPhoneNum, edtNoteBookNum;
    RadioButton rbCard, rbCash, rbSend;
    Button btnOk, btnReset;
    TextView tvSendNum, tvPhone, tvNoteBook, tvHow, tvResult;
    String PhoneNum;
    String NoteBookNum;
    int Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkPhone = findViewById(R.id.chk_Phone);
        chkNoteBook = findViewById(R.id.chk_NoteBook);
        chkResult = findViewById(R.id.chk_Result);
        edtPhoneNum = findViewById(R.id.edt_PhoneNum);
        edtNoteBookNum = findViewById(R.id.edt_NoteBookNum);
        rbCard = findViewById(R.id.rb_Card);
        rbCash = findViewById(R.id.rb_Cash);
        rbSend = findViewById(R.id.rb_Send);
        btnOk = findViewById(R.id.btn_Ok);
        btnReset = findViewById(R.id.btn_Reset);
        tvSendNum = findViewById(R.id.tv_SendNum);
        tvPhone = findViewById(R.id.tv_Phone);
        tvNoteBook = findViewById(R.id.tv_NoteBook);
        tvHow = findViewById(R.id.tv_How);
        tvResult = findViewById(R.id.tv_Result);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(chkResult.isChecked()){


                    Result = Integer.parseInt(PhoneNum) * 2000 + Integer.parseInt(NoteBookNum) * 3000;
                    tvResult.setText("결제 금액 : "+Result);

                }

            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent mIntent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(mIntent);
            }
        });

        chkPhone.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(chkPhone.isChecked()){
                    PhoneNum = edtPhoneNum.getText().toString();
                    tvPhone.setText("핸드폰 :"+PhoneNum);

                }
            }
        });
        chkNoteBook.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(chkNoteBook.isChecked()) {
                    NoteBookNum = edtNoteBookNum.getText().toString();
                    tvNoteBook.setText("노트북 :" + NoteBookNum);
                }
            }
        });
        rbCard.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(rbCard.isChecked()){
                    tvSendNum.setVisibility(View.INVISIBLE);
                    tvHow.setText("결제 방법 : 카드");
                }
            }
        });
        rbCash.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(rbCash.isChecked()){
                    tvSendNum.setVisibility(View.INVISIBLE);
                    tvHow.setText("결제 방법 : 현금");
                }
            }
        });
        rbSend.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(rbSend.isChecked()){
                    tvSendNum.setVisibility(View.VISIBLE);
                    tvHow.setText("결제 방법 : 계좌이체");
                }


            }
        });

    }
}