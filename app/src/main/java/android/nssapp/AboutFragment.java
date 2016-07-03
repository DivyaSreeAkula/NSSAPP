package android.nssapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class AboutFragment extends Fragment
{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_home_fragment, container, false);
        WebView browser = (WebView)view. findViewById(R.id.webview);
        browser.loadUrl("http://nsssnist.in/aboutus.php");
        return view;
    }
    /*@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_fragment);
        WebView browser = (WebView)findViewById(R.id.webview);
        browser.loadUrl("http://nsssnist.net16.net/about.html");
        return;
    }*/

}
