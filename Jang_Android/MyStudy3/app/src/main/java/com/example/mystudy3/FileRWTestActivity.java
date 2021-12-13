package com.example.mystudy3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileRWTestActivity extends AppCompatActivity {

    Button btWrite, btRead;
    EditText edWUserID, edWPwd;
    TextView tvRUserID, tvRPwd;

    String sWUserID, sWPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_rwtest);

        edWUserID = findViewById(R.id.ed_WUserID);
        edWPwd = findViewById(R.id.ed_WPwd);
        btWrite = findViewById(R.id.bt_Write);
        tvRUserID = findViewById(R.id.tv_RUserID);
        tvRPwd = findViewById(R.id.tv_RPwd);
        btRead = findViewById(R.id.bt_Read);

        btRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    FileInputStream FiMyFile = openFileInput("UserFile.txt");
                    byte[] baUserID = new byte[sWUserID.length()];
                    byte[] baPwd = new byte[sWPwd.length()];

                    FiMyFile.read(baUserID);
                    FiMyFile.read(baPwd);

                    String sRUserID = new String(baUserID);
                    String sRPwd = new String(baPwd);

                    tvRUserID.setText(sRUserID);
                    tvRPwd.setText(sRPwd);

                    FiMyFile.close();

                } catch(IOException e) {
                    Toast.makeText(getApplicationContext(), "파일 없음", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sWUserID = edWUserID.getText().toString();
                String sWPwd = edWPwd.getText().toString();

                Toast.makeText(getApplicationContext(), sWUserID, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), sWPwd, Toast.LENGTH_SHORT).show();

                try {
                    FileOutputStream FoMyFile = openFileOutput("UserFile.txt", Context.MODE_PRIVATE);
                    FoMyFile.write(sWUserID.getBytes(), 0, sWUserID.length());
                    FoMyFile.write(sWPwd.getBytes(), 0, sWPwd.length());

                    FoMyFile.close();

                    Toast.makeText(getApplicationContext(), "UserFile.txt 생성", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    Toast.makeText(getApplicationContext(), "파일 생성불가", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}