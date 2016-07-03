package android.nssapp;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by DIVYA on 5/23/2016.
 */
public class About extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_fragment);
        WebView browser = (WebView) findViewById(R.id.webview);
        browser.loadUrl("http://nsssnist.in/aboutus.php");
    }
}
