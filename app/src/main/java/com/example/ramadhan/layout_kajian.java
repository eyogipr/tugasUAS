package com.example.ramadhan;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class layout_kajian extends AppCompatActivity {
    private WebView webkajian;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_kajian);

        webkajian = (WebView) findViewById(R.id.web_kajian);
        webkajian.setWebViewClient(new WebViewClient());
        webkajian.loadUrl("https://www.pesantrenalirsyad.org/category/artikel-islam/");

        WebSettings webSettings = webkajian.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setGeolocationEnabled(true);
        webSettings.setAllowContentAccess(true);
    }

    @Override
    public void onBackPressed() {
        if (webkajian.canGoBack()) {
            webkajian.goBack();
        } else {
            super.onBackPressed();
        }
    }
}