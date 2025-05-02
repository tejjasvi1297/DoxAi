package com.example.doxai;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        webView = new WebView(this);
        setContentView(webView);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://www.w3schools.com/html/html_forms.asp"); // example form

        webView.postDelayed(() -> {
            webView.evaluateJavascript(
                    "document.getElementsByName('firstname')[0].value='John';" +
                            "document.getElementsByName('lastname')[0].value='Doe';", null
            );
        }, 3000); // wait 3 seconds to load
    }
}
