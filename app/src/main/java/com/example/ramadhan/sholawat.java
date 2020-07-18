package com.example.ramadhan;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class sholawat extends AppCompatActivity {
    private WebView websholawat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_sholawat);

        websholawat = (WebView) findViewById(R.id.web_sholawat);
        websholawat.setWebViewClient(new WebViewClient());
        websholawat.loadUrl("https://kumpulanshoawatnabi.blogspot.com");

        WebSettings webSettings = websholawat.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setGeolocationEnabled(true);
        webSettings.setAllowContentAccess(true);
    }

    @Override
    public void onBackPressed() {
        if (websholawat.canGoBack()) {
            websholawat.goBack();
        } else {
            super.onBackPressed();
        }
    }
}