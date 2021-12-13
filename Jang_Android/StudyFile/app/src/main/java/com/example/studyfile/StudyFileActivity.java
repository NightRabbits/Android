package com.example.studyfile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;

public class StudyFileActivity extends AppCompatActivity {

    TextView tvUser, tvPass;
    EditText edWriteUser, edWritePass;
    Button btnWrite, btnRead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_file);

        AtomicInteger userLength = new AtomicInteger();
        AtomicInteger passLength = new AtomicInteger();

        edWritePass = findViewById(R.id.ed_writePass);
        edWriteUser = findViewById(R.id.ed_writeUser);
        btnWrite = findViewById(R.id.btn_Write);
        btnRead = findViewById(R.id.btn_Read);
        tvUser = findViewById(R.id.tv_User);
        tvPass = findViewById(R.id.tv_Pass);

        btnWrite.setOnClickListener(view -> {
            String sUser = edWriteUser.getText().toString();
            String sPass = edWritePass.getText().toString();
            userLength.set(sUser.length());
            passLength.set(sPass.length());

            Toast.makeText(getApplicationContext(),sUser,Toast.LENGTH_SHORT).show();
            Toast.makeText(getApplicationContext(),sPass,Toast.LENGTH_SHORT).show();

            try {
                FileOutputStream outputStream = openFileOutput("userfile.txt", Context.MODE_PRIVATE);

                outputStream.write(sUser.getBytes(StandardCharsets.UTF_8),0, userLength.get());
                outputStream.write(sPass.getBytes(StandardCharsets.UTF_8),0, passLength.get());

                outputStream.close();
                Toast.makeText(getApplicationContext(),"userfile.txt 생성",Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(),"Error: IOException",Toast.LENGTH_SHORT).show();
            }

        });

        btnRead.setOnClickListener(view -> {
            try {
                FileInputStream inputStream = openFileInput("userfile.txt");

                byte[] baUser = new byte[userLength.get()];
                byte[] baPass = new byte[passLength.get()];

                inputStream.read(baUser);
                inputStream.read(baPass);
                inputStream.close();

                String sUser = new String(baUser);
                String sPass = new String(baPass);

                tvUser.setText(sUser);
                tvPass.setText(sPass);
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(),"Error: IOException",Toast.LENGTH_SHORT).show();
            }
        });
    }
}