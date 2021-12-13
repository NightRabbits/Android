package com.example.mystudy3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class WebTestActivity extends AppCompatActivity {

    EditText edUrl;
    Button btGo, btBack;
    WebView wvWeb;

    public void InitFindview() {
        edUrl = findViewById(R.id.ed_Url);
        btGo = findViewById(R.id.bt_Go);
        btBack = findViewById(R.id.bt_Back);
        wvWeb = findViewById(R.id.wv_Web);
    }

    public void onGoButtonClick(View view){
        wvWeb.loadUrl(edUrl.getText().toString().trim());
    }

    public void onBackButtonClick(View view){
        wvWeb.goBack();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_test);

        InitFindview();

        wvWeb.setWebViewClient(new MyWebViewClient());

        WebSettings webSet = wvWeb.getSettings();
        webSet.setBuiltInZoomControls(true);
        webSet.setJavaScriptEnabled(true);


    }
    class MyWebViewClient extends WebViewClient{

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return super.shouldOverrideUrlLoading(view, request);
        }
    }
}