package com.example.ramadhan;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class lain extends AppCompatActivity {
    private WebView weblain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_lain);

        weblain = (WebView) findViewById(R.id.web_lain);
        weblain.setWebViewClient(new WebViewClient());
        weblain.loadUrl("https://wisatanabawi.com/");

        WebSettings webSettings = weblain.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setGeolocationEnabled(true);
        webSettings.setAllowContentAccess(true);
    }

    @Override
    public void onBackPressed() {
        if (weblain.canGoBack()) {
            weblain.goBack();
        } else {
            super.onBackPressed();
        }
    }
}