package com.example.ramadhan;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class alquran extends AppCompatActivity {
    private WebView webalquran;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_alquran);

        webalquran = (WebView) findViewById(R.id.web_alquran);
        webalquran.setWebViewClient(new WebViewClient());
        webalquran.loadUrl("https://quran.kemenag.go.id/");

        WebSettings webSettings = webalquran.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setGeolocationEnabled(true);
        webSettings.setAllowContentAccess(true);
    }

    @Override
    public void onBackPressed() {
        if (webalquran.canGoBack()) {
            webalquran.goBack();
        } else {
            super.onBackPressed();
        }
    }
}