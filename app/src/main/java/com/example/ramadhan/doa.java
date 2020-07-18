package com.example.ramadhan;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class doa extends AppCompatActivity {
    private WebView webdoa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_doa);

        webdoa = (WebView) findViewById(R.id.web_doa);
        webdoa.setWebViewClient(new WebViewClient());
        webdoa.loadUrl("https://doasantri9.blogspot.com/");

        WebSettings webSettings = webdoa.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setGeolocationEnabled(true);
        webSettings.setAllowContentAccess(true);
    }

    @Override
    public void onBackPressed() {
        if (webdoa.canGoBack()) {
            webdoa.goBack();
        } else {
            super.onBackPressed();
        }
    }
}