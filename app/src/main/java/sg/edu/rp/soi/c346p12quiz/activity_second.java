package sg.edu.rp.soi.c346p12quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class activity_second extends AppCompatActivity {
    WebView wvMyPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        wvMyPage = findViewById(R.id.webview);
        Intent intentReceived = getIntent();
        String value = intentReceived.getStringExtra("value");
        wvMyPage = findViewById(R.id.webview);
        wvMyPage.setWebViewClient(new WebViewClient());
        wvMyPage.getSettings().setJavaScriptEnabled(true);
        wvMyPage.getSettings().setAllowFileAccess(false);
        wvMyPage.getSettings().setBuiltInZoomControls(true);
        wvMyPage.loadUrl(value);
    }
}
