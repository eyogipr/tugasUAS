package com.example.ramadhan.kiblat;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.ramadhan.R;

import androidx.appcompat.app.AppCompatActivity;

public class layout_kiblat extends AppCompatActivity {
    private WebView webkiblat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_kiblat);

        webkiblat = (WebView) findViewById(R.id.web_kiblat);
        webkiblat.setWebViewClient(new WebViewClient());
        webkiblat.loadUrl("https://qiblafinder.withgoogle.com/intl/id/");

        WebSettings webSettings = webkiblat.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setGeolocationEnabled(true);
        webSettings.setAllowContentAccess(true);



    }

    @Override
    public void onBackPressed() {
        if (webkiblat.canGoBack()) {
            webkiblat.goBack();
        } else {
            super.onBackPressed();
        }
    }
}