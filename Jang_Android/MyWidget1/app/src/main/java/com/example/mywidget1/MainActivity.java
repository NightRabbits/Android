package com.example.mywidget1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btWidgetTest1, btWidgetTest2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btWidgetTest1 = findViewById(R.id.btn_WidgetTest1);
        btWidgetTest2 = findViewById(R.id.btn_WidgetTest2);

        btWidgetTest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MyInent = new Intent(MainActivity.this, W)
            }
        });
    }
}