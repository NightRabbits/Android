package com.example.mystudy3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ViewFlipper;

public class TestFlipperActivity extends AppCompatActivity {

    Button btPrev, btNext, btOk, btLogin;
    EditText edtUserName, edtUserID,edtUserPwd, edtInputID, edtInputPwd;
    ViewFlipper vfMyTest;

    public void InitFindview() {
        btPrev = findViewById(R.id.bt_Prev);
        btNext = findViewById(R.id.bt_Next);
        vfMyTest = findViewById(R.id.vf_MyTest);
        btOk = findViewById(R.id.bt_Ok);
        btLogin = findViewById(R.id.bt_Login);
        edtUserName = findViewById(R.id.edt_UserName);
        edtUserID = findViewById(R.id.edt_UserID);
        edtUserPwd = findViewById(R.id.edt_UserPwd);
        edtInputID = findViewById(R.id.edt_InputID);
        edtInputPwd = findViewById(R.id.edt_InputPwd);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_flipper);

        InitFindview();
    }
    public void onPrevClick(View view) {
        vfMyTest.showPrevious();
    }
    public void onNextClick(View view) {
        vfMyTest.showNext();
    }
}