package com.example.appstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnWidget, btnTest1, btnTest2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWidget = findViewById(R.id.btn_widget);
        btnTest1 = findViewById(R.id.btn_test1);
        btnTest2 = findViewById(R.id.btn_Test2);

        btnWidget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this,WidgetActivity.class);
                startActivity(myIntent);
            }
        });

        btnTest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this,Test1Activity.class);
                startActivity(myIntent);
            }
        });

        btnTest2.setOnClickListener(view -> {
            Intent myIntent = new Intent(MainActivity.this,Test2Activity.class);
            startActivity(myIntent);
        });
    }
}