package com.pefjs.gametoolspefjs;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        WebView w = findViewById(R.id.webView_tools);
        w.getSettings().setJavaScriptEnabled(true);
        w.setWebViewClient(new ToolView(this));
        w.loadUrl("http://game-tools-b10c1.firebaseapp.com/game");
    }

    private class ToolView extends WebViewClient {

        private Activity activity;

        public ToolView(Activity activity) {
            this.activity = activity;
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView webView, String url) {
            if(url.indexOf("game-tools-b10c1.firebaseapp.com") > -1 ) return false;
            return true;
        }

    }
}
