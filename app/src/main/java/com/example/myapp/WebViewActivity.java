package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class WebViewActivity extends AppCompatActivity {
    WebView webView;
EditText editText;
Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webView=(WebView)findViewById(R.id.webView);
        editText=(EditText)findViewById(R.id.webedittext);
        b=(Button)findViewById(R.id.webbutton);


        webView.setWebViewClient(new WebViewClient());
    b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View V) {
            String url=editText.getText().toString();

            webView.getSettings().setLoadsImagesAutomatically(true);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
            webView.loadUrl("https://www."+url+".com");



        }
    });

    }

    public void gotoweb(View view) {




    }
}