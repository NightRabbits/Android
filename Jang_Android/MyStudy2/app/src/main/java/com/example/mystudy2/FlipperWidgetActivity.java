package com.example.mystudy2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FlipperWidgetActivity extends AppCompatActivity {
    Button btNext, btPrev, btConfirm, btSave;
    ViewFlipper flipper;
    EditText edPhoneNo, edBirthday, edSavePhoneNo, edSaveBirthday;
    TextView tvResult;

    private void InitFindView() {
        flipper = findViewById(R.id.Flipper);
        btNext = findViewById(R.id.btNext);
        btPrev = findViewById(R.id.btPrev);
        btConfirm = findViewById(R.id.btConfirm);
        btSave = findViewById(R.id.btSave);
        edPhoneNo = findViewById(R.id.edPhoneNo);
        edBirthday = findViewById(R.id.edBirthday);
        edSavePhoneNo = findViewById(R.id.edSavePhone);
        edSaveBirthday = findViewById(R.id.edSaveBirthday);
        tvResult = findViewById(R.id.tvResult);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flipper_widget);

        InitFindView();
    }

    public void onNextClick(View view) {
        flipper.showNext();
    }

    public void onPrevClick(View view) {
        flipper.showPrevious();
    }

    public void onConfirmClick(View view) {
        String data = readFromFile(getApplicationContext());
    }

    public void onSaveClick(View view) {
        String strPhoneNo = edSavePhoneNo.getText().toString();
        String strBirthday = edSaveBirthday.getText().toString();
        String data = strPhoneNo + "," + strBirthday;
        try {
            writeToFile(data, getApplicationContext());
        } catch (IOException e) {
            Toast.makeText(getApplicationContext(),"File write failed",Toast.LENGTH_SHORT).show();
            Log.e("IOException", "File write failed: " + e.getMessage());
        }
    }

    private void writeToFile(String data, @NonNull Context context) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput("data.txt", Context.MODE_PRIVATE));
        outputStreamWriter.write(data);
        outputStreamWriter.close();
    }

    private String readFromFile(Context context) {

        String ret = "";

        try {
            InputStream inputStream = context.openFileInput("data.txt");

            if ( inputStream != null ) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String receiveString = "";
                StringBuilder stringBuilder = new StringBuilder();

                while ( (receiveString = bufferedReader.readLine()) != null ) {
                    stringBuilder.append("\n").append(receiveString);
                }

                inputStream.close();
                ret = stringBuilder.toString();
            }
        }
        catch (FileNotFoundException e) {
            Log.e("FileNotFoundException", "File not found: " + e.toString());
        } catch (IOException e) {
            Log.e("IOException", "Can not read file: " + e.toString());
        }

        return ret;
    }
}