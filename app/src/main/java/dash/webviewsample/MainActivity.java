package dash.webviewsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.webview);
        webView.loadUrl("https://play.google.com/store?hl=en");  // your url inside( " ")

        //  It will force  the link and redirects to open in the WebView instead of in a browser.
        webView.setWebViewClient(new WebViewClient());


    }
}
